package com.zdxk.lbscache.component;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="lbs")
public class LbsConf {
    private String api;

    public String getApi() {
        return api;
    }

    public void setApi(String api){
        this.api = api;
    }
}
