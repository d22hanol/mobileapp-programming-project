package com.example.project;

import com.google.gson.annotations.SerializedName;

public class recycler_item {
    protected String ID;
    protected String Login;

    @SerializedName(value = "type", alternate = "login")


    protected String country;
    protected int population;
    protected int flag;
    protected int squarekm;




}
