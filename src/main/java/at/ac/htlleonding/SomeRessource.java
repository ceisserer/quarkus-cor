package at.ac.htlleonding;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/restendpoint/")
public class SomeRessource {

  @Path("printit")
  @POST
  public void printMessageOnServer(@QueryParam("message") String message) {
    System.out.println(message);
  }
}
