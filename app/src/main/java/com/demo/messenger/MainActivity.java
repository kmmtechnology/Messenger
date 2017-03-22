package com.demo.messenger;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
//testi bracnhg comments
public class MainActivity extends AppCompatActivity {
   private TextView textView;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //comment1
        textView=(TextView)findViewById(R.id.textView);
        Typeface typeface=Typeface.createFromAsset(getAssets(),getString(R.string.font_path));
        textView.setTypeface(typeface); //comment2
    }
}
