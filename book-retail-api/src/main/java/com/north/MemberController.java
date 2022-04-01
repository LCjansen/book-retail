package com.north;

import com.north.dto.AddMemberDto;
import com.north.element.ApiResponse;
import com.north.member.IMemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private IMemberService iMemberService;

    @ApiOperation("新建用户")
    @PostMapping("/add")
    public ApiResponse<Integer> addMember(@RequestBody AddMemberDto addMemberDto) {
        return ApiResponse.success(iMemberService.addMember(addMemberDto));
    }
}
