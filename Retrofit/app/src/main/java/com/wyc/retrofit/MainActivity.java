package com.wyc.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wyc.retrofit.rest.HTTP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tvGetHttp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("lxm","onclick");
                HTTP.login();
            }
        });
    }
}
