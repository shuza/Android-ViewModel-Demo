package me.shuza.viewmodeldemo;

import android.util.Log;

/**
 * :=  created by:  Shuza
 * :=  create date:  12/6/2017
 * :=  (C) CopyRight Shuza
 * :=  www.shuza.me
 * :=  shuza.sa@gmail.com
 * :=  Fun  :  Coffee  :  Code
 **/
public class LogUtil {

    public static void printLogMessage(String tag, String key, String message) {
        Log.d(tag, key + "      ==/      " + message);
    }

    public static void printErrorLog(String tag, String key, String message) {
        Log.e(tag, key + "      ==/      " + message);
    }
}
