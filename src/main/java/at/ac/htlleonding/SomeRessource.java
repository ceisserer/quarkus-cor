package at.ac.htlleonding;

import at.ac.htlleonding.chainofresp.LogHandler;
import at.ac.htlleonding.chainofresp.RequestHandler;
import at.ac.htlleonding.chainofresp.TokenHandler;

import javax.ws.rs.*;

@Path("/restendpoint/")
public class SomeRessource {
  RequestHandler handler;

  public SomeRessource() {
    // Aufbau der Chain normalerweise über dependency injection / factory
    LogHandler logHandler = new LogHandler(null);
    TokenHandler tokenHandler = new TokenHandler(logHandler);
    handler = tokenHandler;
  }


  @Path("printit")
  @POST
  public void printMessageOnServer(@QueryParam("message") String message) {
    //handler.handleRequest();
    System.out.println(message);
  }
}
