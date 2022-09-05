package com.example.recyclerviewsuraj.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewsuraj.Models.item_1;
import com.example.recyclerviewsuraj.Models.item_2;
import com.example.recyclerviewsuraj.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import kotlin.jvm.internal.CollectionToArray;

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Collection list;
    public RecyclerAdapter(Collection list) {
        this.list = list;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final RecyclerView.ViewHolder holder;
        View view;
        switch (viewType){
            case R.layout.sample_item2:
                view=LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_item2,parent,false);
                holder=new viewHolderTwo(view);
                break;
            case R.layout.sample_item1:
            default:
                view=LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_item1,parent,false);
                holder=new viewHolderOne(view);
                break;

        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof viewHolderOne){
             ((viewHolderOne) holder).bind(list);
             ((viewHolderOne) holder).item1_nameTextView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(view.getContext(), "Type#a Followers:"+((viewHolderOne) holder).item1_followersTextView.getText().toString()+"Contributors:"+((viewHolderOne) holder).item1_followersTextView.getText().toString(),Toast.LENGTH_SHORT).show();
                 }
             });

        }
        else
        {
            ((viewHolderTwo) holder).bind(list);
            ((viewHolderTwo) holder).item2_nameTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Type#b Followers:"+((viewHolderTwo) holder).item2_followersTextView.getText().toString()+"Contributors:"+((viewHolderTwo) holder).item2_followersTextView.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            });

        }

    }


    // <--fetching view type using position of the view into recycler-->
    @Override
    public int getItemViewType(int position) {
        if(position%3==0) return R.layout.sample_item1;
        return R.layout.sample_item2;
    }
    // <--number of item we want to show in recyclerview-->
    @Override
    public int getItemCount() {
        return 20;
    }
  // <--view holder for item 1-->
   public class  viewHolderOne extends RecyclerView.ViewHolder{
        TextView item1_nameTextView,item1_followersTextView, item1_contributorsTextView;
       public viewHolderOne(@NonNull View itemView) {
           super(itemView);
           item1_nameTextView=itemView.findViewById(R.id.item1_name);
           item1_followersTextView=itemView.findViewById(R.id.item1_followers_value);
           item1_contributorsTextView=itemView.findViewById(R.id.item1_contributions_value);
       }
       public void bind(@NonNull item_1 model) {
           item1_nameTextView.setText(model.getName());
           item1_followersTextView.setText(model.getFollowers());
           item1_contributorsTextView.setText(model.getContributors());
       }
   }
    // <--view holder for item 2-->
   public class viewHolderTwo extends RecyclerView.ViewHolder{
       TextView item2_nameTextView,item2_followersTextView, item2_contributorsTextView,item2_locationTextView;
       public viewHolderTwo(@NonNull View itemView) {
           super(itemView);
           item2_nameTextView=itemView.findViewById(R.id.item2_name_value);
           item2_followersTextView=itemView.findViewById(R.id.item2_followers_value);
           item2_contributorsTextView=itemView.findViewById(R.id.item2_contributors_value);
           item2_locationTextView=itemView.findViewById(R.id.item2_location_value);
       }
       public void bind(@NonNull item_2 model) {
           item2_nameTextView.setText(model.getName());
           item2_followersTextView.setText(model.getFollowers());
           item2_contributorsTextView.setText(model.getContributors());
           item2_locationTextView.setText(model.getLocation());
       }
   }
}
