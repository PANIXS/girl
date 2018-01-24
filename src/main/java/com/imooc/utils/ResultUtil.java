package com.imooc.utils;

import com.imooc.domain.Result;

public class ResultUtil {
    public static Result success(Object object){
        Result result = Result.builder().code(0).msg("成功").data(object).build();
        return result;
    }

    public static Result success(){
        return success(null);
    }
    public static Result error(Integer code , String msg){
        Result result = Result.builder().code(code).msg(msg).build();
        return result;
    }
}
