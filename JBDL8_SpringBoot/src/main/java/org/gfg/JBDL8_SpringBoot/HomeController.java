package org.gfg.JBDL8_SpringBoot;

import org.gfg.model.Student;
import org.springframework.core.env.PropertySource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class HomeController {

    @RequestMapping(path = "/get/hello", method = RequestMethod.POST)
    //@ResponseBody
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/get/hello/v2")
   // @ResponseBody
    public String helloV2(){
        return "Hello V2";
    }

    @RequestMapping(path = "/post/data", method = RequestMethod.POST)
    public String postData(@RequestBody Student student){
        System.out.println(student);

       return "Data Accepted";
    }

    @RequestMapping(path = "/get/student", method = RequestMethod.GET)
    public Student getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("Aakash");
        student.setEmail("aakash@gmail.com");
        return student;
    }

    @RequestMapping(path = "/get/student/xml",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public Student getStudentXML(){
        Student student = new Student();
        student.setId(1);
        student.setName("Aakash");
        student.setEmail("aakash@gmail.com");
        return student;
    }

    @RequestMapping(path = "/get/student/response")
    public ResponseEntity getResponse(){
        Student student = new Student();
        student.setId(1);
        student.setName("Aakash");
        student.setEmail("aakash@gmail.com");
        return new ResponseEntity(student, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(path = "/get/student/responseheader")
    public ResponseEntity getResponseWithHeaders(){
        Student student = new Student();
        student.setId(1);
        student.setName("Aakash");
        student.setEmail("aakash@gmail.com");

        HttpHeaders headers = new HttpHeaders();
        headers.add("key", "74636egdgsgst6e73et");

        return new ResponseEntity(student, headers, HttpStatus.OK);
    }







}
