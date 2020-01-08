package com.brain.controller;

import com.brain.bean.ConfigBean;
import com.brain.bean.BlogProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zheng haijain
 * @createTime 2020-01-08 14:42
 * @description
 */
@RestController
public class IndexController {

    @Resource
    private BlogProperties blogProperties;

    @Resource
    private ConfigBean configBean;

    @GetMapping
    public String index() {
        return configBean.getName()+"——"+configBean.getAge();
    }

}
