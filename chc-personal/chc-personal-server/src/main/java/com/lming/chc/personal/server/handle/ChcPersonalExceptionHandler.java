package com.lming.chc.personal.server.handle;

import com.lming.chc.personal.server.exception.ChcPersonalProcessException;
import com.lming.chc.personal.server.exception.ChcPersonalServerException;

import com.lming.chc.personal.server.frontform.ResultVO;
import com.lming.chc.personal.server.frontform.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常捕获处理返回错误页面
 */

@ControllerAdvice
public class ChcPersonalExceptionHandler {


    /**
     * 用户信息鉴权异常跳转至登录页面
     * @return
     */
//    @ExceptionHandler(value = ChcAuthorizeException.class)
//    public ModelAndView handlerAuthorizeException(){
//
//        return new ModelAndView("redirect:"
//                .concat( projectUrlConfig.getWechatOpenAuthorizeUrl())
//                .concat("?returnUrl=").concat(projectUrlConfig.getSell())
//                .concat("/seller/login")
//        );
//    }

    /**
     *
     * 用户登录鉴权异常捕获，返回给前端返回码，前端进行跳转处理
     * json字符串
     * @return
     */
    @ExceptionHandler(value = ChcPersonalServerException.class)
    @ResponseBody
    public ResultVO handlerAuthorizeException(ChcPersonalServerException e){

        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }


    /**
     *
     * 用户登录鉴权异常捕获，返回给前端返回码，前端进行跳转处理
     * json字符串
     * @return
     */
    @ExceptionHandler(value = ChcPersonalProcessException.class)
    @ResponseBody
    public ResultVO handlerAuthorizeException(ChcPersonalProcessException e){

        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }



}
