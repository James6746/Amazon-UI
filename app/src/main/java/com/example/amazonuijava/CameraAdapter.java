package com.example.amazonuijava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CameraAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Camera> items;

    public CameraAdapter(ArrayList<Camera> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_camera, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CameraAdapter.VH) {
            ((CameraAdapter.VH) holder).iv_image.setImageResource(items.get(position).getImage());
            ((CameraAdapter.VH) holder).tv_title.setText(items.get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class VH extends RecyclerView.ViewHolder {
        ImageView iv_image;
        TextView tv_title;

        public VH(@NonNull View itemView) {
            super(itemView);
            iv_image = itemView.findViewById(R.id.iv_camera);
            tv_title = itemView.findViewById(R.id.tv_name_camera);
        }
    }
}


