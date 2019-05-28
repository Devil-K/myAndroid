package com.example.lenovo.myapplication;
//向下跳的scroll view，转换工具
import android.app.Activity;

public class DensityUtil {

    public static int dip2px(Activity activity, float dpValue) {
        final float scale = activity.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(Activity activity,float pxValue) {
        final float scale = activity.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}


