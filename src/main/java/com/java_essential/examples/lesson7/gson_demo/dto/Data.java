package com.java_essential.examples.lesson7.gson_demo.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Data {
    public int id;
    public String name;
    public String email;
    public String gender;
    public String status;

    @SerializedName("created_at")
    public Date createdAt;
    @SerializedName("updated_at")
    public Date updatedAt;
}
