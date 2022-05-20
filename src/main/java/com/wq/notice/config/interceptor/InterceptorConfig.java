package com.wq.notice.config.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class InterceptorConfig implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("处理web请求前，false代表不执行接下来操作");
        System.out.println("1=========>preHandle");
        HashMap<String,String> hashMap=new HashMap<>();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle方法在Handler 处理完 web 请求之后，并且在视图的解析和渲染之前执行，该方法无法阻止接下来的流程");
        System.out.println("2=========>postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion所有流程执行完毕后执行，该方法无法阻止接下来的流程");
        System.out.println("3=========>afterCompletion");
    }
}
