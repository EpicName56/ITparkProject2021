package hw16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoggerRun {
    public static void main(String[] args) throws InterruptedException, IOException {
        FileWriter logFile = new FileWriter("errors.log");
        Logger logger = new Logger(new String[]{"ERROR", "WARN", "INFO", "DEBUG", "TRACE"},
                logFile, " сообщение ");

        Thread loggerThread1 = new LoggerThread(logger);
        Thread loggerThread2 = new LoggerThread(logger);
        Thread loggerThread3 = new LoggerThread(logger);
        loggerThread1.start();
        loggerThread2.start();
        loggerThread3.start();
        System.out.println("Обработка и запись... ");
        Thread.sleep(60000);
        loggerThread1.interrupt();
        loggerThread2.interrupt();
        loggerThread3.interrupt();
        logFile.close();

        System.out.println("Результат: ");
        FileReader logFileRead = new FileReader("errors.log");
        Scanner scan = new Scanner(logFileRead);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
