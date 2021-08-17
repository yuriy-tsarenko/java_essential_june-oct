package com.java_essential.examples.lesson9.example.response;

import com.google.gson.annotations.SerializedName;
import com.java_essential.examples.lesson9.example.dto.CommentDto;
import lombok.ToString;

import java.util.List;

@ToString
public class CommentResponse extends GenericResponse<CommentDto> {

    @SerializedName("data")
    public List<CommentDto> data;

    @Override
    public List<CommentDto> getContent() {
        return data;
    }
}
