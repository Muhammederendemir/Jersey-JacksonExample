package com.model;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;

public class User {
    @FormParam("name")
    private String name;

    @QueryParam("count")
    private int count;

    @HeaderParam("Content-Type")
    private String contentType;

    @Override
    public String toString() {
        return "UserInput{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", contentType='" + contentType + '\'' +
                '}';
    }
}
