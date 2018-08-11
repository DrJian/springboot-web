package com.hongjian.springweb.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hongjian
 * @date 2018/8/2
 */
@Data
@Component
@ConfigurationProperties(prefix = "conf")
public class ConfData {

    private Integer length;

    private String hard;
}
