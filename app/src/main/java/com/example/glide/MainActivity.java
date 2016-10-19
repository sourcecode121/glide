package com.example.glide;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.image_1);
        imageView2 = (ImageView) findViewById(R.id.image_2);

        Glide.with(this)
                .load(R.drawable.yoda)
                .crossFade(5000)
                .centerCrop()
                .into(imageView1);

        Glide.with(this)
                .load(R.drawable.vader)
                .centerCrop()
                .animate(R.anim.animate_image_2)
                .into(imageView2);
    }
}
