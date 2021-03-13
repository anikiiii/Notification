package com.kelompok.mmo_notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DoIt(View view) {
        NotificationManagerCompat myManage = NotificationManagerCompat.from(this);
        NotificationCompat.Builder myNotif = new NotificationCompat.Builder(this);
        myNotif.setContentTitle("1 Pesan Baru");
        myNotif.setContentText("Halo sayang . . . .");
        myNotif.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent i1 = new Intent(this,MainActivity.class);
        PendingIntent pd = PendingIntent.getActivity(this,1,i1,0);
        myNotif.setContentIntent(pd);
        myNotif.setAutoCancel(true);

        myManage.notify(1,myNotif.build());
        finish();
    }
}