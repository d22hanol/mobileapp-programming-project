package com.example.project;

import com.google.gson.annotations.SerializedName;

public class recycler_item {
    protected String ID;

    @SerializedName(value = "type", alternate = "login")
    protected String Login;
    @SerializedName(value = "name", alternate = "country")
    protected String country;
    @SerializedName(value = "company", alternate = "population")
    protected int population;
    @SerializedName(value = "size", alternate = "squarekm")
    protected int squarekm;

    public String getID() {
        return ID;
    }

    public String getLogin() {
        return Login;
    }

    public String getcountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getSquarekm() {
        return squarekm;
    }
}
