package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by robert.szostakowski on 2015-01-23.
 */

@Path("/secure/admin/shouldBeProhibited")
public class ProhibitedController {

    @GET
    public Response printWelcome() {

        System.out.println("Using mapped method");
        String output = "There is no controller";

        return Response.status(200).entity(output).build();

    }
}
