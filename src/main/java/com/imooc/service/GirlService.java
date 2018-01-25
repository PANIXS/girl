package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.respository.GirlRespository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GirlService {

    @Resource
    private GirlRespository girlRespository;

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRespository.findOne(id);
        Integer age = girl.getAge();
        if (age<10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age>10 && age  < 16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }

    }

    public Girl findOne(Integer id){
        return girlRespository.findOne(id);
    }
}
