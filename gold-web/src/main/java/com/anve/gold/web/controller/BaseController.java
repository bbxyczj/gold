package com.anve.gold.web.controller;

import com.alibaba.fastjson.JSON;
import com.anve.gold.common.bo.Result;
import com.anve.gold.common.exception.GoldException;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * created by zhengliu on 2018/6/15
 */
@Log4j2
@ControllerAdvice
public class BaseController {


    /**
     * 基于@ExceptionHandler异常处理
     */
    @ExceptionHandler
    public void exception(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        String url = request.getRequestURI();
        String param=JSON.toJSONString(request.getParameterMap());
        try {
            if (ex instanceof GoldException) {
                log.warn("Method[业务异常]请求url:{}，参数：{}，异常信息：{}", url, param, ((GoldException) ex).getMsg(), ex);
                response.getWriter().print(JSON.toJSONString(new Result(((GoldException) ex).getCode(), ((GoldException) ex).getMsg())));
                response.flushBuffer();
                return;
            }
            log.warn("Method[系统异常]请求url:{}，参数：{}，异常信息：{}", url, param, ex.getMessage(), ex);
            response.getWriter().print(JSON.toJSONString(new Result("F0001", "系统异常")));
            response.flushBuffer();
        } catch (IOException e) {
            log.error("Method[exception]", e);
        }
    }


    protected Result success(Object t){
        return new Result(t);
    }
}
