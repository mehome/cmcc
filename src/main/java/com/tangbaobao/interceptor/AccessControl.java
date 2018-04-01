package com.tangbaobao.interceptor;

import com.tangbaobao.pojo.Operator;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆权限控制
 *
 * @author 唐学俊
 * @create 2018/01/31
 **/

public class AccessControl implements HandlerInterceptor {
    /**
     * 在请求之前执行此方法
     * 拦截请求,未登陆用户重定向到登陆页面
     * 思路:
     * 1.利用session获取用户
     * 2.校验session是否为空
     * 3.不为空,则返回true,否则返回false
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Operator operator = null;

        //判断为空
        if (session.getAttribute("operator") != null) {

            operator = (Operator) session.getAttribute("operator");
        }

        if (operator != null) {
            return true;
        }
        response.sendRedirect(request.getContextPath()+"/index.action");
        return false;
    }


    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
