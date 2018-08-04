package com.hongjian.springbootweb;

import com.hongjian.springbootweb.dal.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println(userMapper.selectById(1L) + ",\ncurrent class=SpringbootWebApplicationTests\nmethod=contextLoads");
    }

}
