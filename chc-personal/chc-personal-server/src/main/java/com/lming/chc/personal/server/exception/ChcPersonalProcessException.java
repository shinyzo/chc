package com.lming.chc.personal.server.exception;

import com.lming.chc.personal.server.enums.ChcPersonalEnum;
import lombok.Getter;

@Getter
public class ChcPersonalProcessException extends  RuntimeException {

    private Integer code;

    public ChcPersonalProcessException(ChcPersonalEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public ChcPersonalProcessException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }
}
