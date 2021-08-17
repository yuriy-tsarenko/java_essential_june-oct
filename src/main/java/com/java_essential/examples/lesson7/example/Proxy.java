package com.java_essential.examples.lesson7.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

public interface Proxy {

    @GET
    @Path("/users")
    @Consumes(value = "application/json")
    @Produces(value = "application/json")
    Response getUsers();
}
