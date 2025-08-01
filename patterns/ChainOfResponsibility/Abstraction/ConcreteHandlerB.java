package ChainOfResponsibility.Abstraction;

public class ConcreteHandlerB extends BaseHandler {
    private final boolean canHandleRequest;

    public ConcreteHandlerB(boolean canHandleRequest) {
        this.canHandleRequest = canHandleRequest;
    }

    @Override
    public void handle(Object request) {
        if (canHandleRequest) {
            System.out.println("ConcreteHandlerB handled request: " + request);
        } else {
            super.handle(request);
        }
    }
}
