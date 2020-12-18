package com.example.day01_3.utils.net;

import java.util.HashMap;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class RetrofitUtils implements INetWorkInterface
{
private static RetrofitUtils retrofitUtils;
private ApiServices apiServices;
 private RetrofitUtils(){
     OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
     new Retrofit.Builder()
             .baseUrl()
 }

    @Override
    public <T> void get(String url, INetCallBack<T> callBack) {

    }

    @Override
    public <T> void post(String url, INetCallBack<T> callBack) {

    }

    @Override
    public <T> void post(String url, HashMap<String, String> map, INetCallBack<T> callBack) {

    }
}
