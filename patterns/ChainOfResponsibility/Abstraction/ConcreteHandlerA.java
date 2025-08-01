package ChainOfResponsibility.Abstraction;

public class ConcreteHandlerA extends BaseHandler {
    private final boolean canHandleRequest;

    public ConcreteHandlerA(boolean canHandleRequest) {
        this.canHandleRequest = canHandleRequest;
    }

    @Override
    public void handle(Object request) {
        if (canHandleRequest) {
            System.out.println("ConcreteHandlerA handled request: " + request);
        } else {
            super.handle(request);
        }
    }
}
