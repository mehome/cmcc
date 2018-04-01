package com.tangbaobao.service.impl;

import com.tangbaobao.dao.ResourceManageDao;
import com.tangbaobao.pojo.Operator;
import com.tangbaobao.pojo.Resource;
import com.tangbaobao.pojo.SectionNoType;
import com.tangbaobao.service.ResourceManageService;
import com.tangbaobao.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 唐学俊
 * @create 2018/01/31
 **/
@Service
public class ResourceManageServiceImpl implements ResourceManageService {
    /**
     * 注入dao
     * @return
     */
    @Autowired
    private ResourceManageDao resourceManageDao;

    public List<SectionNoType> findSectionNoType() {
        //调用dao
        return resourceManageDao.findSectionNoType();
    }

    public void addResource(Resource resource,HttpSession session) {

        //获取用户
        Operator operator = (Operator) session.getAttribute("operator");

        //手动封装未封装的属性
        resource.setOperator(operator);
        String uuid = CommonUtils.generateUUID();
        resource.setResourceId(uuid);
        System.out.println(resource);


        //调用dao
        resourceManageDao.addResource(resource);

    }
}
