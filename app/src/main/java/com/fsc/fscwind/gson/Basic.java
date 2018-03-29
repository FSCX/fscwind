package com.fsc.fscwind.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/3/28.
 */
//使用geson解析json接口
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
