package Singleton.Example;

public class KitchenTimer {
    private static volatile KitchenTimer kitchenTimer;
    private volatile int remainingSeconds;
    private volatile int prevRemainingSeconds;
    private volatile boolean isRunning;

    private Thread timerThread;

    private KitchenTimer() {
        remainingSeconds = 0;
        isRunning = false;
    }

    public static KitchenTimer getInstance() {
        if (kitchenTimer == null) {
            synchronized (KitchenTimer.class) {
                if (kitchenTimer == null) {
                    kitchenTimer = new KitchenTimer();
                }
            }
        }
        return kitchenTimer;
    }

    public void startKitchenTimer(int seconds) {
        if (isRunning) return;

        remainingSeconds = seconds;
        isRunning = true;

        timerThread = new Thread(() -> {
            while (remainingSeconds > 0 && isRunning) {
                System.out.println(remainingSeconds);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
                remainingSeconds--;
            }
            isRunning = false;
        });

        timerThread.start();
    }

    public void stopKitchenTimer() {
        if (!isRunning) return;

        isRunning = false;
        prevRemainingSeconds = --remainingSeconds;
        if (timerThread != null) {
            timerThread.interrupt();
        }
    }

    public void resumeKitchenTimer() {
        if (isRunning || prevRemainingSeconds <= 0) return;

        startKitchenTimer(prevRemainingSeconds);
    }

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
