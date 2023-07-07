package com.example.directoryupgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button designation,department,allSearch;
    public static String parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allSearch=findViewById(R.id.allsearch);
        designation=findViewById(R.id.bydesignation);
        department=findViewById(R.id.bydepartment);
        department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,department.class);
                parent = "By Department";
                startActivity(i);
            }
        });
    }
}