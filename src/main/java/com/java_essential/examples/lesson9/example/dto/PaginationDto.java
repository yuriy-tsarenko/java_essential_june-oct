package com.java_essential.examples.lesson9.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class PaginationDto {

    @SerializedName("total")
    private Integer total;

    @SerializedName("pages")
    private Integer pages;

    @SerializedName("page")
    private Integer page;

    @SerializedName("limit")
    private Integer limit;
}

