package com.example.kc.gumataydiannelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);
    }


    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnAct1){
            i = new Intent (this, MainActivity.class);
            startActivity(i);
        } else if (v.getId()== R.id.btnMap){
            i = new Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:16.934891,121.135239"));
            chooser = Intent.createChooser(i,"Select map app");
            startActivity(chooser);
        }
    }
}
