package com.imooc.service;

import com.imooc.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
@Component
public class GirlServiceTest {

    @Resource
    private GirlService girlService;
    @Test
    public void findOne() {
        Girl girl = girlService.findOne(4);
        Assert.assertEquals(new Integer(13),girl.getAge());
    }
}