package com.jgabrielfreitas.logger;

import android.util.Log;

/**
 * Created by JGabrielFreitas on 10/01/17.
 */

public class Logger {

  private static final String TAG = "Logger";

  public static void error(String message) {
    error(TAG, message);
  }

  public static void error(String tag, String message) {
    Log.e(tag, message);
  }

}
