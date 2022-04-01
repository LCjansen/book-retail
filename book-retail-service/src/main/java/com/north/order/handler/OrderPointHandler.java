package com.north.order.handler;

import cn.hutool.core.util.StrUtil;
import com.north.constant.MemberType;
import com.north.dto.AddOrderDto;
import com.north.entity.Member;
import com.north.mapper.MemberMapper;
import com.north.member.IMemberService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/30
 */
@Service
public class OrderPointHandler {
    @Resource
    private IMemberService memberService;
    @Resource
    private MemberMapper memberMapper;
    private static final String LOCK_PREFIX = "LOCK_PREFIX_{}";

    @Async
    public void addPoint(AddOrderDto addOrderDto) {
        BigInteger userId = addOrderDto.getUserId();
        Member member = memberService.findById(userId);
        String lock = StrUtil.format(LOCK_PREFIX, userId);
        MemberType memberType = MemberType.findByCode(member.getMemberType());
        synchronized (lock) {
            Integer oriPoint = member.getPoint();
            Float newPoint = oriPoint + memberType.getPointMultiple() * addOrderDto.getOrderPrice().intValue();
            memberMapper.updatePoint(userId, newPoint.intValue());
        }
    }
}
