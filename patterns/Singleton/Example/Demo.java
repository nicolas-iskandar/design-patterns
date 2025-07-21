package Singleton.Example;

public class Demo {
    public static void show() {
        final int SECONDS = 5;
        KitchenTimer kitchenTimer =  KitchenTimer.getInstance();
        System.out.println("Starting Kitchen Timer for " + SECONDS + " seconds...");
        kitchenTimer.startKitchenTimer(SECONDS);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Stopping Kitchen Timer...");
        kitchenTimer.stopKitchenTimer();

        KitchenTimer kitchenTimer2 = KitchenTimer.getInstance();
        System.out.println("Kitchen Timer Running:  " + kitchenTimer2.isRunning());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Remaining Time: " + kitchenTimer2.getRemainingSeconds());

        System.out.println("Resuming Kitchen Timer...");
        kitchenTimer2.resumeKitchenTimer();
        System.out.println("Kitchen Timer Running:  " + kitchenTimer2.isRunning());
    }
}
