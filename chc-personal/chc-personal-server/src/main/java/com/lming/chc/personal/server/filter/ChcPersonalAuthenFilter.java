package com.lming.chc.personal.server.filter;


import com.lming.chc.personal.server.config.ChcConfig;
import com.lming.chc.personal.server.enums.ChcPersonalEnum;
import com.lming.chc.personal.server.exception.ChcPersonalServerException;
import com.rabbitmq.tools.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
@Order(1)
//重点
@WebFilter(filterName = "authenFilter", urlPatterns = "/*")
@Slf4j
public class ChcPersonalAuthenFilter implements Filter {

    @Autowired
    private ChcConfig chcConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String reqeustUri = request.getRequestURI();
        log.info("拦截到请求的URL:{}",reqeustUri);

        boolean enabled = chcConfig.isEnabled();

        // 拦截的url是否需要登录校验
        if(org.apache.commons.lang.StringUtils.isNotBlank(chcConfig.getSkipurl())
                && !checkUrl(reqeustUri))
        {
            sendResponse(response,"请求的url需要登录");
            return;
        }

        // 登录鉴权

        // 未登录提示用户需要登录



        filterChain.doFilter(request,response);

    }


    private boolean checkUrl(String requestUrl){

        String[]  skipUrlArray = chcConfig.getSkipurl().split(",");
        for(String skipUrl:skipUrlArray){
            if(requestUrl.equalsIgnoreCase(skipUrl)){
                return true;
            }
        }
        return false;
    }

    /**
     * 给客户端返回信息
     * @param response
     * @param msg
     */
    private void sendResponse(HttpServletResponse response,String msg){
        PrintWriter printWriter = null;
        try {
            printWriter = response.getWriter();
            printWriter.append("{code:1,msg:'2222'}");
            printWriter.flush();
        }catch(Exception e){

        }
        finally {
            printWriter.close();
        }
    }

    @Override
    public void destroy() {

    }
}
