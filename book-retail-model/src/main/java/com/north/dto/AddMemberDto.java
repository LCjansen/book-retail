package com.north.dto;

import lombok.Data;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@Data
public class AddMemberDto {
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
}
