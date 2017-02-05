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
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }
        else {
            setContentView(R.layout.activity_main);
        }
    }

    public void addPost(View view){
        Intent i = new Intent(getApplicationContext(),CreatePostActivity.class);
        startActivity(i);
    }

    public void userProfile(View v){
        Intent i = new Intent(getApplicationContext(),UserProfile.class);
        startActivity(i);
    }

}
