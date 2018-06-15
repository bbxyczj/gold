package com.anve.gold.common.bo;

import lombok.Data;

/**
 * created by zhengliu on 2018/6/15
 */
@Data
public class Result<T> {



    private T data;

    private String msg;

    private String code;

    private Boolean success;


    public Result(T data){
        this.data=data;
        this.success=Boolean.TRUE;
    }

    public Result(String msg ,String code){
        this.success=Boolean.FALSE;
        this.msg=msg;
        this.code=code;
    }

}
