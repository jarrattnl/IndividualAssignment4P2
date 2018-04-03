package com.example.nick.individualassignment4p2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView)findViewById(R.id.TVsynonym);
        tv.setText(username);
    }
    public void OnButtonClick(View v)
    {
        if(v.getId() == R.id.Breturn)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
