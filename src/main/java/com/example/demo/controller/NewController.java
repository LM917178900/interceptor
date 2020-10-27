package com.example.demo.controller;

import com.example.demo.note.Mytest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: NewController
 * @author: leiming5
 * @date: 2020-10-26 14:00
 */
@Controller
public class NewController {

    /**
     * Home page controller
     *
     * @return Homepage (jsp)
     */
    @Mytest("synchronizeAllReport")
    @GetMapping("/test")
    public String embedReportHome(@RequestParam String xx) {

        System.out.println("xxxxxxxxxxxxxx");
        // Return homepage JSP view
        return new String(xx);
    }
}
