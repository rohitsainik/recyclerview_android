package com.training.example1;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

     recyclerView = (RecyclerView) findViewById(R.id.rv_first);


        String[]  myDataset = {"android","flutter","c","c++","java","python","C#","php","javascript","node js",".net","pascal","ada","fortran"};

        mAdapter = new MyAdaptor(myDataset);
     recyclerView.setAdapter(mAdapter);


    }
}
