package com.lming.chc.personal.server.exception;

import com.lming.chc.personal.server.enums.ChcPersonalEnum;
import lombok.Getter;

@Getter
public class ChcPersonalServerException extends RuntimeException {

    private Integer code;

    public ChcPersonalServerException(ChcPersonalEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public ChcPersonalServerException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

}
