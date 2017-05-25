package com.wyc.retrofit.rest;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by lixiaoming on 16/3/30.
 */
public abstract class CallBackAdapter<T> implements Callback<T> {

    private static int SUCCESS_CODE = 200; //请求成功
    private static int FORWORD_CODE = 300;//重定向
    private static int ERROR_CODE_NOTFOUND = 404; //路径错误
    private static int ERROR_CODE_SERVER = 500;//服务器错误
    private static int ERROR_CODE_UNKNOWN = 600;//未知错误

    public abstract void onSuccess(T body);

    public abstract void onFailure(int errCode);

    public CallBackAdapter() {

    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.code() == SUCCESS_CODE) { //请求成功
            try {
                //如果不能被解析成想要的对象,会抛出异常,然后调用onFailure
                response.body().toString();
                onSuccess(response.body());
            } catch (Exception e) {
                onFailure(response.code());
            }

        } else {  //请求失败
            onFailure(response.code());
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable throwable) {
        Log.i("lxm", "throwable = " + throwable);
        onFailure(ERROR_CODE_UNKNOWN);
    }
}
