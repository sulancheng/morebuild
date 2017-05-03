package com.example.su.mymorebuild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityFlavorOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_flavor_one);
    }
    public void myone(View view){
        startActivity(new Intent(ActivityFlavorOne.this,ActivityThreeMain.class));
    }
}
