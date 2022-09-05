package com.example.recyclerviewsuraj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recyclerviewsuraj.Adapters.RecyclerAdapter;
import com.example.recyclerviewsuraj.Classes.RecyclerItemClickListener;
import com.example.recyclerviewsuraj.Models.item_1;
import com.example.recyclerviewsuraj.Models.item_2;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {
    //Adapter object declaration
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Collection values=new ArrayList<>();
        values.add(new item_1("SURAJ KUMAR",1200,23000));
        values.add(new item_1("NEERAJ KUMAR",12,230));
        values.add(new item_1("AMISHA",12,2390));
        values.add(new item_1("SAURABH",129,24));
        values.add(new item_2("GARIMA","INDIA",1290,244));
        values.add(new item_2("MOHIT","USA",1298,224));
        values.add(new item_2("SURAJ","LONDON",12398,23324));
        //AdapterObject accesssing recyclerview
        recyclerView=findViewById(R.id.recyclerview);
        //setting adapterview with recyclerview
        recyclerView.setAdapter(new RecyclerAdapter(new ArrayList<>()));
        /*
        <--other different layout manager for item view-->
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
         recyclerView.setLayoutManager(gridLayoutManager);
         */
       // <--linear layout manager-->

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // recycler item lishner implementaion
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
                (this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switch(position){
                            case 0:
                                Intent intent =new Intent(MainActivity.this,ScrollingActivity.class);
                                startActivity(intent);
                                break;
                            case 1:
                                Toast.makeText(MainActivity.this,"This is position 1 item",Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                Toast.makeText(MainActivity.this,"This is default item",Toast.LENGTH_SHORT).show();
                                break;

                        }
                    }
                    // <--for long press item click lishner-->
                    @Override
                    public void onLongItemClick(View view, int position) {

                        switch(position){
                            case 0:
                                Toast.makeText(MainActivity.this,"HI",Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                }

                ));
    }
}