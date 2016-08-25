package com.glemontree.intentdemo3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/8/23.
 */
public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        textView.setText(data);
    }
}
