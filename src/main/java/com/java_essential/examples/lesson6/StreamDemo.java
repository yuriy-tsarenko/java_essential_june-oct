package com.cbs.java_essential.examples.lesson6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class StreamDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader("demo.txt");
             FileWriter writer = new FileWriter("demo2.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append("\n");
            }
            System.out.println(builder.toString());
            builder.append("ADDED TEXT");
            writer.write(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("demo2.json");
            URL url = new URL("https://gorest.co.in/public-api/users");
            InputStream inputStream = url.openConnection().getInputStream();
            byte[] bytes = inputStream.readAllBytes();
            String json = new String(bytes);
            System.out.println(json);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
