package com.nabers.android_test_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//MainActivity는 public class이고 AppCompatActivity를 상속 받고 있다
public class MainActivity extends AppCompatActivity {

    //onCreate는 Activity가 생성되면 호출되는 메소드이다
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //supoer(부모) onCreate를 호출한다
        super.onCreate(savedInstanceState);
        //Activity의 layout을 설정하는 구문. layout 폴더의 activity_main을       layout으로 표시한다.
        setContentView(R.layout.activity_main);
    }
}
