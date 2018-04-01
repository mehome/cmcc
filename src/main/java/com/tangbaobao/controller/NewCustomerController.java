package com.tangbaobao.controller;

import com.tangbaobao.pojo.Certificate;
import com.tangbaobao.pojo.Customer;
import com.tangbaobao.service.NewCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewCustomerController {

    @Autowired
    private NewCustomerService newCustomerService;

    /**
     * 跳转以及添加用户模块
     * @param map
     * @return
     */
    @RequestMapping("/customer/findIdentify.action")
    public String findIdentify(ModelMap map){
        List<Certificate> list = newCustomerService.findIdentify();


        map.addAttribute("list",list);

        return "newCustomer";
    }

    @RequestMapping("/customer/newcustomer1.action")
    public String newcustomer1(){
        return "newCustomer1";
    }

    @RequestMapping("/customer/newUser.action")
    public String newUser(){
        return "newUser";
    }

    /**
     * 添加用户
     * @param customer
     * @return
     */
    @RequestMapping("/customer/saveUser.action")
    public String saveUser(Customer customer){

        //调用dao
        newCustomerService.saveUser(customer);
        return "saveInfo";
    }

    /**
     * Ajax判断电话号码是否存在
     * @param phoneNumber
     */
    @RequestMapping("/customer/checkUser.action")
    public @ResponseBody
    boolean checkPhoneNumber(@RequestBody @RequestParam(value = "phoneNumber") String phoneNumber){
        System.out.println(phoneNumber);

        Customer customer = newCustomerService.checkPhoneNumber(phoneNumber);

        if(customer != null){
            return false;
        }
        return true;
    }

}
