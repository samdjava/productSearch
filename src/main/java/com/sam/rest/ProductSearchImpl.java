package com.sam.rest;

/**
 * Created by root on 3/8/17.
 */

import com.sam.model.Person;
import com.sam.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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

    @GET
    @Path("/addUser")
    public String addUser() {
        return "Done!!!";
    }

    @GET
    @Path("/getUserByEmail")
    @Produces("application/json")
    public List<Person> getUser(@QueryParam("email") String emailId) {
        return personServices.getPersonDao().getPersonByEmail(emailId);
    }
}
