package com.example.demo.note;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: Login
 * @author: leiming5
 * @date: 2020-10-26 14:57
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Bean
    public SessionInterceptor getSessionInterceptor() {
        System.out.println("bean加载了!");
        return new SessionInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSessionInterceptor());
        addInterceptor.addPathPatterns("/**");
    }

}