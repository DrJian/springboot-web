package com.hongjian.springbootweb.dal.dao.impl;

import com.hongjian.springbootweb.dal.dao.UserDAO;
import com.hongjian.springbootweb.dal.mapper.UserMapper;
import com.hongjian.springbootweb.dal.po.UserPO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author hongjian
 * @date 2018/8/3
 */
@Repository("userDAO")
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserPO selectById(Long id) {
        return userMapper.selectById(id);
    }

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
