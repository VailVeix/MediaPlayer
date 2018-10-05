package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }

    public void playMusic(View view){
        mediaPlayer.start();
    }

    public void pauseMusic(View view){
        mediaPlayer.pause();
    }

    public void resetMusic(View view){
        mediaPlayer.setVolume(50, 50);
    }
}
