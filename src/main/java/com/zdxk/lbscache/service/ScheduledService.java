package com.zdxk.lbscache.service;

import com.zdxk.lbscache.component.LbsConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledService {

    @Autowired
    private CacheService cacheService;

    @Autowired
    LbsConf lbsConf;

    @Scheduled(cron="0 0 0 1/1 * ? *")
    public void cacheTask() {


        System.out.println("IncreaseCacheAge");
        cacheService.increaseCacheAge(1);

        System.out.println("Delete expired cache");
        cacheService.deleteExpiredCache(lbsConf.getExpire());

    }
}