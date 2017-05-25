package com.wyc.retrofit.rest.request;

import java.io.Serializable;

/**
 * Created by 李小明 on 17/5/22.
 * 邮箱:287907160@qq.com
 */

public class RequestLogin implements Serializable {

    private String deviceType;
    private String deviceUUID;
    private String phoneNum;
    private String smsCode;

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceUUID() {
        return deviceUUID;
    }

    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }
}
