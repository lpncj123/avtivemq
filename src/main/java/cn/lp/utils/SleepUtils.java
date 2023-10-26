package cn.lp.utils;

public class SleepUtils {
    public static void sleep(int second) {
        try {
            Thread.sleep(100 * second);
        } catch (InterruptedException _ignored) {
            Thread.currentThread().interrupt();
        }
    }
}
