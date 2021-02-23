package com.kgc.controller;

import com.kgc.pojo.Student;
import com.kgc.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
   private Student stu;

    @Autowired
    private Teacher teacher;


    //@RequestMapping(value = "/showteacher",method = RequestMethod.POST)
   // @PostMapping("/showteacher")
    @GetMapping("/showteacher")
    public Teacher getTeacher(){
        return teacher;
    }



    @RequestMapping("/showstu")
    public Student showstu(){

        return stu;
    }
    @RequestMapping("/show")
    public String show(){
        return "hello springboot";
    }
}
