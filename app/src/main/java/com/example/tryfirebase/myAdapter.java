package com.example.tryfirebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myAdapter extends FirebaseRecyclerAdapter<DataHolder,myAdapter.myViewHolder> {

    public myAdapter(@NonNull FirebaseRecyclerOptions<DataHolder> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull DataHolder model) {

        holder.major.setText(model.getMAJOR());
        holder.id.setText(model.getId());
        holder.name.setText(model.getName());


    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.myrow,parent,false);

        myViewHolder myViewHolder = new myViewHolder(view);

        return myViewHolder;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView name,id,major;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);


            name = itemView.findViewById(R.id.IdrowName);
            id = itemView.findViewById(R.id.IdrowId);
            major = itemView.findViewById(R.id.IdrowMajor);



        }
    }
}
