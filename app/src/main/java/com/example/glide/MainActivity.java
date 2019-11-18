package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView mImgDemo;
    private Button button;
    private final String url="https://www.sarakadee.com/blog/oneton/wp-content/uploads/2017/12/cat-cute-e1533862828469.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgDemo = (ImageView) findViewById(R.id.imgDemo);
        button = (Button) findViewById(R.id.btnLond);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(MainActivity.this).load(url).into(mImgDemo);
            }
        });
    }
}
