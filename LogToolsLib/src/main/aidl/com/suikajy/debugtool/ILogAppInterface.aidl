// ILogAppInterface.aidl
package com.suikajy.debugtool;

import com.suikajy.debugtool.ILogCallback;
// Declare any non-default types here with import statements

interface ILogAppInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void onSendLog(String log);

    void setLogCallback(ILogCallback callback);
}
