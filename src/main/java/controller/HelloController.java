package controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/welcome")
public class HelloController {

    // it is not working as a controller like SpringMVC
    // but it is possible to return a jsp page http://blog.docuverse.com/2009/08/04/using-jsp-with-jersey-jax-rs-implementation/
    @GET
    public Response printWelcome() {
        System.out.println("Using mapped method");
        String output = "Jersey say : " + " hello";

        return Response.status(200).entity(output).build();
    }

}
