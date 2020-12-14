package com.nezamipour.mehdi.gittest;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.nezamipour.mehdi.gittest.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_go_to_login_page);
        Button buttonClose = findViewById(R.id.close);
        button.setOnClickListener(v -> startActivity(LoginActivity.newIntent(MainActivity.this)));
        buttonClose.setOnClickListener(v -> MainActivity.this.finish());
        //add first commit

        //add second commit to branch master

    }
}