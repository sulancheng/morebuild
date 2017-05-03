package com.example.su.mymorebuild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activityflavortwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityflavortwo);
    }
    public void mytwo(View view){
        startActivity(new Intent(Activityflavortwo.this,ActivityThreeMain.class));
    }
}
