package com.zdxk.lbscache.dao;

import com.zdxk.lbscache.model.BaseStationInfo;
import com.zdxk.lbscache.model.BaseStationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseStationInfoMapper {
    int countByExample(BaseStationInfoExample example);

    int deleteByExample(BaseStationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseStationInfo record);

    int insertSelective(BaseStationInfo record);

    List<BaseStationInfo> selectByExample(BaseStationInfoExample example);

    BaseStationInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseStationInfo record, @Param("example") BaseStationInfoExample example);

    int updateByExample(@Param("record") BaseStationInfo record, @Param("example") BaseStationInfoExample example);

    int updateByPrimaryKeySelective(BaseStationInfo record);

    int updateByPrimaryKey(BaseStationInfo record);
}