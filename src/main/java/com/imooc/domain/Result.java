package com.imooc.domain;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

}
