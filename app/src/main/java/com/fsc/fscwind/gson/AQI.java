package com.fsc.fscwind.gson;

/**
 * Created by Administrator on 2018/3/29.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
