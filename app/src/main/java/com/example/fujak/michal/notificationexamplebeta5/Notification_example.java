package com.example.fujak.michal.notificationexamplebeta5;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;


public class Notification_example extends Application {
    //
    public static final String CHANNEL_ID_001 = "channel_01";
    //
    //
    @Override
    public void onCreate()
    {
        // onCreate superMethod
        super.onCreate();
    }

    private void CreateNotificationChannels()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_ID_001,
                    "channel_01",                    // or R.string.CHANNEL_ID_001 == values attribute
                    NotificationManager.IMPORTANCE_HIGH    // Notification build pririty
            );
            channel1.setDescription("This is channel 1");

            // callback
            // NOTIFI MANAGER > SYSTEM_RECOVERY
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
        }
    }

}
