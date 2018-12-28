package com.nfsq.yqf.automikosjta.jta_automikos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by qfyu
 * Date:2018/12/28
 * Time:13:54
 **/
@Setter
@Getter
@Component
@ConfigurationProperties("spring.datasource.test02")
public class DBConfig2 {
    private String url;
    private String username;
    private String password;
    private int minPoolSize;
    private int maxPoolSize;
    private int maxLifetime;
    private int borrowConnectionTimeout;
    private int loginTimeout;
    private int maintenanceInterval;
    private int maxIdleTime;
    private String testQuery;
}
