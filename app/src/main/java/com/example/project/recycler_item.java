package com.example.project;

import com.google.gson.annotations.SerializedName;

public class recycler_item {

    @SerializedName("name")
    protected String country;
    @SerializedName("company")
    protected String population;
    @SerializedName("location")
    protected String squarekm;



    public String getcountry() {
        return country;
    }

    public String getPopulation() {
        return population;
    }

    public String getSquarekm() {
        return squarekm;
    }
}
