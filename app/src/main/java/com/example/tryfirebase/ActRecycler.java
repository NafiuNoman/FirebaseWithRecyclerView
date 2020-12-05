package com.example.tryfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class ActRecycler extends AppCompatActivity {

    RecyclerView recyclerView;
    myAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_recycler);

        recyclerView = findViewById(R.id.IdRecycler);




        FirebaseRecyclerOptions<DataHolder> options =
                new FirebaseRecyclerOptions.Builder<DataHolder>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("student"),DataHolder.class)
                        .build();




        Adapter = new myAdapter(options);
        recyclerView.setAdapter(Adapter);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Adapter.startListening();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Adapter.stopListening();

    }
}