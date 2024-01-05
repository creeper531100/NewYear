package com.example.newyear;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.a69);
        video.setVideoURI(uri);
        video.start();

        //MediaController mediaController = new MediaController(this);
        //video.setMediaController(mediaController);
        //mediaController.setAnchorView(video);

        video.setOnCompletionListener(mp -> completion());
        video.setOnClickListener(mp -> completion());
    }

    public void completion() {
        finish();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}