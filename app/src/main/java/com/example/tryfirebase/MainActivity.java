package com.example.tryfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    DataHolder dataHolder;
//    ValueHolder valueHolder;

    EditText name,id,major;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.IdName);
        id = findViewById(R.id.Idid);
        major =findViewById(R.id.IdMajor);


}


    public void send(View view) {


        String sName,sId,sMajor;

        sName = name.getText().toString().trim();
        sId = id.getText().toString().trim();
        sMajor = major.getText().toString().trim();

        dataHolder = new DataHolder(sName,sId,sMajor);
//        valueHolder = new ValueHolder();


        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference reference = database.getReference("student");

        reference.child(sId).setValue(dataHolder);









//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//
//        DatabaseReference reference = database.getReference("student");
//
//        reference.child(sId).child(sName).setValue(dataHolder);
//        reference.child(sId).child(sMajor).setValue(valueHolder);
//        reference.child(sId).child(sName).child("Hooby").setValue(valueHolder);




        name.setText("");
        id.setText("");
        major.setText("");

        Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show();

    }

    public void goToRecycler(View view) {

        Intent intent = new Intent(MainActivity.this,ActRecycler.class);
        this.startActivity(intent);

    }
}