package com.tangbaobao.service.impl;

import com.tangbaobao.dao.OperatorManageDao;
import com.tangbaobao.pojo.Operator;
import com.tangbaobao.service.OperatorManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 唐学俊
 * @create 2018/01/31
 **/
@Service
public class OperatorManageServiceImpl implements OperatorManageService {

    /**
     * 注入dao
     */
    @Autowired
    private OperatorManageDao operatorMangeDao;

    /**
     * 查找用户
     * @param operator
     * @return
     */
    public Operator findUser(Operator operator) {
        //调用dao
       return  operatorMangeDao.findUser(operator);

    }
}
