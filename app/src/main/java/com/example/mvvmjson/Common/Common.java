package com.example.mvvmjson.Common;

import com.example.mvvmjson.Network.APIService;
import com.example.mvvmjson.Network.Retrofit;

public class Common {
    private static final String BASE_URL = "https://simplifiedcoding.net/demos/";

    public static APIService getAPIService(){
        return Retrofit.getRetrofitClient(BASE_URL).create(APIService.class);

    }
}
