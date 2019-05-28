package com.example.lenovo.myapplication;
//铸轧机
import android.app.Activity;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class First131 extends Activity implements View.OnClickListener
{
    //向下跳的scrollview
    NoAutoScrollViewWithPosition noAutoScrollViewWithPosition;
    private TextView tvMoneyUse;
    private TextView tvProjectAdvantage;
    private TextView tvProjectIntroduction;
    private Button btnMenu;
    private int mCurrenY;
    private TextView projectIntroduction;
    private TextView shareAllocation;
    private TextView projectAdvantage;
    private TextView moneyUse;
    private TextView enterpriseEvaluation;
    //柱状图
    private ImageView levelImg1;
    private EditText levelEt1;

    private ImageView levelImg2;
    private EditText levelEt2;

    private ImageView levelImg3;
    private EditText levelEt3;

    private ImageView levelImg4;
    private EditText levelEt4;

    private ImageView levelImg5;
    private EditText levelEt5;

    private ImageView levelImg6;
    private EditText levelEt6;

    private ImageView levelImg7;
    private EditText levelEt7;

    private ImageView levelImg8;
    private EditText levelEt8;

    private ImageView levelImg9;
    private EditText levelEt9;

    private ImageView levelImg10;
    private EditText levelEt10;

    private ImageView levelImg11;
    private EditText levelEt11;

    private ImageView levelImg12;
    private EditText levelEt12;

    private ImageView levelImg13;
    private EditText levelEt13;

    private ImageView levelImg14;
    private EditText levelEt14;

    private ImageView levelImg15;
    private EditText levelEt15;

    private ImageView levelImg16;
    private EditText levelEt16;

    private ImageView levelImg17;
    private EditText levelEt17;

    private ImageView levelImg18;
    private EditText levelEt18;

    private ImageView levelImg19;
    private EditText levelEt19;

    private ImageView levelImg20;
    private EditText levelEt20;

    private ImageView levelImg21;
    private EditText levelEt21;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first131);
        //下面是向下跳scrollview的实现
        initView();
        initListener();
        //下面是柱状图的实现
        levelImg1 = (ImageView) findViewById(R.id.level_list_img1);
        levelEt1 = (EditText) findViewById(R.id.level_et1);

        levelImg2 = (ImageView) findViewById(R.id.level_list_img2);
        levelEt2 = (EditText) findViewById(R.id.level_et2);

        levelImg3 = (ImageView) findViewById(R.id.level_list_img3);
        levelEt3 = (EditText) findViewById(R.id.level_et3);

        levelImg4 = (ImageView) findViewById(R.id.level_list_img4);
        levelEt4 = (EditText) findViewById(R.id.level_et4);

        levelImg5 = (ImageView) findViewById(R.id.level_list_img5);
        levelEt5 = (EditText) findViewById(R.id.level_et5);

        levelImg6 = (ImageView) findViewById(R.id.level_list_img6);
        levelEt6 = (EditText) findViewById(R.id.level_et6);

        levelImg7 = (ImageView) findViewById(R.id.level_list_img7);
        levelEt7 = (EditText) findViewById(R.id.level_et7);

        levelImg8 = (ImageView) findViewById(R.id.level_list_img8);
        levelEt8 = (EditText) findViewById(R.id.level_et8);

        levelImg9 = (ImageView) findViewById(R.id.level_list_img9);
        levelEt9 = (EditText) findViewById(R.id.level_et9);

        levelImg10 = (ImageView) findViewById(R.id.level_list_img10);
        levelEt10 = (EditText) findViewById(R.id.level_et10);

        levelImg11 = (ImageView) findViewById(R.id.level_list_img11);
        levelEt11 = (EditText) findViewById(R.id.level_et11);

        levelImg12 = (ImageView) findViewById(R.id.level_list_img12);
        levelEt12 = (EditText) findViewById(R.id.level_et12);

        levelImg13 = (ImageView) findViewById(R.id.level_list_img13);
        levelEt13 = (EditText) findViewById(R.id.level_et13);

        levelImg14 = (ImageView) findViewById(R.id.level_list_img14);
        levelEt14 = (EditText) findViewById(R.id.level_et14);

        levelImg15 = (ImageView) findViewById(R.id.level_list_img15);
        levelEt15 = (EditText) findViewById(R.id.level_et15);

        levelImg16 = (ImageView) findViewById(R.id.level_list_img16);
        levelEt16 = (EditText) findViewById(R.id.level_et16);

        levelImg17 = (ImageView) findViewById(R.id.level_list_img17);
        levelEt17 = (EditText) findViewById(R.id.level_et17);

        levelImg18 = (ImageView) findViewById(R.id.level_list_img18);
        levelEt18 = (EditText) findViewById(R.id.level_et18);

        levelImg19 = (ImageView) findViewById(R.id.level_list_img19);
        levelEt19 = (EditText) findViewById(R.id.level_et19);

        levelImg20 = (ImageView) findViewById(R.id.level_list_img20);
        levelEt20 = (EditText) findViewById(R.id.level_et20);

        levelImg21 = (ImageView) findViewById(R.id.level_list_img21);
        levelEt21 = (EditText) findViewById(R.id.level_et21);

        levelEt1.addTextChangedListener(new TextWatcher() //监听事件edittext1，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel1 = 0;
                String level1 = levelEt1.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg1.getDrawable();
                try {
                    iLevel1 = Integer.valueOf(level1);
                } catch (Exception e) {
                    iLevel1 = 0;
                }
                levelListDrawable.setLevel(iLevel1);
            }
        });

        levelEt2.addTextChangedListener(new TextWatcher() //监听事件edittext2，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel2 = 0;
                String level2 = levelEt2.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg2.getDrawable();
                try {
                    iLevel2 = Integer.valueOf(level2);
                } catch (Exception e) {
                    iLevel2 = 0;
                }
                levelListDrawable.setLevel(iLevel2);
            }
        });

        levelEt3.addTextChangedListener(new TextWatcher() //监听事件edittext3，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel3 = 0;
                String level3 = levelEt3.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg3.getDrawable();
                try {
                    iLevel3 = Integer.valueOf(level3);
                } catch (Exception e) {
                    iLevel3 = 0;
                }
                levelListDrawable.setLevel(iLevel3);
            }
        });

        levelEt4.addTextChangedListener(new TextWatcher() //监听事件edittext4，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel4 = 0;
                String level4 = levelEt4.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg4.getDrawable();
                try {
                    iLevel4 = Integer.valueOf(level4);
                } catch (Exception e) {
                    iLevel4 = 0;
                }
                levelListDrawable.setLevel(iLevel4);
            }
        });

        levelEt5.addTextChangedListener(new TextWatcher() //监听事件edittext5，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel5 = 0;
                String level5 = levelEt5.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg5.getDrawable();
                try {
                    iLevel5 = Integer.valueOf(level5);
                } catch (Exception e) {
                    iLevel5 = 0;
                }
                levelListDrawable.setLevel(iLevel5);
            }
        });

        levelEt6.addTextChangedListener(new TextWatcher() //监听事件edittext6，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel6 = 0;
                String level6 = levelEt6.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg6.getDrawable();
                try {
                    iLevel6 = Integer.valueOf(level6);
                } catch (Exception e) {
                    iLevel6 = 0;
                }
                levelListDrawable.setLevel(iLevel6);
            }
        });

        levelEt7.addTextChangedListener(new TextWatcher() //监听事件edittext7，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel7 = 0;
                String level7 = levelEt7.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg7.getDrawable();
                try {
                    iLevel7 = Integer.valueOf(level7);
                } catch (Exception e) {
                    iLevel7 = 0;
                }
                levelListDrawable.setLevel(iLevel7);
            }
        });

        levelEt8.addTextChangedListener(new TextWatcher() //监听事件edittext8，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel8 = 0;
                String level8 = levelEt8.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg8.getDrawable();
                try {
                    iLevel8 = Integer.valueOf(level8);
                } catch (Exception e) {
                    iLevel8 = 0;
                }
                levelListDrawable.setLevel(iLevel8);
            }
        });

        levelEt9.addTextChangedListener(new TextWatcher() //监听事件edittext9，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel9 = 0;
                String level9 = levelEt9.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg9.getDrawable();
                try {
                    iLevel9 = Integer.valueOf(level9);
                } catch (Exception e) {
                    iLevel9 = 0;
                }
                levelListDrawable.setLevel(iLevel9);
            }
        });

        levelEt10.addTextChangedListener(new TextWatcher() //监听事件edittext10，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel10 = 0;
                String level10 = levelEt10.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg10.getDrawable();
                try {
                    iLevel10 = Integer.valueOf(level10);
                } catch (Exception e) {
                    iLevel10 = 0;
                }
                levelListDrawable.setLevel(iLevel10);
            }
        });

        levelEt11.addTextChangedListener(new TextWatcher() //监听事件edittext11，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel11 = 0;
                String level11 = levelEt11.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg11.getDrawable();
                try {
                    iLevel11 = Integer.valueOf(level11);
                } catch (Exception e) {
                    iLevel11 = 0;
                }
                levelListDrawable.setLevel(iLevel11);
            }
        });

        levelEt12.addTextChangedListener(new TextWatcher() //监听事件edittext12，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel12 = 0;
                String level12 = levelEt12.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg12.getDrawable();
                try {
                    iLevel12 = Integer.valueOf(level12);
                } catch (Exception e) {
                    iLevel12 = 0;
                }
                levelListDrawable.setLevel(iLevel12);
            }
        });

        levelEt13.addTextChangedListener(new TextWatcher() //监听事件edittext13，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel13 = 0;
                String level13 = levelEt13.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg13.getDrawable();
                try {
                    iLevel13 = Integer.valueOf(level13);
                } catch (Exception e) {
                    iLevel13 = 0;
                }
                levelListDrawable.setLevel(iLevel13);
            }
        });

        levelEt14.addTextChangedListener(new TextWatcher() //监听事件edittext14，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel14 = 0;
                String level14 = levelEt14.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg14.getDrawable();
                try {
                    iLevel14 = Integer.valueOf(level14);
                } catch (Exception e) {
                    iLevel14 = 0;
                }
                levelListDrawable.setLevel(iLevel14);
            }
        });

        levelEt15.addTextChangedListener(new TextWatcher() //监听事件edittext15，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel15 = 0;
                String level15 = levelEt15.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg15.getDrawable();
                try {
                    iLevel15 = Integer.valueOf(level15);
                } catch (Exception e) {
                    iLevel15 = 0;
                }
                levelListDrawable.setLevel(iLevel15);
            }
        });

        levelEt16.addTextChangedListener(new TextWatcher() //监听事件edittext16，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel16 = 0;
                String level16 = levelEt16.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg16.getDrawable();
                try {
                    iLevel16 = Integer.valueOf(level16);
                } catch (Exception e) {
                    iLevel16 = 0;
                }
                levelListDrawable.setLevel(iLevel16);
            }
        });

        levelEt17.addTextChangedListener(new TextWatcher() //监听事件edittext17，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel17 = 0;
                String level17 = levelEt17.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg17.getDrawable();
                try {
                    iLevel17 = Integer.valueOf(level17);
                } catch (Exception e) {
                    iLevel17 = 0;
                }
                levelListDrawable.setLevel(iLevel17);
            }
        });

        levelEt18.addTextChangedListener(new TextWatcher() //监听事件edittext18，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel18 = 0;
                String level18 = levelEt18.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg18.getDrawable();
                try {
                    iLevel18 = Integer.valueOf(level18);
                } catch (Exception e) {
                    iLevel18 = 0;
                }
                levelListDrawable.setLevel(iLevel18);
            }
        });

        levelEt19.addTextChangedListener(new TextWatcher() //监听事件edittext19，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel19 = 0;
                String level19 = levelEt19.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg19.getDrawable();
                try {
                    iLevel19 = Integer.valueOf(level19);
                } catch (Exception e) {
                    iLevel19 = 0;
                }
                levelListDrawable.setLevel(iLevel19);
            }
        });

        levelEt20.addTextChangedListener(new TextWatcher() //监听事件edittext20，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel20 = 0;
                String level20 = levelEt20.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg20.getDrawable();
                try {
                    iLevel20 = Integer.valueOf(level20);
                } catch (Exception e) {
                    iLevel20 = 0;
                }
                levelListDrawable.setLevel(iLevel20);
            }
        });

        levelEt21.addTextChangedListener(new TextWatcher() //监听事件edittext21，只能在onTextChanged里面改动
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                Log.d("TAG","beforeTextChanged--------------->");
            }

            @Override
            public void afterTextChanged(Editable s) {

                Log.d("TAG","afterTextChanged--------------->");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                Log.d("TAG","onTextChanged--------------->");

                int iLevel21 = 0;
                String level21 = levelEt21.getText().toString();
                LevelListDrawable levelListDrawable = (LevelListDrawable) levelImg21.getDrawable();
                try {
                    iLevel21 = Integer.valueOf(level21);
                } catch (Exception e) {
                    iLevel21 = 0;
                }
                levelListDrawable.setLevel(iLevel21);
            }
        });

    }

    //下面是向下跳scrollview的实现
    private void initListener() {
        btnMenu.setOnClickListener(this);
    }

    private void initView() {
        tvMoneyUse = (TextView) findViewById(R.id.tvMoneyUse);
        tvProjectAdvantage = (TextView) findViewById(R.id.tvProjectAdvantage);
        tvProjectIntroduction = (TextView) findViewById(R.id.tvProjectIntroduction);
        shareAllocation = (TextView) findViewById(R.id.shareAllocation);
        projectIntroduction = (TextView) findViewById(R.id.projectIntroduction);
        projectAdvantage = (TextView) findViewById(R.id.projectAdvantage);
        enterpriseEvaluation = (TextView) findViewById(R.id.enterpriseEvaluation);
        moneyUse = (TextView) findViewById(R.id.moneyUse);
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

        ViewDetailsBtnDialog viewDetailsBtnDialog = new ViewDetailsBtnDialog();
        viewDetailsBtnDialog.setListener(new ViewDetailsBtnDialog.MyListener() {
            @Override
            public void projectIntroduction() {// 铸轧机参数
                int[] location = new int[2];
                projectIntroduction.getLocationOnScreen(location);
                Log.e("chris","mCurrenY==" + mCurrenY);
                Log.e("chris","location[1]==" + location[1]);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1]  - DensityUtil.dip2px(First131.this,17) ); //  + DensityUtil.dip2px(45)
            }

            @Override
            public void shareAllocation() {// 铸轧机棒图
                int[] location = new int[2];
                shareAllocation.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First131.this,17) ); // + DensityUtil.dip2px(45)
            }

            @Override
            public void projectAdvantage() {// 铸轧机调零
                int[] location = new int[2];
                projectAdvantage.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First131.this,17) ); // + DensityUtil.dip2px(45)
            }

            @Override
            public void moneyUse() {// 铸轧机液压系统
                int[] location = new int[2];
                moneyUse.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First131.this,17) ); // + DensityUtil.dip2px(45)
            }

            @Override
            public void enterpriseEvaluation() {// 铸轧机传动
                int[] location = new int[2];
                enterpriseEvaluation.getLocationOnScreen(location);
                noAutoScrollViewWithPosition.setScrollY( mCurrenY + location[1] - DensityUtil.dip2px(First131.this,17) ); // + DensityUtil.dip2px(45)
            }
        });
        viewDetailsBtnDialog.show(getFragmentManager(), "viewDetailsBtnDialog");

    }
}


