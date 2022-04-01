package com.north.entity;

import lombok.Data;

import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@Data
public class Member {
    /**
     * 主键
     */
    private BigInteger id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 会员类型
     */
    private Integer memberType;
    /**
     * 积分
     */
    private Integer point;
    /**
     * 是否删除
     */
    private Integer isDelete;
}
