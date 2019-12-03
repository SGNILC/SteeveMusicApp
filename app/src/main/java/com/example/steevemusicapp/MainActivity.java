package com.example.steevemusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ImageView bg;
    TextView nm;
    MediaPlayer song;
    ToggleButton tb;
    SeekBar sb;
//    AudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg = findViewById(R.id.imageView);
        nm = findViewById(R.id.textView);
        sb = findViewById(R.id.seekBar);
        int maxValue = sb.getMax();
        int sbValue = sb.getProgress();
        sb.setMax(50);
        sb.setProgress(1);
        tb = findViewById(R.id.toggleButton);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(tb.isChecked()){
                    song = MediaPlayer.create(MainActivity.this, R.raw.d2);
                    song.start();

                }
                else {
                    song.pause();
                    song.release();
                }

            }
        });

    }
}
