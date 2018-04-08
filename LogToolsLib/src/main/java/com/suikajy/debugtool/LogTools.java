package com.suikajy.debugtool;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/**
 * @author zjy
 * @date 2018/1/31
 */

public class LogTools {

    private static final String TAG = "LogTools";

    public static void init(Context context) {
        Intent intent = new Intent("suikajy.log_tool");
        intent.setPackage("com.suikajy.debugtool");
        context.bindService(intent, sConn, Context.BIND_AUTO_CREATE);
    }

    private static ILogAppInterface sLogPostman;

    private static ServiceConnection sConn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            sLogPostman = ILogAppInterface.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e(TAG, "bind log tool fail, please try to restart the app.");
        }
    };

    public static void i(String log) {
        Log.e(TAG, log);
        if (sLogPostman == null) {
            Log.e(TAG, "The DebugTool is not installed.");
            return;
        }
        try {
            sLogPostman.onSendLog(log);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
