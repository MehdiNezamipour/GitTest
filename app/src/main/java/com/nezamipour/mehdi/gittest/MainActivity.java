package com.nezamipour.mehdi.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nezamipour.mehdi.gittest.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_go_to_login_page);

        button.setOnClickListener(v -> startActivity(LoginActivity.newIntent(MainActivity.this)));

        //add first commit

    }
}