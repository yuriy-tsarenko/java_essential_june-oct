package com.java_essential.examples.lesson9.example.response;

import com.google.gson.annotations.SerializedName;
import com.java_essential.examples.lesson9.example.dto.PostDto;
import lombok.ToString;

import java.util.List;

@ToString
public class PostResponse extends GenericResponse<PostDto> {

    @SerializedName("data")
    public List<PostDto> data;

    @Override
    public List<PostDto> getContent() {
        return data;
    }
}
