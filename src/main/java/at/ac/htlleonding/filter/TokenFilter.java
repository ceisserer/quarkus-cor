package at.ac.htlleonding.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class TokenFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println(containerRequestContext.getHeaderString("TOKEN"));

        if(!containerRequestContext.getHeaderString("TOKEN").equals("123")) {
            containerRequestContext.abortWith(Response.status(401).build());
        }
    }
}
