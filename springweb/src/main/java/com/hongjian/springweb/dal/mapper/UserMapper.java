package com.hongjian.springweb.dal.mapper;

import com.hongjian.springweb.dal.po.UserPO;
import org.apache.ibatis.annotations.Param;

/**
 * @author hongjian
 * @date 2018/8/3
 */
public interface UserMapper {
    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    UserPO selectById(@Param("id") Long id);
}
