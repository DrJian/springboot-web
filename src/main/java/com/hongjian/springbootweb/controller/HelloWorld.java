package com.hongjian.springbootweb.controller;

import com.hongjian.springbootweb.dal.mapper.UserMapper;
import com.hongjian.springbootweb.dal.mapper.UserMapperWithoutXml;
import com.hongjian.springbootweb.model.ConfData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hongjian
 * @date 2018/8/2
 */
@RestController
public class HelloWorld {

    @Value("${user}")
    private String user;

    @Value("${sex}")
    private String sex;

    @Resource
    private ConfData confData;

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserMapperWithoutXml userMapperWithoutXml;

    @RequestMapping("/hello")
    public String hello() {
        return "hello youzan !" + this.user + " " + this.sex + " conf info:" + this.confData + ", user_info:" + userMapperWithoutXml.selectById(1L);
    }


}
