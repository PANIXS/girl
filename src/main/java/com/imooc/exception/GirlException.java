package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.*;

@Getter
@Setter
public class GirlException extends RuntimeException{
    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
