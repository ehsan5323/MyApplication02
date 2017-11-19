package com.example.ehsan.myapplication02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "masterBranch_OK", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "ehsanBranch3", Toast.LENGTH_SHORT).show();
        Button btnok= (Button) findViewById(R.id.btnok);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "masterok", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
