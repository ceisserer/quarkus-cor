package at.ac.htlleonding.chainofresp;

public class TokenHandler extends ConcreteRequestHandler {
    public TokenHandler(RequestHandler next) {
        super(next);
    }

    public void handleRequest() {
        System.out.println("token validated");
        super.handleRequest();
    }

}
