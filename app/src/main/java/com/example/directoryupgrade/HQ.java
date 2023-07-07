package com.example.directoryupgrade;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class HQ extends AppCompatActivity {
    RecyclerView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hq);
        setTitle(department.DName);
        grid=findViewById(R.id.grid);
        String[] s={"MD","Director A&F","Director Technical I","Director Technical II","HR","Finance","Legal","IT","Monitoring & Coord","Hindi","Land Acquisition","Vigilance"};
        placard_adapter ad=new placard_adapter(HQ.this,s);
        grid.setAdapter(ad);
    }
}