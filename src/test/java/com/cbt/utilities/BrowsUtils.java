package com.cbt.utilities;

public class BrowsUtils {
    public static void wait(int seconds){
        try {
            Thread.sleep(1000*seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
