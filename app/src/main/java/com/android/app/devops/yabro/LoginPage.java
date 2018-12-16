package com.android.app.devops.yabro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
    public void loginClick(View v)
    {
        Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoginPage.this,HomePage.class));
    }
}
