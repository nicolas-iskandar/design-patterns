package Proxy.Abstraction;

public class Proxy implements ServiceInterface {
    private final ServiceInterface realService;

    public Proxy(ServiceInterface service) {
        this.realService = service;
    }

    public boolean checkAccess() {
        return true;
    }

    @Override
    public void operation() {
        if (checkAccess()) {
            realService.operation();
        } else {
            System.out.println("Access denied");
        }
    }
}
