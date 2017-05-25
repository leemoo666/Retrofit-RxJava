package com.wyc.retrofit.rest;

import com.wyc.retrofit.rest.api.LoginApiService;
import com.wyc.retrofit.rest.api.UserApiService;

/**
 * Created by 李小明 on 17/5/19.
 * 邮箱:287907160@qq.com
 */

public class RestClientManager {

    public static final String BASE_URL = "http://192.168.1.103:8080/educloud/app/";

    private static UserApiService userApiService;
    private static LoginApiService loginApiService;


    //登录相关
    public static LoginApiService getLoginApiService() {
        if (loginApiService == null) {
            return RestClient.createService(LoginApiService.class, BASE_URL);
        }
        return loginApiService;
    }

    //用户相关
    public static UserApiService getUserApiService() {
        if (userApiService == null) {

            return RestClient.createService(UserApiService.class, BASE_URL);
        }
        return userApiService;
    }

    public static void clearClient() {
        userApiService = null;
        loginApiService = null;
    }

}
