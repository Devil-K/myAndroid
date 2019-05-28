package com.example.lenovo.myapplication;
/*登录界面*/
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View view;
    private EditText edit1;
    private EditText edit2;
    private TextView txt1;
    private TextView txt2;
    public Button button1;
    public Button button2;
    String account;
    String passwd;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView)findViewById(R.id.text_view1);//账号
        txt1.setTextColor(Color.BLACK);
        txt2=(TextView)findViewById(R.id.text_view2);//密码
        txt2.setTextColor(Color.BLACK);
        edit1=(EditText)findViewById(R.id.edit_text1);
        edit2=(EditText)findViewById(R.id.edit_text2);

        Button button1 = (Button) findViewById(R.id.button1);//网络设置
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_first1.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);//登录
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                account=edit1.getText().toString();//获取文本编辑框的文本内容
                passwd=edit2.getText().toString();
                Intent intent = new Intent(MainActivity.this, First1.class);//没有账号密码
                startActivity(intent);
                /*if(account.equals("abc")&&passwd.equals("123"))//判断密码,手动设置账号abc，密码123；这个地方需要连接数据库，满足50个账户同时登陆
                {
                Intent intent = new Intent(MainActivity.this, First1.class);
                startActivity(intent);
                }else ;*/
            }
        });
    }
}
