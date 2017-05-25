package com.wyc.retrofit.rest.base;

import rx.Subscriber;

/**
 * Created by 李小明 on 17/5/22.
 * 邮箱:287907160@qq.com
 */

public abstract class MSubscriber<T> extends Subscriber<T> {

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        onFailure(e);
    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }


    public abstract void onSuccess(T t);

    public abstract void onFailure(Throwable e);
}
