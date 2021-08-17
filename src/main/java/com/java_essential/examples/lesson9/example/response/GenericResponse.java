package com.java_essential.examples.lesson9.example.response;

import com.google.gson.annotations.SerializedName;
import com.java_essential.examples.lesson9.example.dto.MetaDto;

import java.util.List;

public abstract class GenericResponse<T> {

    @SerializedName("code")
    public Integer code;

    @SerializedName("meta")
    public MetaDto meta;

    public abstract List<T> getContent();
}
