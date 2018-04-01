package com.tangbaobao.dao;

import com.tangbaobao.pojo.Certificate;
import com.tangbaobao.pojo.Customer;

import java.util.List;

public interface NewCustomerDao {
    /**
     * 加载身份
     * @return
     */
    List<Certificate> findIdentify();

    /**
     * 添加用户
     * @param customer
     */
    void saveUser(Customer customer);

    /**
     * 查找电话号码
     * @param phoneNumber
     * @return
     */
    Customer checkPhoneNumber(String phoneNumber);
}
