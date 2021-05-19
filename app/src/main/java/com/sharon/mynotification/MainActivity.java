package com.sharon.mynotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String judul = "Hi, Laura Sharon!";
        String pesan = "Congratulation, your assigment has been completed!";
        String appName = getApplicationInfo().name;

        Notif notif = new Notif();
        notif.sendNotif(judul, pesan, appName,this);
    }
}