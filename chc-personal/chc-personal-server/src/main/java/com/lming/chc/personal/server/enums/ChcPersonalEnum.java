package com.lming.chc.personal.server.enums;

import lombok.Getter;

@Getter
public enum ChcPersonalEnum {

    NOT_ALLOW_LOGIN(1,"系统升级维护中！"),
    ;

    private Integer code;

    private String msg;

    ChcPersonalEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
