package rest;

import pojo.Author;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by robert.szostakowski on 2015-01-29.
 */

@Path("/author/{id}")
public class AuthorRest {
    public static final Map<Integer,String> nameSet = new LinkedHashMap<Integer,String>(){
    {
        put(1,"Michal");
        put(2,"Darek");
        put(3,"Robert");
    }
    };
    public static final Map<Integer,String> surnameSet = new LinkedHashMap<Integer,String>(){
        {
            put(1,"Szostakowski");
            put(2,"Bialecki");
            put(3,"Tarczynski");
        }
    };

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAuthorById(@PathParam("id") String id){
        int randomNameId = ((int)(Math.random()*3))+1;
        int randomSurnameId = ((int)(Math.random()*3))+1;

        Author author = new Author((Integer.parseInt(id)), nameSet.get(randomNameId), surnameSet.get(randomSurnameId), "http://ciber.com");

        return Response.status(200).entity(author).build();

    }
}
