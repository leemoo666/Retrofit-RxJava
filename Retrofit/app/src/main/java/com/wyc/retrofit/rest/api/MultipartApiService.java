package com.wyc.retrofit.rest.api;


import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


/**
 * User related API service, such as login, register
 */
public interface MultipartApiService {

    /**
     * 上传2张图片
     *
     * @param imgs1
     * @return
     */
    @Multipart
    @POST("question/add")
    Call<String> uploadImage(
            @Part("json") RequestBody jsonStr,
            @Part("file1\"; filename=\"image1.png") RequestBody imgs1,
            @Part("file2\"; filename=\"image2.png") RequestBody imgs2);

    //修改个人信息
//    @POST("user/userinfo/post")
//    Call<String> modifyProfile(
//            @Part("json") RequestBody jsonStr,
//            @Part("avatar\"; filename=\"avatar") RequestBody imgs1);


//
//    @POST("user/userinfo/post")
//    Call<BaseResponse<BaseData>> modifyProfile(
//            @Query("token") String token,
//            @Body ModifyProfile jsonStr);
//
//    @GET("user/userinfo/get")
//    Call<BaseResponse<BaseData>> getUserInfo(
//            @Query("token") String token
//    );
}
