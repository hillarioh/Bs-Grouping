package com.example.lecrae.biblestudy.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.lecrae.biblestudy.adapters.GroupAdapter;
import com.example.lecrae.biblestudy.models.GroupedMembers;
import com.example.lecrae.biblestudy.R;

import java.util.ArrayList;
import java.util.List;

public class ViewActivity extends AppCompatActivity {

    public ListView listView ;
    public List<GroupedMembers> groupedMembers;
    public GroupAdapter groupAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        listView = findViewById(R.id.listView);
        groupedMembers = new ArrayList<>();

        Intent intent = getIntent();
        groupedMembers =(List<GroupedMembers>) intent.getSerializableExtra("data");
//        Toast.makeText(this, ""+groupedMembers.size(), Toast.LENGTH_SHORT).show();

//        groupAdapter = new GroupAdapter(this,groupedMembers);

//        listView.setAdapter(groupAdapter);




    }
}
