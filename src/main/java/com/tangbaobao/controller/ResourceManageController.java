package com.tangbaobao.controller;

import com.tangbaobao.pojo.Resource;
import com.tangbaobao.pojo.SectionNoType;
import com.tangbaobao.service.ResourceManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 资源管理模块控制器
 *
 * @author 唐学俊
 * @create 2018/01/31
 **/

@Controller
public class ResourceManageController {

    /**
     * 注入service
     */
    @Autowired
    private ResourceManageService resourceManageService;


    /**
     * 加载号码类型列表
     *
     * @param map
     * @return
     */
    @RequestMapping("/resource/loadSectionNoType.action")
    public String findSectionNoType(ModelMap map) {

        //请求资源
        List<SectionNoType> sectionNoTypeList = resourceManageService.findSectionNoType();


        map.addAttribute("sectionNoTypeList", sectionNoTypeList);

        return  "resource";

    }

    /**
     * 添加资源
     * @param map
     * @return
     */
    @RequestMapping("/resource/addResource.action")
    public String addResource(Resource resource, ModelMap map, HttpSession session){
        //请求service
        resourceManageService.addResource(resource, session);

        return "resource";
    }

}
