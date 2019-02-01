package com.zdxk.lbscache.service;

import com.zdxk.lbscache.dao.BaseStationInfoMapper;
import com.zdxk.lbscache.model.BaseStationInfo;
import com.zdxk.lbscache.model.BaseStationInfoExample;
import com.zdxk.lbscache.model.LbsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "baseStationInfoService")
public class BaseStationInfoServiceImpl implements BaseStationInfoService{

    @Autowired
    private BaseStationInfoMapper baseStationInfoMapper;

    @Override
    public boolean hitCache(LbsData lbsData){
        BaseStationInfoExample example = new BaseStationInfoExample();
        BaseStationInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCiEqualTo(lbsData.getCi());
        criteria.andMccEqualTo(lbsData.getMcc());
        criteria.andMncEqualTo(lbsData.getMnc());
        criteria.andLacEqualTo(lbsData.getLac());
        int hit = baseStationInfoMapper.countByExample(example);
        if (hit>0){
            return true;
        }else return false;
    }

    @Override
    public BaseStationInfo getInfoByLbsData(LbsData lbsData){
        BaseStationInfoExample example = new BaseStationInfoExample();
        BaseStationInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCiEqualTo(lbsData.getCi());
        criteria.andMccEqualTo(lbsData.getMcc());
        criteria.andMncEqualTo(lbsData.getMnc());
        criteria.andLacEqualTo(lbsData.getLac());
        BaseStationInfo baseStationInfo = baseStationInfoMapper.selectByExample(example).get(0);
        return baseStationInfo;
    }

    @Override
    public void insertBaseStationInfo(BaseStationInfo baseStationInfo){
        baseStationInfoMapper.insert(baseStationInfo);
    }
}
