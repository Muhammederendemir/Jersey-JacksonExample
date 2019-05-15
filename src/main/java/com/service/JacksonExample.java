package com.service;

import com.model.Person;
import com.model.UserInput;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/jackson")
public class JacksonExample {
    @POST
    public void createCustomer(@BeanParam UserInput user){

        System.out.println(user.toString());
    }


    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        Person person = new Person();
        person.setId(164);
        person.setName("Muhammed Eren");
        person.setSurname("Demir");
        return person;

    }
}