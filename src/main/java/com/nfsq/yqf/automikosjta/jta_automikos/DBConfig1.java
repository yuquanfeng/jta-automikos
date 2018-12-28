package com.nfsq.yqf.automikosjta.jta_automikos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by qfyu
 * Date:2018/12/28
 * Time:13:47
 **/
@ConfigurationProperties(prefix = "spring.datasource.test01")
@Setter
@Getter
@Component
public class DBConfig1 {
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
