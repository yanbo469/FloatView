package com.yanbo.floatview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity1.class));

            }
        });
    }

    @Override
    protected void onStart() {
        Intent intent = new Intent(MainActivity.this, FloatViewService.class);
        //启动FloatViewService
        startService(intent);
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        // 销毁悬浮窗
        Intent intent = new Intent(MainActivity.this, FloatViewService.class);
        //终止FloatViewService
        stopService(intent);
        super.onDestroy();
    }
}
