package com.fsc.fscwind.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/3/27.
 */
//市的实体类
public class City extends DataSupport {
    private int id;//标识
    private String cityName;//市名
    private int cityCode;//市代号
    private int provinceId;//市所在的省份id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
