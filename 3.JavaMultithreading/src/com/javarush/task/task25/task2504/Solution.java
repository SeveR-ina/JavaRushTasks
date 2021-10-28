package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

public class Solution {

    public static void processThreads(Thread... threads) {
        for (int i = 0; i < threads.length; i++) {
            Thread thread = threads[i];
            String state = thread.getState().name();
            switch (state) {
                case "NEW":
                    thread.start();
                    break;
                case "WAITING":
                case "TIMED_WAITING":
                case "BLOCKED":
                    thread.interrupt();
                    break;
                case "RUNNABLE":
                    thread.isInterrupted();
                    break;
                case "TERMINATED":
                    System.out.println(thread.getPriority());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Thread threads[] = new Thread[5];
        for (int j = 0; j < threads.length; j++) {
            threads[j] = new Thread();
            threads[j].start();
        }
        processThreads(threads);
    }
}
