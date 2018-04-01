package com.tangbaobao.service.impl;

import com.tangbaobao.dao.AllocateBusinessDao;
import com.tangbaobao.pojo.Business;
import com.tangbaobao.pojo.ChargeDetail;
import com.tangbaobao.pojo.QueryVo;
import com.tangbaobao.service.AllocateBusinessService;
import com.tangbaobao.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 唐学俊
 * @create 2018/01/31
 **/
@Service
public class AllocateBusinessServiceImpl implements AllocateBusinessService {

    /**
     * 注入dao
     */
    @Autowired
    private AllocateBusinessDao allocateBusinessDao;

    public  List<Business> loadChargeItems() {
        //调用dao
        return allocateBusinessDao.loadChargeItems();

    }

    public void updateChargeDetail(ChargeDetail chargeDetail) {
        //封装参数
        chargeDetail.setChargeId(CommonUtils.generateUUID());

        //调用dao
        allocateBusinessDao.updateChargeDetail(chargeDetail);
    }

    public void updateChargeItems(QueryVo business) {
        //调用dao
        allocateBusinessDao.updateChargeItems(business);

    }

    public List<Business> loadchargeItems() {
        return allocateBusinessDao.loadchargeItems();
    }
}
