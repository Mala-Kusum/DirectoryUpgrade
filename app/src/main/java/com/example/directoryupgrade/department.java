package com.example.directoryupgrade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.ArrayAdapter;
import android.widget.GridView;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

public class department extends AppCompatActivity {
    RecyclerView grid;
    public static String DName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        setTitle(MainActivity.parent);
        grid=findViewById(R.id.grid);
        String[] s={"Corporate Office","RO-Port Blair","RO-Itanagar","RO-Guwahati","RO-Jammu","RO-Srinagar","RO-Ladakh","RO-Imphal","RO-Shillong","RO-Aizwal","RO-Kohima","RO-Gangtok","RO-Agartala","RO-Dehradun"};
        placard_adapter ad=new placard_adapter(department.this,s);
        grid.setAdapter(ad);
       // grid.setOnClickListener(new );
    }
}