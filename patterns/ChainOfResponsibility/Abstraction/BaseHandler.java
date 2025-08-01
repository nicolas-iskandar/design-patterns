package ChainOfResponsibility.Abstraction;

public abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Object request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
