package com.north.member.impl;

import cn.hutool.core.lang.Assert;
import com.north.mapper.MemberMapper;
import com.north.dto.AddMemberDto;
import com.north.entity.Member;
import com.north.member.IMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@Service
public class MemberServiceImpl implements IMemberService {
    @Resource
    private MemberMapper memberMapper;

    public Integer addMember(AddMemberDto addMemberDto) {
        Assert.notNull(addMemberDto, "");
        return memberMapper.addMember(addMemberDto);
    }

    public Member findById(BigInteger userId) {
        return memberMapper.findById(userId);
    }
}
