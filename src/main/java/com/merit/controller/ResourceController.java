package com.merit.controller;

import com.merit.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @Autowired
    private Resource resource;

    @RequestMapping("/getResource")
    public Resource getResource() {
        Resource bean = new Resource();
        //把resource的值托付给bean
        BeanUtils.copyProperties(resource, bean);
        return bean;
    }
}
