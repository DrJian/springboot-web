package com.hongjian.springbootweb.dal.mapper;

import com.hongjian.springbootweb.dal.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 不需要xml配置对应的mybatisi使用
 *
 * @author hongjian
 * @date 2018/8/5
 */
@Mapper
public interface UserMapperWithoutXml {

    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Select("select * from user_info where id = #{id}")
    UserPO selectById(@Param("id") Long id);
}
