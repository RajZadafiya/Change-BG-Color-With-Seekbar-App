package com.example.changebgcolorwithseekbars;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.SeekBar;

import com.example.changebgcolorwithseekbars.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    int red=255,green=255,blue=255;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.tvRed.setText("Red = "+red);
        binding.tvGreen.setText("Green = "+green);
        binding.tvBlue.setText("Blue = "+blue);
        binding.background.setBackgroundColor(Color.rgb(red,green,blue));

       /* Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                int i=1;
                for(i=1;i<255;i++){
                    binding.image.setBackgroundColor(i);
                }
            }
        }, 5000);*/

//        float j = color(1);
//        binding.image1.setColorFilter((int) j);

        RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(5000);
        rotate.setInterpolator(new LinearInterpolator());

//        RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        binding.image.animate().rotationBy(360.0f).setDuration(90000).setInterpolator(new LinearInterpolator()).start();
//        binding.image.startAnimation(rotate);

        binding.red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red = i;
                binding.tvRed.setText("Red = "+red);
                binding.tvRed.setTextColor(Color.rgb(red-60,green-60,blue-60));
                binding.background.setBackgroundColor(Color.rgb(red,green,blue));
                binding.image.animate().rotationBy(360.0f).setDuration(2000).setInterpolator(new LinearInterpolator()).start();
                TranslateAnimation trans = new TranslateAnimation(-600, 600, -0, 0);
                trans.setDuration(2000);
                binding.image.startAnimation(trans);
                binding.cirleimage.animate().rotationBy(360.0f).setDuration(2000).setInterpolator(new LinearInterpolator()).start();
                TranslateAnimation trans2 = new TranslateAnimation(-600, 600, -0, 0);
                trans.setDuration(2000);
                binding.image.startAnimation(trans2);
//                binding.image.setColorFilter(Color.rgb(224,88,34 ));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                binding.moveseekbar.setText("Red Seekbar Moving");
                binding.image.setColorFilter(Color.rgb(red-80,green-80,blue-80));
                binding.moveseekbar.setTextColor(Color.rgb(red-40,green-40,blue-40));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                binding.moveseekbar.setText("Red Seekbar Stop");
                binding.image.setColorFilter(Color.rgb(red-80,green-80,blue-80));
                binding.moveseekbar.setTextColor(Color.rgb(red-40,green-40,blue-40));
            }
        });

        binding.green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                green = i;
                binding.tvGreen.setText("Green = "+green);
                binding.tvGreen.setTextColor(Color.rgb(red-60,green-60,blue-60));
                binding.background.setBackgroundColor(Color.rgb(red,green,blue));
                binding.image.animate().rotationBy(360.0f).setDuration(2000).setInterpolator(new LinearInterpolator()).start();
                TranslateAnimation trans = new TranslateAnimation(0, 0, 600, 0);
                trans.setDuration(1000);
                binding.image.startAnimation(trans);
                binding.cirleimage.animate().rotationBy(360.0f).setDuration(2000).setInterpolator(new LinearInterpolator()).start();
                TranslateAnimation trans1 = new TranslateAnimation(0, 0, 600, 0);
                trans.setDuration(1000);
                binding.image.startAnimation(trans1);
//                binding.image.animate().translationX(-700);
//                binding.image.animate().translationX(700);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                binding.moveseekbar.setText("Green Seekbar Moving");
                binding.image.setColorFilter(Color.rgb(red-80,green-80,blue-80));
                binding.moveseekbar.setTextColor(Color.rgb(red-40,green-40,blue-40));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                binding.moveseekbar.setText("Green Seekbar Stop");
                binding.image.setColorFilter(Color.rgb(red-80,green-80,blue-80));
                binding.moveseekbar.setTextColor(Color.rgb(red-40,green-40,blue-40));
            }
        });

        binding.blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue = i;
                binding.tvBlue.setText("Blue = "+blue);
                binding.tvBlue.setTextColor(Color.rgb(red-60,green-60,blue-60));
                binding.background.setBackgroundColor(Color.rgb(red,green,blue));
                binding.image.animate().rotationBy(360.0f).setDuration(2000).setInterpolator(new LinearInterpolator()).start();
                binding.cirleimage.animate().rotationBy(360.0f).setDuration(2000).setInterpolator(new LinearInterpolator()).start();
//                TranslateAnimation trans = new TranslateAnimation(-600, 600, -0, 0);
//                trans.setDuration(2000);
//                binding.image.startAnimation(trans);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                binding.moveseekbar.setText("Blue Seekbar Moving");
                binding.image.setColorFilter(Color.rgb(red-80,green-80,blue-80));
                binding.moveseekbar.setTextColor(Color.rgb(red-40,green-40,blue-40));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                binding.moveseekbar.setText("Blue Seekbar Stop");
                binding.image.setColorFilter(Color.rgb(red-80,green-80,blue-80));
                binding.moveseekbar.setTextColor(Color.rgb(red-40,green-40,blue-40));
            }
        });
    }

    public float color(float i){
        for(i=1;i<255;i++){
            i= (float) (i+0.001);
        }
        return i;
    }
}