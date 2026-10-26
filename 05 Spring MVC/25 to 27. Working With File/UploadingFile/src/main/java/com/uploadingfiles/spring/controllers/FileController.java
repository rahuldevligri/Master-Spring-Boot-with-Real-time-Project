package com.uploadingfiles.spring.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

@RestController
@RequestMapping("/file")
public class FileController {
    Logger logger = LoggerFactory.getLogger(FileController.class);

    //upload single file
    @PostMapping("/single")
    public String singleFile(@RequestParam("image")MultipartFile file){
        logger.info("Name : {}", file.getName());
        logger.info("Content Type : {}", file.getContentType());
        logger.info("Original File Name : {}", file.getOriginalFilename());
        logger.info("File Size : {}", file.getSize());

        //File.getInputStream()
        /*
        InputStream inputStream = file.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("data.png");
        byte[] data = new byte[inputStream.available()];
        fileOutputStream.write(data);
        */

        return "File Uploaded";
    }

    //upload multiple files
    @PostMapping("/multiple")
    public String uploadMultiple(@RequestParam("files") MultipartFile[] files){
        Arrays.stream(files).forEach(file ->{
            logger.info("File Name: {}",file.getOriginalFilename());
            logger.info("File Type: {}",file.getContentType());
            logger.info("+++++++++++++++++++++++++++++++++++++++++++++++");
        });
        //call services to upload files and pass file object
        return "Handling Multiple Files";
    }

    //serve image file in response
    @GetMapping("/serve-image")
    public void serveImageHandler(HttpServletResponse response){
        try{
            InputStream fileInputStream = new FileInputStream("images/networking.jpeg");
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            StreamUtils.copy(fileInputStream, response.getOutputStream());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
