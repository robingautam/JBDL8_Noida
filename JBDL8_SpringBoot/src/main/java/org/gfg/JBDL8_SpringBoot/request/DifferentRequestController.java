package org.gfg.JBDL8_SpringBoot.request;

import org.gfg.model.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class DifferentRequestController {

    @PostMapping("/post/text")
    public String simpleTextRequestBody(@RequestBody  String text){
        System.out.println(text);
        return "OK";
    }

    @PostMapping("/post/json")
    public String simpleTextRequestBody(@RequestBody Student text){
        System.out.println(text);
        return "OK";
    }

    @PostMapping("/post/xml")
    public String simpleTextRequestBodyXML(@RequestBody Student text){
        System.out.println(text);
        return "OK";
    }

    @PostMapping("/post/formurlencoded")
    public String simpleTextRequestBodyFormURLEncoded(@RequestParam("Name") String text, @RequestParam("Email") String email){
        System.out.println(text+" : "+email);
        return "OK";
    }

    @PostMapping("/post/formurlencoded/map")
    public String simpleTextRequestBodyFormURLEncodedWithMap(@RequestParam Map<String, String> map){
        System.out.println(map);
        return "OK";
    }

   /* @PostMapping("/post/form/file")
    public String simpleTextRequestBodyFormURLEncodedWithMap(@RequestParam MultipartRequest request){
        System.out.println(request.getFileMap());
        return "OK";
    }
    */

    @PostMapping("/post/form/file")
    public String simpleTextRequestBodyFormURLEncodedWithMap(@RequestParam MultipartFile request){
        try {
            File file = new File("C:/Users/Administrator/Documents/JBDL8/GFGLogo.jpeg");
            FileOutputStream fos = new FileOutputStream(file);

            fos.write(request.getBytes()
            );

            System.out.println("File Copied");
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "OK";
    }

    @GetMapping("/get/student/{id}")
    public Student getStudetParams(@PathVariable("id") int id){
        List<Student> list = Arrays.asList(new Student(1, "Robin", "robin@gmail.com"), new Student(2, "sagar", "sagar@gmail.com"));

        for (Student st: list){
            if (st.getId()==id){
                return st;
            }
        }
        return null;
    }







}
