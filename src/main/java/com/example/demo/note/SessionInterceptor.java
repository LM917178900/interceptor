package com.example.demo.note;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: SessionInterceptor
 * @author: leiming5
 * @date: 2020-10-27 08:45
 */
public class SessionInterceptor extends HandlerInterceptorAdapter   {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("brefore ==================>");
        if(!(handler instanceof HandlerMethod)) {
            System.out.println(0);
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        Mytest methodAnnotation = handlerMethod.getMethodAnnotation(Mytest.class);
        if(methodAnnotation == null){
            System.out.println(1);
            return true;
        }
        String str = methodAnnotation.value();
        System.out.println("拦截value:"+str);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("after<=======*=======*========*======华丽的请求分割线======*=========*========*=======>");
    }
}
