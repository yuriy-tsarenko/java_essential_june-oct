package com.java_essential.examples.lesson7.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.log4j.Logger;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            InputStream data = (InputStream) getData("https://gorest.co.in/public-api");
            String json = new String(data.readAllBytes());
            System.out.println(json);
            System.out.println("----------------------pretty print-----------------------------");
            System.out.println(addEscaping(json));
        } catch (IOException | ApiCallException e) {
            log.warn(e);
        }
        System.out.println("----------------------second variant-----------------------------");
        try {
            String json = getDataV2("https://gorest.co.in/public-api/users");
            System.out.println(json);
            System.out.println("----------------------pretty print-----------------------------");
            System.out.println(addEscaping(json));
        } catch (IOException | ApiCallException e) {
            log.warn(e);
        }
    }

    public static Object getData(String baseUrl) throws IOException, ApiCallException {
        Proxy proxy = HttpProxyFactory.getProxy(baseUrl);
        Response response = proxy.getUsers();
        int status = response.getStatus();
        if (status != HttpStatus.SC_OK) {
            throw new ApiCallException("call failed: " + status);
        }
        return response.getEntity();
    }


    public static String getDataV2(String url) throws IOException, ApiCallException {
        HttpUriRequest request = new HttpGet(url);
        CloseableHttpClient client = HttpProxyFactory.getProxyV2();
        CloseableHttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != HttpStatus.SC_OK) {
            throw new ApiCallException("call failed: " + statusCode);
        }
        InputStream content = response.getEntity().getContent();
        Scanner scanner = new Scanner(content);
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNext()) {
            builder.append(scanner.nextLine());

        }
        client.close();
        return builder.toString();
    }

    public static String addEscaping(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        JsonElement jsonElement = JsonParser.parseString(json);
        return gson.toJson(jsonElement);
    }
}


