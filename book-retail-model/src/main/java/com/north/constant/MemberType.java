package com.north.constant;

import java.util.Arrays;
import java.util.Optional;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/29
 */
public enum MemberType {
    GOLD(10, "Gold", 3),
    SLIVER(20, "Silver", 2),
    COPER(30, "Coper", 1)
    ;

    MemberType(Integer code, String message, float pointMultiple) {
        this.code = code;
        this.message = message;
        this.pointMultiple = pointMultiple;
    }

    private Integer code;

    private String message;

    private float pointMultiple;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public float getPointMultiple() {
        return pointMultiple;
    }

    public static MemberType findByCode(Integer code) {
        Optional<MemberType> first = Arrays.stream(MemberType.values())
                .filter(p -> p.getCode().equals(code))
                .findFirst();
        return first.orElse(null);
    }
}
