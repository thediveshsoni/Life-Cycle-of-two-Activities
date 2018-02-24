package com.example.diveshsoni.lifecycletwoactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    String Tag,msg;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(Tag="Divesh" , msg="Its onCreate....!!!!");
        System.out.println("Its onCreate.....!!!");
    }
    protected void onStart()
    {
        super.onStart();
        Log.i(Tag="Divesh" , msg="Its onStart....!!!!");
        System.out.println("Its onStart.....!!!");
    }
    protected void onResume()
    {
        super.onResume();
        Log.i(Tag="Divesh" , msg="Its onResume2....!!!!");
        System.out.println("Its onResume2.....!!!");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.i(Tag="Divesh" , msg="Its onRestart2....!!!!");
        System.out.println("Its onRestart2.....!!!");
    }
    protected void onPause()
    {
        super.onPause();
        Log.i(Tag="Divesh" , msg="Its onPause2....!!!!");
        System.out.println("Its onPause2.....!!!");
    }
    protected void onStop()
    {
        super.onStop();
        Log.i(Tag="Divesh" , msg="Its onStop2....!!!!");
        System.out.println("Its onStop2.....!!!");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(Tag="Divesh" , msg="Its onDestroy2....!!!!");
        System.out.println("Its onDestroy2.....!!!");
    }
}
