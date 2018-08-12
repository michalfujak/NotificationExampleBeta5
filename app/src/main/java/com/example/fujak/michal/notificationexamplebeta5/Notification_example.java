package com.example.fujak.michal.notificationexamplebeta5;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;


public class Notification_example extends Application {
    //
    public static final String channel_01 = "channel_01";
    //
    //
    @Override
    public void onCreate()
    {
        super.onCreate();
        // Adds

    }

    private void CreateNotificationChannels()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationChannel channel1 = new NotificationChannel(
                    channel_01,
                    "channel_01",
                    NotificationManager.IMPORTANCE_LOW
            );
            channel1.setDescription("This is channel 1");

            // NOTIFI MANAGER > SYSTEM_RECOVERY
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
        }
    }

}
