package com.brain.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zheng haijain
 * @createTime 2020-01-08 14:40
 * @description
 */
@Component
@Data
public class BlogProperties {

    @Value("${mrbird.blog.name}")
    private String name;

    @Value("${mrbird.blog.title}")
    private String title;

}
