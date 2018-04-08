package com.bignerdranch.android.landlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        TextView textView = (TextView)findViewById(R.id.textView);

        textView.setText(getIntent().getStringExtra("Art_Piece"));
        imageView.setImageResource(getIntent().getIntExtra("Art",R.drawable.spiraljetty));
    }
}
