package com.brain.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author zheng haijain
 * @createTime 2020-01-08 14:54
 * @description
 */
@ConfigurationProperties(prefix = "test")
@Data
@Component
@PropertySource(value = "classpath:test.properties")        // 指明了使用哪个配置文件
public class ConfigBean {

    private String name;

    private String age;

}
