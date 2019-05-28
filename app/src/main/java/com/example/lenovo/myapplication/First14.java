package com.example.lenovo.myapplication;
/*图片按钮2--薄带铸轧试验机简介*/
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;

public class First14 extends AppCompatActivity {
    private ScrollView scrollView;
    private ImageButton ib_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first14);

        scrollView = (ScrollView) findViewById(R.id.scrollView1);

        scrollView.setOnTouchListener(new View.OnTouchListener() {

            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                switch (event.getAction()) {
                    //手指抬起
                    case MotionEvent.ACTION_UP:

                        break;

                    //手指落下
                    case MotionEvent.ACTION_DOWN:

                        break;

                    //手指滑动
                    case MotionEvent.ACTION_MOVE:
                        /**
                         * 1、getScorollY()——滚动条滑动的距离
                         * 2、getMeasuredHeight()——内容的整体高度，包括隐藏部分
                         * 3、getHeight()——显示高度。内容未布满屏幕，2=3；内容大于屏幕，3=屏幕高度，2>3。
                         */
                }
                return false;
            }
        });
    }
}
