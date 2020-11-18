package at.ac.htlleonding.chainofresp;

public class LogHandler extends ConcreteRequestHandler {

    public LogHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void handleRequest() {
        System.out.println("request logged");
        super.handleRequest();
    }
}
