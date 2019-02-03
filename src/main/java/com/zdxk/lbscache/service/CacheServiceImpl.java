package com.zdxk.lbscache.service;

import com.zdxk.lbscache.dao.BaseStationInfoMapper;
import com.zdxk.lbscache.model.BaseStationInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cacheService")
public class CacheServiceImpl implements CacheService {

    @Autowired
    BaseStationInfoMapper baseStationInfoMapper;

    @Override
    public void deleteExpiredCache(int expire){
        BaseStationInfoExample example = new BaseStationInfoExample();
        BaseStationInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCacheAgeGreaterThanOrEqualTo(String.valueOf(expire));
        baseStationInfoMapper.deleteByExample(example);

    }

    @Override
    public void increaseCacheAge(int age){
        baseStationInfoMapper.setCacheAgeIncrease(age);
    }
}
