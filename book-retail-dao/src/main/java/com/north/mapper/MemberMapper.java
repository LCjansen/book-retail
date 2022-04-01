package com.north.mapper;

import com.north.dto.AddMemberDto;
import com.north.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/29
 */
@Repository
public interface MemberMapper {
    int addMember(AddMemberDto addMemberDto);

    Member findById(@Param("userId")BigInteger userId);

    int updatePoint(@Param("userId")BigInteger userId, @Param("point") Integer point);
}
