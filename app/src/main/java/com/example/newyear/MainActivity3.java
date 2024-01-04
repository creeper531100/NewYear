package com.example.newyear;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        VideoView video = (VideoView) findViewById(R.id.videoView2);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.a87);
        video.setVideoURI(uri);
        video.start();
        video.resume();

        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);
    }
}