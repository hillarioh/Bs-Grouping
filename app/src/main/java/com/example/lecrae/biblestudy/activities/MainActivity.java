package com.example.lecrae.biblestudy.activities;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lecrae.biblestudy.Control;
import com.example.lecrae.biblestudy.data.BibleStudyContractor;
import com.example.lecrae.biblestudy.data.BibleStudyDbHelper;
import com.example.lecrae.biblestudy.models.GroupedMembers;
import com.example.lecrae.biblestudy.models.Member;
import com.example.lecrae.biblestudy.R;
import com.example.lecrae.biblestudy.models.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference = database.getReference("Users");
    public BibleStudyDbHelper bibleStudyDbHelper;
    public SQLiteDatabase sqLiteDatabase;


    private User students;
    List<String> user_reg;
    List<Member> userList;
    List<User> updatedUser;

    List<GroupedMembers> groupedMembers;

    List<Member> zone1;
    List<Member> zone2;
    List<Member> zone3;
    List<Member> zone4;
    List<Member> zone5;

    public static final String TAG = "main activity";

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students = new User();
        user_reg = new ArrayList<String>();
        userList = new ArrayList<>();
        updatedUser = new ArrayList<>();
        groupedMembers = new ArrayList<>();

        bibleStudyDbHelper = new BibleStudyDbHelper(this);
        sqLiteDatabase = bibleStudyDbHelper.getWritableDatabase();

        user_reg = students.getRegistration();
        updatedUser = students.getUserList();

        zone1 = new ArrayList<>();
        zone2 = new ArrayList<>();
        zone3 = new ArrayList<>();
        zone4 = new ArrayList<>();
        zone5 = new ArrayList<>();

        textView = (TextView) findViewById(R.id.jerk);

//        Toast.makeText(this, "" + updatedUser.size(), Toast.LENGTH_SHORT).show();

        for (int i = 0; i < user_reg.size(); i++) {
            userList.add(new Member(user_reg.get(i), updatedUser.get(i).getFname(), updatedUser.get(i).getSname(),
                    updatedUser.get(i).getYear(), updatedUser.get(i).getHostel(), updatedUser.get(i).getGender(),
                    updatedUser.get(i).getRoom(), updatedUser.get(i).getSchool(), updatedUser.get(i).getPhone()));
        }

        innerData();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ZoneActivity.class);
