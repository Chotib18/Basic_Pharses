package com.chotib.basic_pharses;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sound_Alpukat(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.alpukat);
        mp.start();
    }

    public void Sound_Apel(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.apel);
        mp.start();
    }

    public void Sound_Ceri(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.ceri);
        mp.start();
    }

    public void Sound_Durian(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.durian);
        mp.start();
    }

    public void Sound_JambuAir(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.jambu_air);
        mp.start();
    }

    public void Sound_Manggis(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.manggis);
        mp.start();
    }

    public void Sound_Stroberi(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.stroberi);
        mp.start();
    }
}