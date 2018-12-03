package com.example.lecrae.biblestudy.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    public String id;
    public String fname;
    public String sname;
    public String year;
    public String hostel;
    public String gender;
    public int room;
    public String school;
    public String phone;

//    userList.add(new User("JOSEPH","SANDI","2015","A","M",20,"INFORMATION_SCI","702338066"));

    public User( String fname,String sname,String year,String hostel,String gender,int room,
                 String school, String phone){
        this.fname = fname;
        this.sname = sname;
        this.year = year;
        this.hostel = hostel;
        this.gender = gender;
        this.room = room;
        this.school = school;
        this.phone = phone;
    }


    public User() {
    }

    List<User> userList = new ArrayList<>();
    List<String> registration = new ArrayList<>();


    public List<String> getRegistration() {
        registration.add("MUCU_001_2015");
        registration.add("MUCU_001_2016");
        registration.add("MUCU_001_2017");
        registration.add("MUCU_001_2018");

        registration.add("MUCU_002_2015");
        registration.add("MUCU_002_2016");
        registration.add("MUCU_002_2017");
        registration.add("MUCU_002_2018");

        registration.add("MUCU_003_2015");
        registration.add("MUCU_003_2016");
        registration.add("MUCU_003_2017");
        registration.add("MUCU_003_2018");

        registration.add("MUCU_004_2015");
        registration.add("MUCU_004_2016");
        registration.add("MUCU_004_2017");
        registration.add("MUCU_004_2018");

        registration.add("MUCU_005_2015");
        registration.add("MUCU_005_2016");
        registration.add("MUCU_005_2017");
        registration.add("MUCU_005_2018");

        registration.add("MUCU_006_2015");
        registration.add("MUCU_006_2016");
        registration.add("MUCU_006_2017");
        registration.add("MUCU_006_2018");

        registration.add("MUCU_007_2015");
        registration.add("MUCU_007_2016");
        registration.add("MUCU_007_2017");
        registration.add("MUCU_007_2018");

        registration.add("MUCU_008_2015");
        registration.add("MUCU_008_2016");
        registration.add("MUCU_008_2017");
        registration.add("MUCU_008_2018");

        registration.add("MUCU_009_2015");
        registration.add("MUCU_009_2016");
        registration.add("MUCU_009_2017");
        registration.add("MUCU_009_2018");

        registration.add("MUCU_010_2015");
        registration.add("MUCU_010_2016");
        registration.add("MUCU_010_2017");
        registration.add("MUCU_010_2018");

        registration.add("MUCU_011_2015");
        registration.add("MUCU_011_2016");
        registration.add("MUCU_011_2017");
        registration.add("MUCU_011_2018");

        registration.add("MUCU_012_2015");
        registration.add("MUCU_012_2016");
        registration.add("MUCU_012_2017");
        registration.add("MUCU_012_2018");

        registration.add("MUCU_013_2015");
        registration.add("MUCU_013_2016");
        registration.add("MUCU_013_2017");
        registration.add("MUCU_013_2018");

        registration.add("MUCU_014_2015");
        registration.add("MUCU_014_2016");
        registration.add("MUCU_014_2017");
        registration.add("MUCU_014_2018");

        registration.add("MUCU_015_2015");
        registration.add("MUCU_015_2016");
        registration.add("MUCU_015_2017");
        registration.add("MUCU_015_2018");

        registration.add("MUCU_016_2015");
        registration.add("MUCU_016_2016");
        registration.add("MUCU_016_2017");
        registration.add("MUCU_016_2018");

        registration.add("MUCU_017_2015");
        registration.add("MUCU_017_2016");
        registration.add("MUCU_017_2017");
        registration.add("MUCU_017_2018");

        registration.add("MUCU_018_2015");
        registration.add("MUCU_018_2016");
        registration.add("MUCU_018_2017");
        registration.add("MUCU_018_2018");

        registration.add("MUCU_019_2015");
        registration.add("MUCU_019_2016");
        registration.add("MUCU_019_2017");
        registration.add("MUCU_019_2018");

        registration.add("MUCU_020_2015");
        registration.add("MUCU_020_2016");
        registration.add("MUCU_020_2017");
        registration.add("MUCU_020_2018");

        registration.add("MUCU_021_2015");
        registration.add("MUCU_021_2016");
        registration.add("MUCU_021_2017");
        registration.add("MUCU_021_2018");

        registration.add("MUCU_022_2015");
        registration.add("MUCU_022_2016");
        registration.add("MUCU_022_2017");
        registration.add("MUCU_022_2018");

        registration.add("MUCU_023_2015");
        registration.add("MUCU_023_2016");
        registration.add("MUCU_023_2017");
        registration.add("MUCU_023_2018");

        registration.add("MUCU_024_2015");
        registration.add("MUCU_024_2016");
        registration.add("MUCU_024_2017");
        registration.add("MUCU_024_2018");

        registration.add("MUCU_025_2015");
        registration.add("MUCU_025_2016");
        registration.add("MUCU_025_2017");
        registration.add("MUCU_025_2018");

        registration.add("MUCU_026_2015");
        registration.add("MUCU_026_2016");
        registration.add("MUCU_026_2017");
        registration.add("MUCU_026_2018");

        registration.add("MUCU_027_2015");
        registration.add("MUCU_027_2016");

        return registration;
    }

    public List<User> getUserList() {

        userList.add(new User("JOSEPH","SANDI","2015","A","M",20,"INFORMATION_SCI","702338066"));
        userList.add(new User("OGEGA","OYUGI","2016","B","M",32,"ENGINEERING","02338066"));
        userList.add(new User("MARTIN ","ASUTSI","2017","C","M",63,"EDUCATION","702338066"));
        userList.add(new User("OWENDI ","SARAH","2018","D","F",64,"ARTS AND SOC","702338066"));
        userList.add(new User("KIMEU ","KALUNDE","2015","E","F",112,"BIOLOGICAL","702338066"));
        userList.add(new User("MUHONJA ","PRUDENCE","2016","F","M",234,"BUSINESS","702338066"));
        userList.add(new User("OGEGA ","ONWONGA","2017","G","M",422,"HUMAN RESOURCE","702338066"));
        userList.add(new User("ANTHONY ","MASESE","2018","H","M",321,"INFORMATION SCI","702338066"));
        userList.add(new User("MUTUKU ","NDUKU","2015","J","F",45,"ENGINEERING","702338066"));
        userList.add(new User("FAIZA ","MOHAMMED","2016","K","F",56,"EDUCATION","702338066"));
        userList.add(new User("GLORIAN","SANDE","2017","L","F",79,"ARTS AND SOC","702338066"));
        userList.add(new User("GUORO ","OBONYO","2018","M","M",88,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("NICKSON ","MUTUKU","2015","C. HOUSES","M",43,"BUSINESS","702338066"));
        userList.add(new User("MUTUA ","MWONGELI","2016","D.HOUSES","F",9,"HUMAN RESOURCE","702338066"));
        userList.add(new User("JOSEPH","MAMBO","2017","E.HOUSES","M",8,"INFORMATION SCI","702338066"));
        userList.add(new User("SAYO","DOROTHY","2018","F.HOUSES","F",70,"ENGINEERING","702338066"));
        userList.add(new User("NYABUTO ","COSMAS","2015","BLUE GATE","M",554,"EDUCATION","702338066"));
        userList.add(new User("EMMANUEL ","KIPROTICH","2016","DELAWERE","M",45,"ARTS AND SOC","702338066"));
        userList.add(new User("DENILSON","OMONDI","2017","A","M",64,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("MUTUA","KIMANZI","2018","B","M",34,"BUSINESS","702338066"));
        userList.add(new User("DENNIS ","ONCHIEKU","2015","C","M",34,"HUMAN RESOURCE","702338066"));
        userList.add(new User("HORIZON","MBIMDYE","2016","D","F",66,"INFORMATION SCI","702338066"));
        userList.add(new User("KELVIN ","MUSEE","2017","E","F",33,"ENGINEERING","702338066"));
        userList.add(new User("OKENO ","SOMBA","2018","F","F",56,"EDUCATION","702338066"));
        userList.add(new User("SINGWA ","ADHIAMBO","2015","G","F",66,"ARTS AND SOC","702338066"));
        userList.add(new User("VINCENT","SHITANDI","2016","H","F",54,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("ABDALA","HUQA","2017","J","M",43,"BUSINESS","702338066"));
        userList.add(new User("MUKABANA","MARIGA","2018","K","M",23,"HUMAN RESOURCE","702338066"));
        userList.add(new User("COLLINS","OUMA","2015","L","M",32,"INFORMATION SCI","702338066"));
        userList.add(new User("KASUI","MUSILI","2016","M","F",32,"ENGINEERING","702338066"));
        userList.add(new User("KHASINYIRE" ,"JOHN","2017","C. HOUSES","M",23,"EDUCATION","702338066"));
        userList.add(new User("OTIENO","AKINYI","2018","D.HOUSES","F",78,"ARTS AND SOC","702338066"));
        userList.add(new User("JENTYNE","KHAYERI","2015","E.HOUSES","F",98,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("DOLPHINE","MMBAKA","2016","F.HOUSES","F",76,"BUSINESS","702338066"));
        userList.add(new User("OCHIENG ","OTIENO","2017","BLUE GATE","M",786,"HUMAN RESOURCE","702338066"));
        userList.add(new User("MAKORI","OGEGA","2018","DELAWERE","M",65,"INFORMATION SCI","702338066"));
        userList.add(new User("EDDAH","KABEYEKA","2015","A","F",43,"ENGINEERING","702338066"));
        userList.add(new User("GIDEON","ONSONGO","2016","B","M",21,"EDUCATION","702338066"));
        userList.add(new User("NEWTON","AVAYE","2017","C","M",45,"ARTS AND SOC","702338066"));
        userList.add(new User("ONDIEKI" ,"KWAMBOKA","2018","D","F",53,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("BRENDA","NASAMBU","2015","E","F",34,"BUSINESS","702338066"));
        userList.add(new User("ISMAEL","MILEHA","2016","F","F",34,"HUMAN RESOURCE","702338066"));
        userList.add(new User("JUSTINE","KIBET","2017","G","F",64,"INFORMATION SCI","702338066"));
        userList.add(new User("HASSAN ","MOHAMMED","2018","H","M",456,"ENGINEERING","702338066"));
        userList.add(new User("JACKSON","GECHURE","2015","J","M",35,"EDUCATION","702338066"));
        userList.add(new User("REINHARD","ASIAGO","2016","K","M",54,"ARTS AND SOC","702338066"));
        userList.add(new User("NZIOKA","MUSENGYA","2017","L","F",643,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("KISYULA","MBITHE","2018","M","F",55,"BUSINESS","702338066"));
        userList.add(new User("DUNCAN","NDEGWA","2015","C. HOUSES","M",22,"HUMAN RESOURCE","702338066"));
        userList.add(new User("RACHAEL" ,"SUSAN","2016","D.HOUSES","F",21,"INFORMATION SCI","702338066"));
        userList.add(new User("PETER","MUTUNGA","2017","E.HOUSES","F",43,"ENGINEERING","702338066"));
        userList.add(new User("MAKORI","NYOTEYO","2018","F.HOUSES","M",42,"EDUCATION","702338066"));
        userList.add(new User("WAMBULWA","MUYEKHO","2015","BLUE GATE","F",34,"ARTS AND SOC","702338066"));
        userList.add(new User("WYCLIFE","WAMBUA","2016","DELAWERE","M",32,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("CELESTINE","SHIKOLI","2017","A","F",23,"BUSINESS","702338066"));
        userList.add(new User("COLLINS","KABUKA","2018","B","F",32,"HUMAN RESOURCE","702338066"));
        userList.add(new User("SHAHENZA","MAHASI","2015","C","M",56,"INFORMATION SCI","702338066"));
        userList.add(new User("OLIVER","WABWIRE","2016","D","F",64,"ENGINEERING","702338066"));
        userList.add(new User("SHARON","OWISO","2017","E","F",76,"EDUCATION","702338066"));
        userList.add(new User("MUSULU","ADONIJA","2018","F","F",54,"ARTS AND SOC","702338066"));
        userList.add(new User("MMBUUKA","CHAMBU","2015","G","M",43,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("OTIATO","OTIENO","2016","H","M",21,"BUSINESS","702338066"));
        userList.add(new User("LUNG'AHI","BENTA","2017","J","F",16,"HUMAN RESOURCE","702338066"));
        userList.add(new User("PATRICK","MULANDI","2018","K","M",44,"INFORMATION SCI","702338066"));
        userList.add(new User("BABU MASSELINE","AWENDI","2015","L","F",21,"ENGINEERING","702338066"));
        userList.add(new User("SILAS","SIFUNA","2016","M","M",34,"EDUCATION","702338066"));
        userList.add(new User("MORANGA","LILIAN","2017","C. HOUSES","F",54,"ARTS AND SOC","702338066"));
        userList.add(new User("AOKO","DORIS","2018","D.HOUSES","F",32,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("PAUL","MWENDE","2015","E.HOUSES","M",56,"BUSINESS","702338066"));
        userList.add(new User("AMBROSE","OBONYO","2016","F.HOUSES","M",76,"HUMAN RESOURCE","702338066"));
        userList.add(new User("GRACE","MUSIMBI","2017","BLUE GATE","F",32,"INFORMATION SCI","702338066"));
        userList.add(new User("VICTORIA","MANTUI","2018","DELAWERE","F",12,"ENGINEERING","702338066"));
        userList.add(new User("CHRISTABEL","LIHAVI","2015","A","F",11,"EDUCATION","702338066"));
        userList.add(new User("NORINE","OKINYI","2016","B","M",111,"ARTS AND SOC","702338066"));
        userList.add(new User("DIANA","AWUOR","2017","C","F",16,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("IRINE","MUTHOKA","2018","D","F",111115,"BUSINESS","702338066"));
        userList.add(new User("AMWOCHA","ABINCHA","2015","E","M",15,"HUMAN RESOURCE","702338066"));
        userList.add(new User("ORWA","OGOLLA","2016","F","M",15,"INFORMATION SCI","702338066"));
        userList.add(new User("OYUGA","OTIENO","2017","G","M",51,"ENGINEERING","702338066"));
        userList.add(new User("MBUVI","LATUNGWA","2018","H","F",57,"EDUCATION","702338066"));
        userList.add(new User("JOHN","MOCHAMA","2015","J","M",54,"ARTS AND SOC","702338066"));
        userList.add(new User("MUTUA","KILONZO","2016","K","M",21,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("BRAVON","NYABUTO","2017","L","M",52,"BUSINESS","702338066"));
        userList.add(new User("MOHAMMED","GOLO","2018","M","M",41,"HUMAN RESOURCE","702338066"));
        userList.add(new User("ALUSIOLA","RODGERS","2015","C. HOUSES","M",45,"INFORMATION SCI","702338066"));
        userList.add(new User("ALFAYO","IMINZA","2016","D.HOUSES","M",47,"ENGINEERING","702338066"));
        userList.add(new User("MUTUNE","MUTHINI","2017","E.HOUSES","M",89,"EDUCATION","702338066"));
        userList.add(new User("SYLVIA","OSEN","2018","F.HOUSES","F",98,"ARTS AND SOC","702338066"));
        userList.add(new User("TABITHA","WANJALA","2015","BLUE GATE","F",63,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("RASTO","SYLVIA","2016","DELAWERE","F",84,"BUSINESS","702338066"));
        userList.add(new User("MBITHE","CATHERINE","2017","A","F",27,"HUMAN RESOURCE","702338066"));
        userList.add(new User("KIEMA","MARY","2018","B","F",78,"INFORMATION SCI","702338066"));
        userList.add(new User("VIVIAN","OMONDI","2015","C","F",87,"ENGINEERING","702338066"));
        userList.add(new User("OLGAH" ,"OSWAGO","2016","D","F",72,"EDUCATION","702338066"));
        userList.add(new User("LUNDO","AMOS","2017","E","M",21,"ARTS AND SOC","702338066"));
        userList.add(new User("JUDDY","MWACHIRU","2018","F","F",42,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("PHELISTAS","ESHIMULI","2015","G","F",214,"BUSINESS","702338066"));
        userList.add(new User("SAMUEL","KISANGAU","2016","H","M",58,"HUMAN RESOURCE","702338066"));
        userList.add(new User("PAUL ","ALEX","2017","J","M",75,"INFORMATION SCI","702338066"));
        userList.add(new User("MOKUA","LYDIA","2018","K","F",57,"ENGINEERING","702338066"));
        userList.add(new User("KAVULANI","LAVYNNE","2015","L","F",21,"EDUCATION","702338066"));
        userList.add(new User("NYANSAGERIA","BONFACE","2016","M","M",48,"ARTS AND SOC","702338066"));
        userList.add(new User("BENSON","AKWIRI","2017","C. HOUSES","M",
                87,"BIOLOGICAL" ,"702338066"));
        userList.add(new User("WALID","ISMAIL","2018","D.HOUSES","F",47,"BUSINESS","702338066"));
        userList.add(new User("NYAMASYO","MUMBUA","2015","E.HOUSES","F",5,"HUMAN RESOURCE","702338066"));
        userList.add(new User("OPIYO","ADHIAMBO","2016","F.HOUSES","F",47,"EDUCATION","702338066"));

        return userList;
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
