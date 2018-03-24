package com.example.owner.real_final.database;

/**
 * Created by vns on 2018-03-21.
 */

public class TravelData {
    String key;
    String budget ;
    String country;
    String end;
    String start;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public TravelData(){}


    public TravelData(String key, String budget, String country, String end, String start){
        this.key = key;
        this.budget = budget;
        this.country = country;
        this.end = end;
        this.start=start;
    }
}
