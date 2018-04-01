package com.tangbaobao.service;

import com.tangbaobao.pojo.Resource;
import com.tangbaobao.pojo.SectionNoType;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 唐学俊
 *@create 2018/1/31
 */

public interface ResourceManageService {
    /**
     * 加载号码类型
     * @return
     */
    List<SectionNoType> findSectionNoType();

    /**
     * 添加资源
     * @param resource
     */
    void addResource(Resource resource, HttpSession session);
}