//                intent.putCharSequenceArrayListExtra("goods",groupedMembers);

                intent.putExtra("data", (Serializable) groupedMembers);
                startActivity(intent);
            }
        });


    }

    public void innerData() {

        for (int i = 0; i < userList.size(); i++) {

            switch (userList.get(i).getHostel()) {

                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "H":
                case "J":
                case "K":
                    zone1.add(userList.get(i));
                    break;

                case "L":
                case "M":
                case "C. HOUSES":
                    zone2.add(userList.get(i));
                    break;

                case "D.HOUSES":
                case "E.HOUSES":
                case "F.HOUSES":
                    zone3.add(userList.get(i));
                    break;

                case "BLUE GATE":
                    zone4.add(userList.get(i));
                    break;

                case "DELAWERE":
                    zone5.add(userList.get(i));
                    break;

            }
        }

        groupZone1("1", zone1);
        groupZone1("2", zone2);
        groupZone1("3", zone3);
        groupZone1("4", zone4);
        groupZone1("5", zone5);


    }

    public void groupZone1(String zone_no, List<Member> zone1User) {
        ContentValues contentValues = new ContentValues();

        if (zone1User.isEmpty()) {
            Toast.makeText(this, "There is no user", Toast.LENGTH_SHORT).show();
            return;
        }

        List<Member> zone1_female = new ArrayList<>();
        List<Member> zone1_male = new ArrayList<>();


        for (int j = 0; j < zone1User.size(); j++) {
            if ((zone1User.get(j).getGender()).equals("F")) {
                zone1_female.add(zone1User.get(j));
            } else {
                zone1_male.add(zone1User.get(j));
            }

        }

        int no_of_groups = 0;
        int remainder = 0;
        StringBuilder sb = new StringBuilder();
//
        if ((zone1User.size() % 8) > 4) {
            no_of_groups = (zone1User.size() / 8) + 1;
            remainder = zone1User.size() % 8;
        } else {
            no_of_groups = zone1User.size() / 8;
        }

        switch (zone_no) {
            case "1":
                Control.zone_1_groups = no_of_groups;
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_ZONE, "1");
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_NO, no_of_groups);
                long rowId = sqLiteDatabase.insert(BibleStudyContractor.BibleEntry.TABLE_2, null, contentValues);
                break;
            case "2":
                Control.zone_2_groups = no_of_groups;
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_ZONE, "2");
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_NO, no_of_groups);
                long rowId1 = sqLiteDatabase.insert(BibleStudyContractor.BibleEntry.TABLE_2, null, contentValues);
                break;
            case "3":
                Control.zone_3_groups = no_of_groups;
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_ZONE, "3");
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_NO, no_of_groups);
                long rowId2 = sqLiteDatabase.insert(BibleStudyContractor.BibleEntry.TABLE_2, null, contentValues);
                break;
            case "4":
                Control.zone_4_groups = no_of_groups;
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_ZONE, "4");
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_NO, no_of_groups);
                long rowId3 = sqLiteDatabase.insert(BibleStudyContractor.BibleEntry.TABLE_2, null, contentValues);
                break;
            case "5":
                Control.zone_5_groups = no_of_groups;
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_ZONE, "5");
                contentValues.put(BibleStudyContractor.BibleEntry.GROUP_NO, no_of_groups);
                long rowId4 = sqLiteDatabase.insert(BibleStudyContractor.BibleEntry.TABLE_2, null, contentValues);
                break;

        }

        int i = 0;
        int k = 0;

        while (k < zone1User.size()) {

            for (int j = 0; j < no_of_groups; j++) {

                if (!(zone1_female.isEmpty()) && (!(zone1_male.isEmpty()))) {
                    sb.append(zone1_female.get(0).getId() + "-" + zone1_male.get(0).getId());
                    zone1_female.remove(0);
                    zone1_male.remove(0);
                    k = k + 2;
                } else if (!(zone1_female.isEmpty()) && (zone1_male.isEmpty())) {
                    if (zone1_female.size() > 1) {
                        sb.append(zone1_female.get(0).getId() + "-" + zone1_female.get(1).getId());
                        zone1_female.remove(0);

                        zone1_female.remove(0);
                        k = k + 2;
                    } else {
                        sb.append(zone1_female.get(0).getId());
                        zone1_female.remove(0);
                        k++;
                    }

                } else if (!(zone1_male.isEmpty()) && (zone1_female.isEmpty())) {
                    if (zone1_male.size() > 1) {
                        sb.append(zone1_male.get(0).getId() + "-" + zone1_male.get(1).getId());
                        zone1_male.remove(0);
                        zone1_male.remove(0);
                        k = k + 2;
                    } else {
                        sb.append(zone1_male.get(0).getId() + "-");
                        zone1_male.remove(0);
                        k++;
                    }
                }

                sb.append(",");
            }
            sb.append(":");
        }
        parseStringBuilder(sb, zone_no);
    }

    private void parseStringBuilder(StringBuilder stringBuilder, String zone) {


        ContentValues contentValues = new ContentValues();

        String[] first = stringBuilder.toString().split(":");

        for (int i = 0; i <= first.length - 1; i++) {

            String[] level = first[i].split(",");

            for (int j = 0; j <= level.length - 1; j++) {

                String[] leastLevel = level[j].split("-");
                for (int k = 0; k <= leastLevel.length - 1; k++) {

                    groupedMembers.add(new GroupedMembers(j, zone, leastLevel[k]));
                    contentValues.put(BibleStudyContractor.BibleEntry.MEMBER_ID, leastLevel[k]);
                    contentValues.put(BibleStudyContractor.BibleEntry.MEMBER_ZONE, zone);
                    contentValues.put(BibleStudyContractor.BibleEntry.MEMBER_GROUP, Integer.toString(j));
                    contentValues.put(BibleStudyContractor.BibleEntry.MEMBER_STATUS, "NO");

                    long rowId = sqLiteDatabase.insert(BibleStudyContractor.BibleEntry.TABLE_1, null, contentValues);

                    if (rowId == -1) {
                        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "" + rowId, Toast.LENGTH_SHORT).show();
                    }


                }


            }


        }

    }

    @Override
    protected void onStart() {
        super.onStart();


    }
}










