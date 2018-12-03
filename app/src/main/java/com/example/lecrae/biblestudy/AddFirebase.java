package com.example.lecrae.biblestudy;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddFirebase {

    public static final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static final DatabaseReference databaseReference = database.getReference("Users");

    public static String reg;

    public static final DatabaseReference userRef = databaseReference.child(reg);

//        Data:First Name,Second Name,Year,Hostel,Gender,Room,School,Phone.

    public static final DatabaseReference fnameReference=userRef.child("FName");
    public static final DatabaseReference lnameReference=userRef.child("LName");
    public static final DatabaseReference yearReference=userRef.child("Year");
    public static final DatabaseReference hostelReference=userRef.child("Hostel");
    public static final DatabaseReference genderRef =userRef.child("Gender");
    public static final DatabaseReference roomReference=userRef.child("Room number");
    public static final DatabaseReference schoolReference=userRef.child("School");
    public static final DatabaseReference phoneReference = userRef.child("Phone");
}
