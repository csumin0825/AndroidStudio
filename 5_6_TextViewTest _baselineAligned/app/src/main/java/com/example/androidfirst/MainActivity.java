//package com.example.androidfirst;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TextView myText = new TextView(this);
//        myText.setText("코드로 문자열 출력하기");
//        setContentView(myText);
//    }
//}

package com.example.androidfirst;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gravity5);
    }
}