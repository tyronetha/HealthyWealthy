package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    public ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.namebutton);
        SeekBar seeker = findViewById(R.id.seekBar5);

        image = findViewById(R.id.test);
        button.setOnClickListener(view -> setContentView(R.layout.intro));

        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                switch (i){
                    case(1):
                        image.setImageResource(R.drawable.frustrated);
                        break;
                    case(2):
                        image.setImageResource(R.drawable.tired_brike);
                        break;

                    default:
                        image.setImageResource(R.drawable.just_ok);
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        });


    }
}