package com.example.user.lab22profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Profile extends AppCompatActivity {
    private EditText editTextName,editTextEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        editTextEmail=(EditText)findViewById(R.id.editTextEmail);
        editTextName=(EditText)findViewById(R.id.editTextName);
    }

    public void saveProfile (View view){
        //TODO: capture data from screen

        String name,email;

        name=editTextName.getText().toString();
        email=editTextEmail.getText().toString();

        //TODO:pass  data to the Main Activity
    Intent intent = getIntent();
        intent.putExtra(MainActivity.PROFILE_NAME, name);
        intent.putExtra(MainActivity.PROFILE_EMAIL, email);
        setResult(RESULT_OK, intent);


        //TODO:terminate this activity
        finish();

    }

}
