package hw16;

import java.util.Random;

public class LoggerThread extends Thread {

    private Logger logger;

    @Override
    public void run() {
        String current = Thread.currentThread().getName();

        try {
            while (true) {
                Thread.sleep(new Random().nextInt(5000));
                this.logger.writeFile(current);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " + current + " заканчивает работу");
        }
    }

    public LoggerThread(Logger logger) {
        this.logger = logger;
    }
}
