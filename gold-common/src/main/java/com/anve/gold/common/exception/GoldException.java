package com.anve.gold.common.exception;

import lombok.Data;

/**
 * created by zhengliu on 2018/6/14
 */
@Data
public class GoldException extends Exception{

    private String msg;

    private String code;


    public GoldException(String msg,String code){
        this.code=code;
        this.msg=msg;
    }

    public GoldException(String msg){
        this.msg=msg;
    }
}
