package com.wyc.retrofit.rest.response;

import java.io.Serializable;

/**
 * Created by 李小明 on 17/5/19.
 * 邮箱:287907160@qq.com
 */

public class ResponseLogin implements Serializable{

    private int code;

    private Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
        private String msg;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

}
