package com.example.sonali_app4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isdog=true;
    public void change(View view){

        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView4);
        if(isdog){
            imageView.animate().setDuration(2000).alpha(1);
            imageView2.animate().setDuration(2000).alpha(0);
            isdog=false;
        }else{
            imageView.animate().setDuration(2000).alpha(0);
            imageView2.animate().setDuration(2000).alpha(1);
            isdog=true;

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.animate().setDuration(2000).alpha(0);
    }
}