package com.seanlee.ease;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseAuth user = FirebaseAuth.getInstance();

        if (user.getCurrentUser() == null) {
            startActivity(new Intent(MainActivity.this, LoadActivity.class));
            finish();
        }
        else {
            setContentView(R.layout.activity_main);
        }
    }
}
