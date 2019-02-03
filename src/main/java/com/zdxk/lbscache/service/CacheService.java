package com.zdxk.lbscache.service;


public interface CacheService {

    void deleteExpiredCache(int expire);

    void increaseCacheAge(int age);

}
