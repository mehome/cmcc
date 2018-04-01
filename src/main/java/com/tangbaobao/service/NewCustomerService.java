package com.tangbaobao.service;

import com.tangbaobao.pojo.Certificate;
import com.tangbaobao.pojo.Customer;

import java.util.List;

public interface NewCustomerService {
    /**
     * 加载身份
     * @return
     */
    List<Certificate> findIdentify();

    /**
     * 保存用户
     * @param customer
     */
    void saveUser(Customer customer);

    /**
     * 查找电话是否存在
     * @param phoneNumber
     * @return
     */
    Customer checkPhoneNumber(String phoneNumber);
}
