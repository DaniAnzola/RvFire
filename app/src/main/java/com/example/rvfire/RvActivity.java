package com.example.rvfire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class RvActivity extends AppCompatActivity {
    private ArrayList<Task> arrTareas = new ArrayList<>();
    private Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        btnAdd=(Button)findViewById(R.id.btnAdd);

        Task t =new Task("Pasear al Perro");
        Task t2=new Task("Lavar ropa");
        Task t3=new Task("Hacer Compra");

        arrTareas.add(t);
        arrTareas.add(t2);
        arrTareas.add(t3);
        RecyclerView rvTareas=(RecyclerView) findViewById(R.id.rvTareas);
       AdapterLista adapterLista=new AdapterLista(arrTareas);

       rvTareas.setHasFixedSize(true);
       rvTareas.setLayoutManager(new LinearLayoutManager(this));
       rvTareas.setAdapter(adapterLista);

       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });
    }
}