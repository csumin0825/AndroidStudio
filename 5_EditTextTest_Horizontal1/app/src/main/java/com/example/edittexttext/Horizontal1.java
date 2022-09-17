package com.example.edittexttext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Horizontal1 extends Activity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horizontal1);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                EditText edit = (EditText)findViewById(R.id.edit);
                String str = edit.getText().toString();
                Toast.makeText(Horizontal1.this,str,Toast.LENGTH_SHORT).show();
            }
        });
    }
}