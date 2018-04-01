package com.tangbaobao.dao;

import com.tangbaobao.pojo.Business;
import com.tangbaobao.pojo.ChargeDetail;
import com.tangbaobao.pojo.QueryVo;

import java.util.List;

/**
 * @author 唐学俊
 * @create 2018/01/31
 **/
public interface AllocateBusinessDao {
    /**
     * 加载收费项目
     * @return
     */
    List<Business> loadChargeItems();

    /**
     * 修改收费详情
     * @param chargeDetail
     */
    void updateChargeDetail(ChargeDetail chargeDetail);

    /**
     * 修改收费项目
     * @param business
     */
    void updateChargeItems(QueryVo business);

    /**
     * 加载全部项
     * @return
     */
    List<Business> loadchargeItems();
}
