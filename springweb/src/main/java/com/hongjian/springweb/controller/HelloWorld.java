package com.hongjian.springweb.controller;

import com.hongjian.springweb.dal.mapper.UserMapper;
import com.hongjian.springweb.dal.mapper.UserMapperWithoutXml;
import com.hongjian.springweb.model.ConfData;
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

    @Value("${user_name}")
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
        return "hello youzan !" + user + " " + sex + " conf info:" + confData + ", user_info:" + userMapper.selectById(1L);
    }


}
