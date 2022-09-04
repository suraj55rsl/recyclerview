package com.example.recyclerviewsuraj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import com.example.recyclerviewsuraj.Adapters.RecipeAdapter;
import com.example.recyclerviewsuraj.Models.item_1;
import com.example.recyclerviewsuraj.Models.item_2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
//        ArrayList<item_1>  itemOneList=new ArrayList<>();
//        ArrayList<item_2>  itemTwoList=new ArrayList<>();
//
//        itemOneList.add(new item_1("SURAJ KUMAR",1200,1000));
//        itemOneList.add(new item_1("SEHER MISHRA",120,100));
//        itemOneList.add(new item_1("NEERAJ KUMAR",1289,102));
//        itemOneList.add(new item_1("GARIMA YADAV",1,120));
//        itemOneList.add(new item_1("HIMANSHU",11,108));
//        itemOneList.add(new item_1("SAURABGH",190,88));
//        itemOneList.add(new item_1("MANSI",2,0));
//        itemOneList.add(new item_1("MINAKSHI",19,89));
//        itemOneList.add(new item_1("YAHI SINGH",19,108));
//        itemOneList.add(new item_1("MANSKI",190,1022));
//        itemOneList.add(new item_1("AMIR",112,110));
//        itemOneList.add(new item_1("UMAR",132,103));




        recyclerView.setAdapter(new RecipeAdapter());
//        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(6,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);
//        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1);
//        recyclerView.setLayoutManager(gridLayoutManager);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}