package com.wyc.retrofit.rest.api;

import com.wyc.retrofit.rest.request.RequestLogin;
import com.wyc.retrofit.rest.response.ResponseLogin;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * User related API service, such as login, register
 */
public interface LoginApiService {

    //手机号码和验证码登录
    @POST("login/mobile")
    Observable<ResponseLogin> login(
            @Body RequestLogin login);

//
//    //2.1.2 游客登录
//    @POST("login/visitor")
//    Call<BaseResponse<BaseLogin>> loginSkip(
//            @Body LoginRequest request);
//
//    //第三方登录
//    @POST("login/thirdParty")
//    Call<BaseResponse<BaseLogin>> thirdlogin(@Body ThirdLoginRequest request);
//
//    //获取短信验证码
//    @GET("sms/verifyCode/getLogin")
//    Call<BaseResponse<BaseData>> requestLoginSmsCode(
//            @Query("deviceType") String deviceType,
//            @Query("deviceUUID") String deviceUUID,
//            @Query("phoneNum") String phoneNum);
//
//    //获取短信验证码
//    @GET("sms/verifyCode/get")
//    Call<BaseResponse<BaseData>> requestSmsCode(
//            @Query("deviceType") String deviceType,
//            @Query("deviceUUID") String deviceUUID,
//            @Query("phoneNum") String phoneNum);
//
//    //注册
//    @POST("register")
//    Call<BaseResponse<BaseLogin>> register(
//            @Body RegisterReq registerReq);
//
//
//    //东方时尚学员注册
//    @POST("dfssRegister")
//    Call<BaseResponse<BaseLogin>> traineeRegister(
//            @Body RequestTrainee requestTrainee);
//
//    //东方时尚学员获取短信验证码
//    @FormUrlEncoded
//    @POST("sms/verifyCode/checkStudent")
//    Call<BaseResponse<BaseData>> getSmsCode(
//            @Field("studentId") String studentId,
//            @Field("phoneNum") String phoneNum,
//            @Field("password") String password);
//
//    //获取科目进度
//    //获取短信验证码
//    @GET("user/courseProgress")
//    Call<BaseResponse<BaseLogin>> courseProgress(
//            @Query("token") String token
//    );

}
