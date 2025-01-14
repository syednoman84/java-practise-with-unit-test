package com.codewithvarun;

public class Timer {

    public static Long timeIt(Runnable job) {
        long startMillis = System.currentTimeMillis();
        job.run();
        return System.currentTimeMillis() - startMillis;
    }
}
