package com.zdxk.lbscache.controller;

import com.zdxk.lbscache.component.LbsConf;
import com.zdxk.lbscache.model.BaseStationInfo;
import com.zdxk.lbscache.model.LbsData;
import com.zdxk.lbscache.service.BaseStationInfoService;
import com.zdxk.lbscache.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value = "/location")
public class RequestController {

    @Autowired
    LbsConf lbsConf;

    @Autowired
    private BaseStationInfoService baseStationInfoService;

    @ResponseBody
    @RequestMapping(value = "/lbs", produces = {"application/json;charset=UTF-8"})
    String getLocationByApi(LbsData lbsData){

        //命中缓存
        if(baseStationInfoService.hitCache(lbsData)){
            BaseStationInfo stationInfo = baseStationInfoService.getInfoByLbsData(lbsData);
            JSONObject returnData = new JSONObject();
            returnData.put("lat",stationInfo.getLat());
            returnData.put("lon",stationInfo.getLon());
            returnData.put("address",stationInfo.getAddress());
            return returnData.toJSONString();
        }

        //未命中缓存则向API查询并添加进缓存中
        String url = lbsConf.getApi()+lbsData.toParam();
        JSONObject location = HttpUtil.httpRequestJSON(url,"GET");


        //errorcode 为 0 表示返回结果正常则加入缓存
        if(location.getString("errcode").equals("0")){
            BaseStationInfo stationInfo = new BaseStationInfo(lbsData.getMcc(),lbsData.getMnc(),
                    lbsData.getLac(),lbsData.getCi(),location.getString("lon"),
                    location.getString("lat"),"bd09", location.getString("radius"),
                    location.getString("address"));
            baseStationInfoService.insertBaseStationInfo(stationInfo);
        }

        return  location.toJSONString();

    }

}
