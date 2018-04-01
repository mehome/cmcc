package com.tangbaobao.service.impl;

import com.tangbaobao.dao.NewCustomerDao;
import com.tangbaobao.pojo.Certificate;
import com.tangbaobao.pojo.Customer;
import com.tangbaobao.service.NewCustomerService;
import com.tangbaobao.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewCustomerServiceImpl implements NewCustomerService {
    @Autowired
    private NewCustomerDao newCustomerServiceDao;

    public List<Certificate> findIdentify() {
       return  newCustomerServiceDao.findIdentify();
    }

    public void saveUser(Customer customer) {
        //封装id
        customer.setCustomerId(CommonUtils.generateUUID());
        newCustomerServiceDao.saveUser(customer) ;
    }

    public Customer checkPhoneNumber(String phoneNumber) {

        return newCustomerServiceDao.checkPhoneNumber(phoneNumber);
    }
}
