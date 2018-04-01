package com.tangbaobao.dao;

import com.tangbaobao.pojo.Resource;
import com.tangbaobao.pojo.SectionNoType;

import java.util.List;

/**
 * dao层
 * @author 唐学俊
 * @create 2018/01/31
 **/
public interface ResourceManageDao {
    /**
     * 查找号码类型
     * @return
     */
    List<SectionNoType> findSectionNoType();

    /**
     * 添加资源
     * @param resource
     */
    void addResource(Resource resource);
}
