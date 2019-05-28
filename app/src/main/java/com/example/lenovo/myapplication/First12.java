package com.example.lenovo.myapplication;
/*播放视频*/
import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.VideoView;

public class First12 extends AppCompatActivity implements View.OnClickListener{
    private VideoView videoView;
    private ImageButton play;
    private ImageButton pause;
    private ImageButton stop;
    private TextView playTime;
    private TextView allTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first12);
        initView();
        getPermisson();
    }
    private void initView(){
        playTime=(TextView)findViewById(R.id.played_time);
        allTime=(TextView)findViewById(R.id.all_time);

        play= (ImageButton) findViewById(R.id.play);
        pause=(ImageButton)findViewById(R.id.pause);
        stop=(ImageButton)findViewById(R.id.stop);
        videoView=(VideoView)findViewById(R.id.video);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    //视频路径
    private void initVideoPath(){
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"+ R.raw.video);//本地视频
        videoView.setVideoURI(uri);
        /*Uri uri=Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");//网络视频
        videoView.setVideoURI(uri);*/
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.play:
                if(!videoView.isPlaying()){
                    videoView.start();
                }
                break;
            case R.id.pause:
                if(videoView.isPlaying()){
                    videoView.pause();
                }
                break;
            case R.id.stop:
                if(videoView.isPlaying()){
                    videoView.stopPlayback();
                    initVideoPath();
                }
                break;
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(videoView!=null){
            videoView.suspend();
        }
    }
    public void getPermisson(){
        if(Build.VERSION.SDK_INT>=23){
            int checkPermission= ContextCompat.
                    checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
            if(checkPermission!= PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},111);
                return;
            }else{
                initVideoPath();
            }
        }else{
            initVideoPath();
        }
    }
}

