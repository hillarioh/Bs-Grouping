package com.example.lecrae.biblestudy.activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.lecrae.biblestudy.data.BibleStudyContractor;
import com.example.lecrae.biblestudy.data.BibleStudyDbHelper;
import com.example.lecrae.biblestudy.models.GroupedMembers;
import com.example.lecrae.biblestudy.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ZoneActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardView1,cardView2,cardView3,cardView4,cardView5;
    public List<GroupedMembers> groupedMembers;
    private List<GroupedMembers> dbdata;
    public List<GroupedMembers> zone1;
    public List<GroupedMembers> zone2;
    public List<GroupedMembers> zone3;
    public List<GroupedMembers> zone4;
    public List<GroupedMembers> zone5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone);



        groupedMembers = new ArrayList<>();
        zone1 = new ArrayList<>();
        zone2 = new ArrayList<>();
        zone3 = new ArrayList<>();
        zone4 = new ArrayList<>();
        zone5 = new ArrayList<>();

        Intent intent = getIntent();
        groupedMembers =(List<GroupedMembers>) intent.getSerializableExtra("data");





        for (int i= 0;i<groupedMembers.size();i++){

            switch (groupedMembers.get(i).getZone_No()){
                case "1": zone1.add(groupedMembers.get(i));
                break;
                case "2": zone2.add(groupedMembers.get(i));
                    break;
                case "3": zone3.add(groupedMembers.get(i));
                    break;
                case "4": zone4.add(groupedMembers.get(i));
                    break;
                case "5": zone5.add(groupedMembers.get(i));
                    break;
            }

        }

        cardView1= findViewById(R.id.cardview1);
        cardView2 = findViewById(R.id.cardview2);
        cardView3 = findViewById(R.id.cardview3);
        cardView4 = findViewById(R.id.cardview4);
        cardView5 = findViewById(R.id.cardview5);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ZoneActivity.this,GroupActivity.class);

        switch (v.getId()){
            case R.id.cardview1 :

                intent.putExtra("data", (Serializable) zone1);
                intent.putExtra("zone",1);
                startActivity(intent);
                break;
            case R.id.cardview2 :
                intent.putExtra("data", (Serializable) zone2);
                intent.putExtra("zone",2);
                startActivity(intent);
                break;
            case R.id.cardview3 :
                intent.putExtra("data", (Serializable) zone3);
                intent.putExtra("zone",3);
                startActivity(intent);
                break;
            case R.id.cardview4 :
                intent.putExtra("data", (Serializable) zone4);
                intent.putExtra("zone",4);
                startActivity(intent);
                break;
            case R.id.cardview5 :
                intent.putExtra("data", (Serializable) zone5);
                intent.putExtra("zone",5);
                startActivity(intent);
                break;
        }

    }
}
