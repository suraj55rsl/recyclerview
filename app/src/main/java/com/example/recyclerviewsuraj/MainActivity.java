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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Adapter object declaration
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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