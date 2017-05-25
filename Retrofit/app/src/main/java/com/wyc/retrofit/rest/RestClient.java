package com.wyc.retrofit.rest;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestClient {
    /**
     * create service class with header contains token 创建header里面包含token的service
     *
     * @param serviceClass interface class defines APIs
     * @param baseUrl      service base URL
     * @return
     */
    public static <T> T createService(final Class<T> serviceClass, String baseUrl) {
        OkHttpClient mClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .build();
                        Response response = chain.proceed(request);
                        return response;
                    }

                }).build();

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(mClient)
                .build();

        T service = mRetrofit.create(serviceClass);
        return service;
    }

}
