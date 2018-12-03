package com.example.lecrae.biblestudy.models;

import java.io.Serializable;

public class GroupedMembers implements Serializable {

    private int group_No ;
    private String id;
    private String zone_No;

    public GroupedMembers(int group_No,String zone_No, String id) {
        this.group_No = group_No;
        this.zone_No = zone_No;
        this.id = id;
    }

    public GroupedMembers(){}

    public int getGroup_No() {
        return group_No;
    }

    public String getZone_No() {
        return zone_No;
    }

    public String getId() {
        return id;
    }
}
