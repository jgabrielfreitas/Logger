package com.jgabrielfreitas.logger;

import android.util.Log;

/**
 * Created by JGabrielFreitas on 10/01/17.
 */

public class Logger {

  private final String TAG = "Logger";

  public void error(String message) {
    error(TAG, message);
  }

  public void error(String tag, String message) {
    Log.e(tag, message);
  }
}
