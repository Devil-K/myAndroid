package com.example.lenovo.myapplication;
/*设备列表*/
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class First13 extends AppCompatActivity {
    //日期显示
    private TextView textview;
    private Handler handler;

    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first13);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);


        /*铸轧机*/
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First13.this,First131.class);
                startActivity(intent);
            }
        });
        /*平整机*/
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First13.this,First132.class);
                startActivity(intent);
            }
        });
        /*温扎机*/
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(First13.this,First133.class);
                startActivity(intent);
            }
        });
        //日期显示
        textview = (TextView) findViewById(R.id.textview);
        handler = new Handler() {
            public void handleMessage(Message msg) {
                textview.setText((String) msg.obj);
            }
        };
        Threads thread = new Threads();
        thread.start();
    }

    //日期显示
    class Threads extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    SimpleDateFormat sdf = new SimpleDateFormat(
                            "yyyy年MM月dd日   HH:mm:ss");
                    String str = sdf.format(new Date());
                    handler.sendMessage(handler.obtainMessage(100, str));
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}