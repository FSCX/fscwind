package com.fsc.fscwind.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/3/27.
 */
//连接网工具类
public class HttpUtil {
    public static void sendOkhttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).equals(callback);
    }
}
