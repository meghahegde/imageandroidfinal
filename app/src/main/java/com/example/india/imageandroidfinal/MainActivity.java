package com.example.india.imageandroidfina;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.india.imageandroidfinal.R;

public class MainActivity extends AppCompatActivity {

    EditText User;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User=(EditText)findViewById(R.id.textView);
        pass=(EditText)findViewById(R.id.textView2);
    }

    public void onclk(View v){
        String usr,pswd;
        usr=User.getText().toString();
        pswd=pass.getText().toString();
        if(usr.equals(pswd)){
            Toast.makeText(this,"SUCCESSFUL LOGIN",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this,Home.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this,"Enter valid User Id & password",Toast.LENGTH_SHORT).show();
            pass.setText("");
            User.setText("");
        }
    }

}
