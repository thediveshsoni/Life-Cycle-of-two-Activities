package com.example.diveshsoni.lifecycletwoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String Tag,msg;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Log.i(Tag="Divesh" , msg="Its onResume....!!!!");
        System.out.println("Its onResume.....!!!");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.i(Tag="Divesh" , msg="Its onRestart....!!!!");
        System.out.println("Its onRestart.....!!!");
    }
    protected void onPause()
    {
        super.onPause();
        Log.i(Tag="Divesh" , msg="Its onPause....!!!!");
        System.out.println("Its onPause.....!!!");
    }
    protected void onStop()
    {
        super.onStop();
        Log.i(Tag="Divesh" , msg="Its onStop....!!!!");
        System.out.println("Its onStop.....!!!");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(Tag="Divesh" , msg="Its onDestroy....!!!!");
        System.out.println("Its onDestroy.....!!!");
    }

    public void clickButton(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}

