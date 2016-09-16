package com.example.android.miwok;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SongsActivity extends AppCompatActivity {

    Button btnPlay,btnPause;
    MediaPlayer media;
    boolean bit = false;
    int length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        btnPlay = (Button)findViewById(R.id.btn_play);
        btnPause = (Button)findViewById(R.id.btn_pause);
        PlayMusic();
        PauseMusic();
    }
    public void PlayMusic() {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bit == false) {
                    media = MediaPlayer.create(v.getContext(), R.raw.aadat);
                    media.start();
                }
                else {
                    media.seekTo(length);
                    media.start();
                }
            }
        });
    }

    public void PauseMusic() {
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media.pause();
                bit = true;
                length= media.getCurrentPosition();
            }
        });
    }
}
