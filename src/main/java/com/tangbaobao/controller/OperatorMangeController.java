package com.tangbaobao.controller;

import com.tangbaobao.pojo.Operator;
import com.tangbaobao.service.OperatorManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 对管理员操作
 */

@Controller
public class OperatorMangeController {
    /**
     * 注入Service
     */
    @Autowired
    private OperatorManageService operatorMangeService;

    /**
     * 系统入口
     *
     * @return
     */
    @RequestMapping("/index.action")
    public String entrance() {
        return "index";
    }
    @RequestMapping("/main.action")
    public String entranceMain() {
        return "main";
    }


    /**
     * 登陆校验
     *
     * @param operator
     * @return
     */
    @RequestMapping("/login.action")
    public String login(Operator operator, HttpSession session) {
        //请求service
        Operator returnOperator;
        returnOperator = operatorMangeService.findUser(operator);
        if (returnOperator != null) {

            //加入session中
            session.setAttribute("operator", returnOperator);
            //重定向到首页
            return "redirect:/main.action";
        }
        //重定向到登陆页面
        return "redirect:/index.action";
    }

    /**
     * 退出登陆,销毁session
     * @param map
     * @return
     */
    @RequestMapping("/logOut.action")
    public String logOut(ModelMap map,HttpSession session){

        if(session != null){
        session.invalidate();
        }

        return "redirdct:/index.action";
    }

}
