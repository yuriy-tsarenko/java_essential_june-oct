package com.java_essential.examples.lesson9.example.response;

import com.google.gson.annotations.SerializedName;
import com.java_essential.examples.lesson9.example.dto.UserDto;

import java.util.List;

public class UserResponse extends GenericResponse<UserDto> {

    @SerializedName("data")
    public List<UserDto> data;

    @Override
    public List<UserDto> getContent() {
        return this.data;
    }
}
