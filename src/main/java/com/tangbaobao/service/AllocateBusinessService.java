package com.tangbaobao.service;

import com.tangbaobao.pojo.Business;
import com.tangbaobao.pojo.ChargeDetail;
import com.tangbaobao.pojo.QueryVo;

import java.util.List;

/**
 * @author 唐学俊
 * @create 2018/01/31
 * 配置业务费用业务模块
 **/
public interface AllocateBusinessService {
    /**
     * 加载收费项目
     * @return
     */
    List<Business> loadChargeItems();

    /**
     * 修改收费明细
     * @param chargeDetail
     */
    void updateChargeDetail(ChargeDetail chargeDetail);

    /**
     * 修改收覅项目
     * @param business
     */
    void updateChargeItems(QueryVo business);

    /**
     * 加载全部项
     * @return
     */
    List<Business> loadchargeItems();
}
