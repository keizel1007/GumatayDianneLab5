package com.example.kc.gumataydiannelab5;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ith","OnCreate() is running!");
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ith", "onStart() has executed");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ith", "onResume()has executed");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ith", "onStop() has executed...");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ith", "onPause() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ith", "onRestart() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ith", "onDestroy() has executed");
    }


    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnAct2){
            i = new Intent (this, Main2Activity.class);
            startActivity(i);
        } else if (v.getId()== R.id.btnMap){
            i = new Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 16.4006, 120.6176"));
            chooser = Intent.createChooser(i,"Select map app");
            startActivity(chooser);
        }
    }
}


