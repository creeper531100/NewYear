package com.example.newyear;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity {
    VideoView video;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        video = findViewById(R.id.videoView2);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.a87);
        video.setVideoURI(uri);
        video.start();
        video.setOnTouchListener(this::onTouch);

        video.setOnCompletionListener(mp -> {
            video.seekTo(0);
            video.start();
        });
    }

    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                video.pause();
                break;
            case MotionEvent.ACTION_UP:
                video.start();
                break;
        }
        return true;
    }
}