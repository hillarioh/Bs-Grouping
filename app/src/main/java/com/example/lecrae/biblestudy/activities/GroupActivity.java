package com.example.lecrae.biblestudy.activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.lecrae.biblestudy.Control;
import com.example.lecrae.biblestudy.adapters.GroupAdapter;
import com.example.lecrae.biblestudy.data.BibleStudyContractor;
import com.example.lecrae.biblestudy.data.BibleStudyDbHelper;
import com.example.lecrae.biblestudy.models.GroupedMembers;
import com.example.lecrae.biblestudy.R;
import com.example.lecrae.biblestudy.adapters.ZoneAdapter;

import java.util.ArrayList;
import java.util.List;

public class GroupActivity extends AppCompatActivity implements ZoneAdapter.ListItemClickListener,GroupAdapter.MemberClickListener {

    Toolbar toolbar;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    public List<GroupedMembers> groupedMembers;
    private TextView mTextZone;
    private List<GroupedMembers> dbdata;

    BibleStudyDbHelper bibleStudyDbHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        bibleStudyDbHelper =new BibleStudyDbHelper(this);
        db = bibleStudyDbHelper.getReadableDatabase();

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        toolbar = findViewById(R.id.toolbar);

//        toolbar.setTitle("Groups");

        groupedMembers = new ArrayList<>();
        dbdata = new ArrayList<>();
        int group_no=0;
        mTextZone = findViewById(R.id.textZone);

        Intent intent = getIntent();
        groupedMembers =(List<GroupedMembers>) intent.getSerializableExtra("data");
        int zone=0;

        zone = intent.getIntExtra("zone",0);

        String[] projection = {BibleStudyContractor.BibleEntry.MEMBER_ID,
                BibleStudyContractor.BibleEntry.MEMBER_GROUP,BibleStudyContractor.BibleEntry.MEMBER_ZONE};

        String selection = BibleStudyContractor.BibleEntry.MEMBER_ZONE + "=?";

        String[] selectionArgs = {Integer.toString(zone)};

        Cursor cursor = db.query(BibleStudyContractor.BibleEntry.TABLE_1,projection,
                selection,selectionArgs,null,null,null);
        if (!(cursor.getCount()==0)){

            int IdColIndex = cursor.getColumnIndex(BibleStudyContractor.BibleEntry.MEMBER_ID);
            int GroupColIndex = cursor.getColumnIndex(BibleStudyContractor.BibleEntry.MEMBER_GROUP);
            int ZoneColIndex = cursor.getColumnIndex(BibleStudyContractor.BibleEntry.MEMBER_ZONE);

            while (cursor.moveToNext()){

                String id = cursor.getString(IdColIndex);
                String group = cursor.getString(GroupColIndex);
                String zoneh = cursor.getString(ZoneColIndex);

//                Toast.makeText(this, ""+cursor.getCount(), Toast.LENGTH_SHORT).show();
                dbdata.add(new GroupedMembers(Integer.parseInt(group),zoneh,id));


            }

        }





        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(false);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        switch (zone) {
            case 1: group_no = Control.zone_1_groups;


            mTextZone.setText("1");
            break;
            case 2: group_no = Control.zone_2_groups;
                mTextZone.setText("2");
                break;
            case 3: group_no = Control.zone_3_groups;
                mTextZone.setText("3");
                break;
            case 4: group_no = Control.zone_4_groups;
                mTextZone.setText("4");
                break;
            case 5: group_no = Control.zone_5_groups;
                mTextZone.setText("5");
                break;
        }

        int[] group = new int[group_no];

        for (int i=0;i<group_no;i++){
            group[i] = i;
        }

        ZoneAdapter zoneAdapter = new ZoneAdapter(dbdata,this,group,this,this);

        recyclerView.setAdapter(zoneAdapter);

//        GroupAdapter.ViewHolder
//
//        GroupAdapter.ViewHolder.mTextPos.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                return false;
//            }
//        });

    }

    @Override
    public void onLongClick(int position, View view) {
        Toast.makeText(this, "POS: "+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongGroupClick(int position, View view) {
        Toast.makeText(this, "POS: "+position, Toast.LENGTH_SHORT).show();
//        System.exit(0);
    }
}
