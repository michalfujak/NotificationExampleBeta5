package com.example.fujak.michal.notificationexamplebeta5;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.muddzdev.styleabletoastlibrary.*;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

import static com.example.fujak.michal.notificationexamplebeta5.Notification_example.CHANNEL_ID_001;

public class MainActivity extends AppCompatActivity {

    private Context cont;
    private NotificationManagerCompat notificationManagerCompac;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Notification initializable
        notificationManagerCompac = NotificationManagerCompat.from(this);


        Button button_submit = (Button) findViewById(R.id.button_action_notifi);
        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast.makeText(view.getContext(), "Action click", R.style.ToastStyleView).show();
                Notification notification = new  NotificationCompat.Builder(view.getContext(), CHANNEL_ID_001)
                        .setSmallIcon(R.drawable.ic_drive) // icon Notification, notification for application.
                        .setContentTitle("Title Notification Drive")
                        .setContentText("Message Notification Drive id Car")
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .build();
                notificationManagerCompac.notify(1, notification);

            }
        });
        button_submit.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                StyleableToast.makeText(view.getContext(), "Action Long Click", R.style.ToastStyleViewLong).show();
                return true;
            }
        });
    }


}
