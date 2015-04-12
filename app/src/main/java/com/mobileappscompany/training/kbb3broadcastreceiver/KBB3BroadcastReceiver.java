package com.mobileappscompany.training.kbb3broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class KBB3BroadcastReceiver extends BroadcastReceiver {

    public static final String KBB3_ACTION  = "com.mobileappscompany.training.send_broadcast";
    public static final String CONNECTED    = "android.intent.action.ACTION_POWER_CONNECTED";
    public static final String DISCONNECTED = "android.intent.action.ACTION_POWER_DISCONNECTED";

    public KBB3BroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String message = "";

        if(intent.getAction() == KBB3_ACTION) {
            message = "Received KBB3 Action";
        }

        if(intent.getAction() == CONNECTED) {
            message = "Power Connected!";
        }

        if(intent.getAction() == DISCONNECTED) {
            message = "Power Disconnected!";
        }

        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
