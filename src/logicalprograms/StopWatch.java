package logicalprograms;

import java.util.Scanner;

public class StopWatch {

    long startTimer = 0;
    long stopTimer = 0;
    long elapsedTime;

    void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop time is: " + stopTimer);
    }

    long getElapsedTime() {
        elapsedTime = stopTimer - startTimer;
        return elapsedTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        Scanner scin = new Scanner(System.in);
        System.out.println("Press 1 to start the Stop Watch: ");
        scin.nextInt();
        sw.start();
        System.out.println();
        System.out.println("Press 2 to stop the Stop Watch: ");
        scin.nextInt();
        sw.stop();
        long showTime = sw.getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed (in milliseconds) is: " + showTime);
        System.out.println();
        System.out.println("Milliseconds converted to Seconds: " + (showTime / 1000) + " seconds");
    }
}
