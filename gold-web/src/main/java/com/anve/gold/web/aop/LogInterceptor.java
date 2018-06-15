package com.anve.gold.web.aop;


import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/**
 * created by zhengliu on 2018/6/14
 */
@Log4j2
public class LogInterceptor implements HandlerInterceptor {


    private static  ThreadLocal<Long>  startTime=new ThreadLocal<>();


    /**
     * 执行前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        startTime.set(System.currentTimeMillis());
        return true;
    }


    /**
     * 执行后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

        String remoteIp = request.getHeader("X-Real-IP");
        if (remoteIp == null) {
            remoteIp = request.getHeader("X-Forwarded-For");
        }
        if (remoteIp == null) {
            remoteIp = request.getRemoteAddr();
        }
        String uri = request.getRequestURI();
        String method = request.getMethod();

        // 日志内容
        StringBuilder sb = new StringBuilder();
        sb.append(" Ip:").append(remoteIp).append(" Port:").append(request.getRemotePort())
                .append(" Url:").append(uri).append(" Method:")
                .append(method).append(" time consuming: ").append(System.currentTimeMillis()-startTime.get())
                .append(" Param:{");

        Map<String, String[]> paramMap = request.getParameterMap();
        Iterator<Map.Entry<String, String[]>> iterator = paramMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String[]> entry = iterator.next();
            sb.append(entry.getKey()).append("=");
            for (Object obj : entry.getValue()) {
                sb.append(obj).append(",");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        log.info(sb.append("}"));
    }

}
