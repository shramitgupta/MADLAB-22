package com.example.sonali_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isegg=true;
    public void change(View view){
        ImageView iv = findViewById(R.id.imageView);
        if(isegg){
            iv.setImageResource(R.drawable.cat);
            isegg=false;
        }else{
            iv.setImageResource(R.drawable.egg2);
            isegg=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}