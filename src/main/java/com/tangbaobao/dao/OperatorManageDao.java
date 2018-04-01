package com.tangbaobao.dao;

import com.tangbaobao.pojo.Operator;

public interface OperatorManageDao {
    /**
     * 查找用户
     * @param operator
     * @return Operator
     */
    Operator findUser(Operator operator);
}
