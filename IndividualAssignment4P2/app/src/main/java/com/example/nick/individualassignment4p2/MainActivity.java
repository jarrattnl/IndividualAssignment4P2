package com.example.nick.individualassignment4p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    public void OnButtonClick(View v)
    {
        if(v.getId() == R.id.Blogin)
        {
            EditText a = (EditText)findViewById(R.id.TFusername);
            String str = a.getText().toString();
            //EditText b = (EditText)findViewById(R.id.TFpassword);
            //String pass = b.getText().toString();

            String password = helper.searchPass(str);
           // if(pass.equals(password))
           // {
                Intent i = new Intent(this, Display.class);
                i.putExtra("Username",password);
                startActivity(i);
            //}
            //else
           // {
            //    Toast fail = Toast.makeText(MainActivity.this, "Passwords or Username is Incorrect", Toast.LENGTH_SHORT);
           //     fail.show();
           // }
        }
        if(v.getId() == R.id.Bsignup)
        {
            Intent i = new Intent(this, SignUp.class);
            startActivity(i);
        }
    }
}
