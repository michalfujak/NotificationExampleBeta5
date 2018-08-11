package com.example.fujak.michal.notificationexamplebeta5;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.muddzdev.styleabletoastlibrary.*;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    private Context cont;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_submit = (Button) findViewById(R.id.button_action_notifi);
        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast.makeText(view.getContext(), "Action click", R.style.ToastStyleView).show();
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
