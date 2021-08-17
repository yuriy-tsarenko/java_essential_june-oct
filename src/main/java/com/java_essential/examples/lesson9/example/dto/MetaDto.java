package com.java_essential.examples.lesson9.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MetaDto {
    @SerializedName("pagination")
    private PaginationDto paginationDto;
}
