package com.example.androidfirst;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class frame extends Activity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                ImageView img = (ImageView)findViewById(R.id.img);
                if(img.getVisibility() == View.VISIBLE){
                    img.setVisibility(View.INVISIBLE);
                }else{
                    img.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}