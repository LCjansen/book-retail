package com.north.member;

import com.north.entity.Member;
import com.north.dto.AddMemberDto;

import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
public interface IMemberService {
    Integer addMember(AddMemberDto addMemberDto);

    Member findById(BigInteger userId);
}
