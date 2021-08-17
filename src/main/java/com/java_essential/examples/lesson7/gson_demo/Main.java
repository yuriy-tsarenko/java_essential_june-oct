package com.java_essential.examples.lesson7.gson_demo;

import com.java_essential.examples.lesson7.gson_demo.dto.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
        try {
            String data = getData("https://gorest.co.in/public-api/users");

            System.out.println(data);
            String[] split = data.split("");
            String[] split2 = data.split("\"data\"");
            String[] split3 = data.split("[{}]");
            System.out.println(Arrays.toString(split));
            System.out.println(Arrays.toString(split2));
            System.out.println(Arrays.toString(split3));
            int length = split2.length;
            System.out.println(length);
            int length2 = split3.length;
            System.out.println(length2);

            Root root = gson.fromJson(data, Root.class);
            System.out.println(gson.toJson(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getData(String path) throws IOException {
        URL url = new URL(path);
        InputStream inputStream = url.openConnection().getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        return new String(bytes);
    }
}
