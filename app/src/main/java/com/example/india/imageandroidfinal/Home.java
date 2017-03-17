package com.example.india.imageandroidfinal;

/**
 * Created by INDIA on 3/16/2017.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.india.imageandroidfinal.R;

public class Home extends AppCompatActivity {
    static int count;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        img = (ImageView) findViewById(R.id.imageView);
        count=1;
    }

    public void onclknext(View v) {
        switch (count) {
            case 1:
                img.setImageResource(R.drawable.hp1);
                Toast.makeText(this,count+"/4", Toast.LENGTH_SHORT).show();
                count++;
                break;
            case 2:
                img.setImageResource(R.drawable.santwo2);
                Toast.makeText(this,count+"/4", Toast.LENGTH_SHORT).show();
                count++;
                break;
            case 3:
                img.setImageResource(R.drawable.hpblue3);
                Toast.makeText(this,count+"/4", Toast.LENGTH_SHORT).show();
                count++;
                break;
            case 4:
                img.setImageResource(R.drawable.sanone4);
                Toast.makeText(this,count+"/4", Toast.LENGTH_SHORT).show();
                count++;
                break;
            default:
                Toast.makeText(this, "End of images,click previous button", Toast.LENGTH_SHORT).show();
        }
    }

    public void onclkprev(View v) {
        switch (count-1) {
            case 4:
                img.setImageResource(R.drawable.hpblue3);
                Toast.makeText(this,count-2+"/4", Toast.LENGTH_SHORT).show();
                count--;
                break;
            case 3:
                img.setImageResource(R.drawable.santwo2);
                Toast.makeText(this,count-2+"/4", Toast.LENGTH_SHORT).show();
                count--;
                break;
            case 2:
                img.setImageResource(R.drawable.hp1);
                Toast.makeText(this,count-2+"/4", Toast.LENGTH_SHORT).show();
                count--;
                break;
            case 1:
                Toast.makeText(this, "This is the first image,cant go back", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"click next",Toast.LENGTH_SHORT).show();
        }
    }
}

