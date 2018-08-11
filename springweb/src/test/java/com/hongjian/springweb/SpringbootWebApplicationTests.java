package com.hongjian.springweb;

import com.hongjian.springweb.dal.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
//此注解仅在test时使用
@ActiveProfiles("local")
@SpringBootApplication
@ImportAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootWebApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println(userMapper.selectById(1L) + ",\ncurrent class=SpringbootWebApplicationTests\nmethod=contextLoads");
    }

}
