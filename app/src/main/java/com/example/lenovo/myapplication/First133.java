package com.example.lenovo.myapplication;
//温轧机
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class First133 extends AppCompatActivity implements View.OnClickListener
{
    //向下跳的scrollview
    NoAutoScrollViewWithPosition noAutoScrollViewWithPosition;
    private TextView tvMoneyUse1;
    private TextView tvProjectAdvantage1;
    private TextView tvProjectIntroduction1;
    private Button btnMenu;
    private int mCurrenY;
    private TextView projectIntroduction1;
    private TextView shareAllocation1;
    private TextView projectAdvantage1;
    private TextView moneyUse1;
    private TextView enterpriseEvaluation1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first133);
        initView();
        initListener();
    }
    //下面是向下跳scrollview的实现
    private void initListener() {
        btnMenu.setOnClickListener(this);
    }

    private void initView() {
        tvMoneyUse1 = (TextView) findViewById(R.id.tvMoneyUse1);
        tvProjectAdvantage1 = (TextView) findViewById(R.id.tvProjectAdvantage1);
        tvProjectIntroduction1 = (TextView) findViewById(R.id.tvProjectIntroduction1);
        shareAllocation1 = (TextView) findViewById(R.id.shareAllocation1);
        projectIntroduction1 = (TextView) findViewById(R.id.projectIntroduction1);
        projectAdvantage1 = (TextView) findViewById(R.id.projectAdvantage1);
        enterpriseEvaluation1 = (TextView) findViewById(R.id.enterpriseEvaluation1);
        moneyUse1 = (TextView) findViewById(R.id.moneyUse1);
        btnMenu = (Button) findViewById(R.id.btnMenu);
        noAutoScrollViewWithPosition = (NoAutoScrollViewWithPosition) findViewById(R.id.noAutoScrollViewWithPosition);
    }


    @Override
    public void onClick(View v) {
        noAutoScrollViewWithPosition.setScrollViewListener(new NoAutoScrollViewWithPosition.ScrollViewListener() {
            @Override
            public void onScrollChanged(NoAutoScrollViewWithPosition noAutoScrollViewWithPosition, int x, int y, int oldx, int oldy) {
                mCurrenY = y;
            }
        });

        ViewDetailsBtnDialog1 viewDetailsBtnDialog1 = new ViewDetailsBtnDialog1();
        viewDetailsBtnDialog1.setListener(new ViewDetailsBtnDialog1.MyListener() {
            @Override
            public void projectIntroduction() {// 温轧机参数
                int[] location = new int[2];
                projectIntroduction1.getLocationOnScreen(location);
                Log.e("chris","mCurrenY==" + mCurrenY);
                Log.e("chris","location[1]==" + location[1]);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1]  - DensityUtil.dip2px(First133.this,17) ); //  + DensityUtil.dip2px(45)
            }

            @Override
            public void shareAllocation() {//温轧机操作
                int[] location = new int[2];
                shareAllocation1.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First133.this,17) ); // + DensityUtil.dip2px(45)
            }

            @Override
            public void projectAdvantage() {// 温轧机液压系统
                int[] location = new int[2];
                projectAdvantage1.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First133.this,17) ); // + DensityUtil.dip2px(45)
            }

            @Override
            public void moneyUse() {// 温轧机传动
                int[] location = new int[2];
                moneyUse1.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First133.this,17) ); // + DensityUtil.dip2px(45)
            }

            @Override
            public void enterpriseEvaluation() {// 未使用
                int[] location = new int[2];
                enterpriseEvaluation1.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First133.this,17) ); // + DensityUtil.dip2px(45)
            }
        });
        viewDetailsBtnDialog1.show(getFragmentManager(), "viewDetailsBtnDialog1");

    }
}
