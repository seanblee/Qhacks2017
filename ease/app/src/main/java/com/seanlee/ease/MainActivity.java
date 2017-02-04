package com.seanlee.ease;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_screen);
    }

    public void SignUp(View view){
        setContentView(R.layout.sign_up);
    }

    public void ControlPan(View view){
        setContentView(R.layout.activity_main);
    }
}
