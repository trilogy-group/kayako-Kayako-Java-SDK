package com.kayako.sdk.utils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class LogUtils {

    private static boolean showLogs = false; // Ensure this is false on production builds

    public static void logError(Class clazz, String logMessage) {
        if (showLogs()) {
            System.out.println(clazz.getName() + "> " + logMessage);
        }
    }

    public static boolean showLogs() {
        return showLogs;
    }

    public static void setShowLogs(boolean showLogs) {
        LogUtils.showLogs = showLogs;
    }
}
