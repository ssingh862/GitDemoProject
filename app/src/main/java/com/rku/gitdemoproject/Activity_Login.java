package com.rku.gitdemoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuSplash:
                Intent intentSplash = new Intent(Activity_Login.this,Activity_Splash.class);
                startActivity(intentSplash);
                Toast.makeText(this, "Splash Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuLogin:
                Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuAbout:
                Intent intentAbout = new Intent(Activity_Login.this,Activity_About.class);
                startActivity(intentAbout);
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuContact:
                Intent intentContact = new Intent(Activity_Login.this,Activity_Contact.class);
                startActivity(intentContact);
                Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}