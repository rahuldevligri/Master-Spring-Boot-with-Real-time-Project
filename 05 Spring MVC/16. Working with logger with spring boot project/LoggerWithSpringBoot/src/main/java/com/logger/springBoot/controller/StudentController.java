package com.logger.springBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    Logger logger = LoggerFactory.getLogger(StudentController.class);

    //Query Parameter using @RequestParam
    @RequestMapping("/getStudent")
    public String getStudent(
            @RequestParam("studentId") int id,
            @RequestParam String studentName,
            @RequestParam(value="studentRegNo", defaultValue = "0", required = false) String regNo
    ){
        logger.info("Student ID: {} {}",id, "Testing argument");
        logger.warn("Student Name: {} ", studentName);
        logger.info("RegNo: {}", regNo);
        logger.debug("this is test for DEBUG");
        return "this is test for logger";
    }
}
