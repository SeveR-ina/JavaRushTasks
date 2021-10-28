package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        String last_state = null;
        while (true) {
            String state = thread.getState().name();
            if (!state.equals(last_state)) {
                System.out.println(state);
                last_state = state;
            }
            if (state.equals("TERMINATED")) break;
        }
    }
}
