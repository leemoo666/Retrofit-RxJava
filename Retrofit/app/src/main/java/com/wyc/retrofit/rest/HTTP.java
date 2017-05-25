package com.wyc.retrofit.rest;

import android.util.Log;

import com.wyc.retrofit.rest.base.MSubscriber;
import com.wyc.retrofit.rest.request.RequestLogin;
import com.wyc.retrofit.rest.response.ResponseLogin;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by 李小明 on 17/5/19.
 * 邮箱:287907160@qq.com
 */

public class HTTP {

    public static void login() {
        RequestLogin login = new RequestLogin();
        login.setPhoneNum("15901038463");
        login.setDeviceType("android");
        login.setDeviceUUID("c1873284d67d1b52");
        login.setSmsCode("1234");

        RestClientManager.getLoginApiService().login(login)
                .subscribeOn(Schedulers.newThread())//请求在新的线程中执行
                .observeOn(Schedulers.io())
                .doOnNext(new Action1<ResponseLogin>() {
                    @Override
                    public void call(ResponseLogin responseLogin) {
                        Log.i("lxm", "doNext");
                    }
                })
                .doOnError(new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.i("lxm", "doOnError" + throwable.toString());
                    }
                })
                .subscribe(new MSubscriber<ResponseLogin>() {
                    @Override
                    public void onSuccess(ResponseLogin responseLogin) {
                        Log.i("lxm", "success");
                    }

                    @Override
                    public void onFailure(Throwable e) {
                        Log.i("lxm", "e ===" + e.toString());
                    }
                });
    }


    /**
     * RXAndroid +Retrofit2
     * 可以链式链接,比如下面的例子,先请求登录获取token
     * 然后在获取成功后再去请求网络获取用户信息
     * 请求成功后可以先保存用户信息,然后再去处理回调
     *
     * */

    /*
    service.login("11111", "22222")
            .flatMap(new Func1<String, Observable<User>>() {  //得到token后获取用户信息
        @Override
        public Observable<User> onNext(String token) {
            return service.getUser(token);
        })
  .subscribeOn(Schedulers.newThread())//请求在新的线程中执行请求
                .observeOn(Schedulers.io())         //请求完成后在io线程中执行
                .doOnNext(new Action1<User>() {      //保存用户信息到本地
                    @Override
                    public void call(User userInfo) {
                        saveUserInfo(userInfo);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())//在主线程中执行
                .subscribe(new Observer<User>() {
                    @Override
                    public void onNext(User user) {
                        //完成一次完整的登录请求
                        userView.setUser(user);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable error) {
                        //请求失败
                    }
                });

                */

}
