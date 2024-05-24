package producing.JSON.springboot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import producing.JSON.springboot.models.Student;

import java.lang.reflect.Array;
import java.util.*;

@RestController
@RequestMapping()
public class studentController {

    /*
    We are receiving data in JSON format
    JSON --> java obj => deserialization
    java obj --> JSON => serialization
     */

    //1st ->
    @PostMapping("/createStudent")          // deserialization
    public Student createStudent(@RequestBody Student student){
        System.out.println(student);

        //store JSON data in variables
//        String name = student.getName();
//        String email = student.getEmail();
//        String phone = student.getPhone();
//        String course = student.getCourse();
//
//        System.out.println("Name:"+name);
//        System.out.println("Email:"+email);
//        System.out.println("Phone No.:"+phone);
//        System.out.println("Course:"+course);

        System.out.println(student);
        //return single Student object
        return student; // serialization
    }

    //2nd -> return single student object

    /*
    @PostMapping("/createStudents")
    public Student createStudents(@RequestBody List<Student> students){
        System.out.println(students);

        return students.get(0); //return 1st student object only
    }
     */

    // 3rd-> return pre define List datatype
//    @PostMapping("/createStudents")
//    public List<String> createStudents(@RequestBody List<Student> students){
//        System.out.println(students);
//
//        //pre define List datatype
//        List<String> foods = Arrays.asList("Piza","Burger");
//        return foods; // return list
//    }

    //4th -> return pre define Map datatype
    @PostMapping("/createStudents")
    public Map<String,Object> createStudents(@RequestBody List<Student> students){
        System.out.println(students);

        //pre define Map datatype
        Map<String,Object> data = new HashMap<>();
        data.put("content", students);
        data.put("error","no error");
        data.put("current data", new Date());
        data.put("System Information", System.getProperties());
        return data; // return Map
    }
}
