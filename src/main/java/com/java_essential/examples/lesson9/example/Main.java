package com.java_essential.examples.lesson9.example;

import com.java_essential.examples.lesson9.example.dto.CommentDto;
import com.java_essential.examples.lesson9.example.dto.UserDto;
import com.java_essential.examples.lesson9.example.response.CommentResponse;
import com.java_essential.examples.lesson9.example.dto.PostDto;
import com.java_essential.examples.lesson9.example.response.PostResponse;
import com.java_essential.examples.lesson9.example.response.UserResponse;
import com.java_essential.examples.lesson9.example.util.ObjectBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            String commentData = getData("https://gorest.co.in/public-api/comments");

            System.out.println("--------------COMMENTS--------------------");
            List<CommentDto> commentDtos = ObjectBuilder.build(commentData, CommentResponse.class);
            for (CommentDto commentDto : commentDtos) {
                System.out.println(commentDto);
            }
            System.out.println("--------------POSTS--------------------");

            String postData = getData("https://gorest.co.in/public-api/posts");
            List<PostDto> postDtos = ObjectBuilder.build(postData, PostResponse.class);
            for (PostDto postDto : postDtos) {
                System.out.println(postDto);
            }

            System.out.println("--------------USERS--------------------");

            String userData = getData("https://gorest.co.in/public/v1/users");
            List<UserDto> userDtos = ObjectBuilder.build(userData, UserResponse.class);
            for (UserDto userDto : userDtos) {
                System.out.println(userDto);
            }

            System.out.println("--------------FIND USER BY ID--------------------");
            System.out.println(getUserById(55, userDtos));
        } catch (IOException e) {
            log.error(e);
        }
    }

    public static String getData(String resourceUrl) throws IOException {
        URL url = new URL(resourceUrl);
        InputStream inputStream = url.openConnection().getInputStream();
        return new String(inputStream.readAllBytes());
    }

    public static UserDto getUserById(Integer id, List<UserDto> users) {

        for (UserDto dto : users) {
            if (dto.getId().equals(id)) {
                return dto;
            }
        }

        return null;
    }
}
