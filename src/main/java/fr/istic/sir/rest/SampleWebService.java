package fr.istic.sir.rest;

import entity.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class SampleWebService
{
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello()
    {
        return "Hello, how are you?";
    }

    @GET
    @Path("/home")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser() {
        User u = new User();
        u.setName("toto");
        u.setFirstName("dupont");
        u.setMail("ok ok");
        return u;
    }
}