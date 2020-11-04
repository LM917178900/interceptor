package com.example.demo.controller;

import com.example.demo.note.Mytest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: MyController
 * @author: leiming5
 * @date: 2020-10-26 14:56
 */
@RestController
public class MyController {

    @Mytest(value = "true")
    @RequestMapping(value = "/test1/{id}", method = RequestMethod.GET)
    public  String getById(@PathVariable("id") Long id) {
        System.out.println("请求成功");
        return "1";
    }


}
