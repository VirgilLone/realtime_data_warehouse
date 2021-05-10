package com.atguigu.gmall.controller;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JSONStrTest {

    public static void main(String[] args) {

        JSONObject res = new JSONObject();
        res.put("status","0");
        JSONObject dataJson = new JSONObject();
        List<String> categories = new ArrayList<>();
        categories.add("小米");categories.add("华为");categories.add("苹果");
        dataJson.put("categories",categories);

        List<JSONObject> seriesList = new ArrayList<>();
        JSONObject seriesData = new JSONObject();
        List<String> seriesDataList = new ArrayList<>();
        seriesDataList.add("19045");seriesDataList.add("12655");seriesDataList.add("8438");
        seriesData.put("data",seriesDataList);
        seriesList.add(seriesData);
        dataJson.put("series",seriesList);

        res.put("data",dataJson);

        System.out.println(res);
        System.out.println(res.toJSONString());
        System.out.println(res.toString());


    }
}
