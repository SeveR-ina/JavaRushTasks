package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread childThread;

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (!current.isInterrupted()) {
            System.out.println(current.getName());
            try {
                Thread.sleep(100);                
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    @Override
    public void start(String threadName) {
        childThread = new Thread(this, threadName);
        childThread.start();
    }

    @Override
    public void stop() {
        childThread.interrupt();
    }
}
