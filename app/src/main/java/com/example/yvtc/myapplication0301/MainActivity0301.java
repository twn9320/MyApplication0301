package com.example.yvtc.myapplication0301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity0301 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0301);
    }

    public void click1(View v){
        TextView tv;
        tv=(TextView)findViewById(R.id.textView2);
        tv.setText("Hello World");
    }

}
