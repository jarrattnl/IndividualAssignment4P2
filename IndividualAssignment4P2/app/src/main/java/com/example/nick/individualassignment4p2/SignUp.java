package com.example.nick.individualassignment4p2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends Activity {
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entervalues);
    }
    public void OnSignupClick(View v)
    {
        if(v.getId() == R.id.Bsignupbutton)
        {
            EditText name = (EditText)findViewById(R.id.TFuname);
            EditText email = (EditText)findViewById(R.id.TFuname);
            EditText username = (EditText)findViewById(R.id.TFuname);
            EditText password = (EditText)findViewById(R.id.TFpass1);
            EditText passconf = (EditText)findViewById(R.id.TFpass1);
            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String userstr = username.getText().toString();
            String passstr = password.getText().toString();
            String passconfstr = passconf.getText().toString();
            if(!passstr.equals(passconfstr))
            {
                Toast pass = Toast.makeText(SignUp.this, "Passwords don't match", Toast.LENGTH_SHORT);
                pass.show();
            }
            else
            {
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(userstr);
                c.setPass(passstr);

                helper.insertContact(c);
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
            }
        }
    }
}
