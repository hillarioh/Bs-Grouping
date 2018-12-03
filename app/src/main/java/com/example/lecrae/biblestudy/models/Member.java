package com.example.lecrae.biblestudy.models;

public class Member {

    public String id;
    public String fname;
    public String sname;
    public String year;
    public String hostel;
    public String gender;
    public int room;
    public String school;
    public String phone;

    public Member(){}

    public Member(String id, String fname, String sname, String year, String hostel, String gender, int room, String school, String phone) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.year = year;
        this.hostel = hostel;
        this.gender = gender;
        this.room = room;
        this.school = school;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getSname() {
        return sname;
    }

    public String getYear() {
        return year;
    }

    public String getHostel() {
        return hostel;
    }

    public String getGender() {
        return gender;
    }

    public int getRoom() {
        return room;
    }

    public String getSchool() {
        return school;
    }

    public String getPhone() {
        return phone;
    }
}
