package com.sam.rest;

/**
 * Created by root on 3/8/17.
 */

import com.sam.model.Person;
import com.sam.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import java.util.List;

@Controller
@Path("/productSearch")
public class ProductSearchImpl {

    //Clean up
    @Autowired
    PersonService personServices;


    @GET
    @Path("/ping")
    public String ping() {
        return "Ping";
    }

    @POST
    @Path("/addUser")
    public String addUser(Person person) {
        personServices.getPersonDao().add(person);
        return "Done!!!";
    }

    @GET
    @Path("/getUserByEmail")
    @Produces("application/json")
    public List<Person> getUser(@QueryParam("email") String emailId) {
        return personServices.getPersonDao().getPersonByEmail(emailId);
    }
}
