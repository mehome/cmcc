package com.tangbaobao.service;

import com.tangbaobao.pojo.Operator;

/**
 *
 *@author 唐学俊
 * @create 2018/1/31
 */

public interface OperatorManageService {
    /**
     * 查找用户
     * @param operator
     * @return
     */
    Operator findUser(Operator operator);
}
