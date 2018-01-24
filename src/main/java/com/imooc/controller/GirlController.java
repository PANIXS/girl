package com.imooc.controller;

import com.imooc.domain.Girl;
import com.imooc.domain.Result;
import com.imooc.respository.GirlRespository;
import com.imooc.service.GirlService;
import com.imooc.utils.ResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Resource
    private GirlRespository girlRespository;
    @Resource
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRespository.findAll();
    }

    /**
     * 添加一个女生

     * @return
     */
    @PostMapping(value = "girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
           return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

       return ResultUtil.success(girlRespository.save(girl));
    }

    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRespository.findOne(id);
    }



    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRespository.findByAge(age);
    }

    @GetMapping(value = "/getAge")
    public void getAge( @RequestParam("id")  Integer id)throws Exception{

        girlService.getAge(id);
    }


}
