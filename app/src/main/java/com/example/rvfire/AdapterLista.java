package com.example.rvfire;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterLista extends RecyclerView.Adapter<AdapterLista.ViewHolder> {
    private ArrayList<Task> listdata;

    public AdapterLista(ArrayList<Task> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public AdapterLista.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View listItem=layoutInflater.inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder=new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLista.ViewHolder holder, int position) {

        holder.tvTask.setText(listdata.get(position).getNombreTarea());

    }



    @Override
    public int getItemCount() {
        return listdata.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTask;
        CheckBox checkBox;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tvTask=(TextView) itemView.findViewById(R.id.tvtask);
            this.checkBox=(CheckBox) itemView.findViewById(R.id.checkBox);

        }
    }
}
