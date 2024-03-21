package com.example.ipl_customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String title[]={"Hardik pandya","Sanju Samsom","Kl Rahul","Faf du plessis","Devid wanner","Shikhar dhavan","Shreyas iyer","Aiden markram","Ms dhoni","Rohit Shrma"};
    String subtitle[]={"Gujarat titans","Rajasthan Royals","Lucknow super titans","Royal challengers Banglore",
                       "Delhi captains","Pnjab kings","Kolkta Knight Rider","Sunrise Hyderabad",
                       "chennai super kings","Mumbai Indians"};
    int img[]={R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,
                  R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,R.drawable.img_9};

    CustomAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);

        adaptor=new CustomAdaptor(MainActivity.this,title,subtitle,img);
        listView.setAdapter(adaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,ipl_list_activity.class);
                intent.putExtra("position",position);
                intent.putExtra("imgarr",img);
                intent.putExtra("titlearr",title);
                intent.putExtra("subtitlearr",subtitle);
                startActivity(intent);
            }
        });


    }
}