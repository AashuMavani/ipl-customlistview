package com.example.ipl_customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ipl_list_activity extends AppCompatActivity {
    ImageView img1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipl_list);
        img1=findViewById(R.id.img1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);

        int position=getIntent().getIntExtra("position",0);
        String[]title=getIntent().getStringArrayExtra("titlearr");
        String[]subtitle=getIntent().getStringArrayExtra("subtitlearr");
        int[]img=getIntent().getIntArrayExtra("imgarr");

        img1.setImageResource(img[position]);
        t1.setText(title[position]);
        t2.setText(subtitle[position]);
    }
}