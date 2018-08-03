package com.hongjian.springbootweb.dal;

import lombok.Data;

/**
 * @author hongjian
 * @date 2018/8/3
 */
@Data
public class UserPO {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 你懂得
     */
    private String length;
}
