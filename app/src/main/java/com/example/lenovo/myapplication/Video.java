package com.example.lenovo.myapplication;
/*播放视频*/
import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

public class Video extends AppCompatActivity implements View.OnClickListener{
    private VideoView videoView;
    private Button play;
    private Button pause;
    private Button stop;
    private SeekBar seekBar;
    private TextView playTime;
    private TextView allTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        initView();
        getPermisson();

    }
    private void initView(){
        playTime=(TextView)findViewById(R.id.played_time);
        allTime=(TextView)findViewById(R.id.all_time);

        play=(Button)findViewById(R.id.play);
        pause=(Button)findViewById(R.id.pause);
        stop=(Button)findViewById(R.id.stop);
        videoView=(VideoView)findViewById(R.id.video);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
        seekBar=(SeekBar)findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser==true){
                    videoView.seekTo(progress);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar){ }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){ }
        });
    }
    private void initVideoPath(){
        /*File file = new File(Environment.getExternalStorageDirectory(),"Download/aas.mp4");//播放本地视频
        videoView.setVideoPath(file.getPath());*/
        Uri uri=Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");//测试网络视频
        videoView.setVideoURI(uri);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.play:
                if(!videoView.isPlaying()){
                    videoView.start();
                    seekBar.setMax(videoView.getDuration());
                    Message message=handler.obtainMessage();
                    message.what=1;
                    message.arg1=videoView.getDuration();
                    handler.sendMessage(message);
                    handler.post(updateThread);
                }
                break;
            case R.id.pause:
                if(videoView.isPlaying()){
                    videoView.pause();
                    handler.removeCallbacks(updateThread);
                }
                break;
            case R.id.stop:
                if(videoView.isPlaying()){
                    videoView.stopPlayback();
                    initVideoPath();
                    handler.removeCallbacks(updateThread);
                    handler.sendEmptyMessage(3);
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
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                    allTime.setText(msg.arg1/60000+":"+msg.arg1/1000%60);
                    break;
                case 3:
                    allTime.setText("00:00");
                    playTime.setText("00:00");
                    seekBar.setProgress(0);
                    break;
            }
        }
    };
    Runnable updateThread = new Runnable() {
        @Override
        public void run() {
            seekBar.setProgress(videoView.getCurrentPosition());
            playTime.setText(videoView.getCurrentPosition()/60000+
                    ":"+videoView.getCurrentPosition()/1000%60);
            handler.postDelayed(updateThread,100);
        }
    };
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
