package com.zdxk.lbscache.service;

import com.zdxk.lbscache.model.BaseStationInfo;
import com.zdxk.lbscache.model.LbsData;

public interface BaseStationInfoService {

    boolean hitCache(LbsData lbsData);

    BaseStationInfo getInfoByLbsData(LbsData lbsData);

    void insertBaseStationInfo(BaseStationInfo baseStationInfo);

}
