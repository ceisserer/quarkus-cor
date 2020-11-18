package at.ac.htlleonding.chainofresp;

public abstract class ConcreteRequestHandler implements RequestHandler {
    RequestHandler nextHandler;

    public ConcreteRequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest() {
        if(nextHandler != null) {
            nextHandler.handleRequest();
        }
    }
}
