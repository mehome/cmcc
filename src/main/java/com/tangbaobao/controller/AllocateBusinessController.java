package com.tangbaobao.controller;

import com.tangbaobao.pojo.Business;
import com.tangbaobao.pojo.ChargeDetail;
import com.tangbaobao.pojo.QueryVo;
import com.tangbaobao.service.AllocateBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 配置业务费用
 *
 * @author 唐学俊
 * @create 2018/01/31
 **/
@Controller
public class AllocateBusinessController {
    /**
     * 注入service
     */
    @Autowired
    private AllocateBusinessService allocateBusinessService;

    @RequestMapping("/allocate/enterCharge.action")
    public String enterAllocate(ModelMap map) {
        return "charge";
    }

    /**
     * Ajax加载ChargeDetail
     *
     * @param map
     */
    @RequestMapping("/allocate/allocateBusiness.action")
    public @ResponseBody
    List<Business> loadChargeItems(ModelMap map) {

        //调用service
        List<Business> chargeDetailList = allocateBusinessService.loadChargeItems();

        System.out.println(chargeDetailList);

        return chargeDetailList;
    }


    /**
     * 修改收费
     *
     * @param chargeDetail
     * @param map
     * @return
     */
    @RequestMapping("/allocate/updateChargeDetail.action")
    public String updateChargeDetail(ChargeDetail chargeDetail) {

        allocateBusinessService.updateChargeDetail(chargeDetail);

        //弹出修改成功提示
        return "";
    }

    @RequestMapping("/allocate/loadchargeItems.action")
    public @ResponseBody
    List<Business> loadchargeItems() {

        List<Business> chargeDetailList = allocateBusinessService.loadchargeItems();

        return  chargeDetailList;
    }

    /**
     * 修改收费项目
     *
     * @param business
     * @return
     */
    @RequestMapping("/allocate/updateChargeItems.action")
    public String updateChargeItems(QueryVo business) {

        allocateBusinessService.updateChargeItems(business);

        System.out.println(business);

        //弹出修改成功提示
        return "";
    }


}
