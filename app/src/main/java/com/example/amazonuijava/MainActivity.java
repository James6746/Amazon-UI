package com.example.amazonuijava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView, rv_sneakers, rv_camera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.rv_essential);
        refreshAdapter(getEssentials());

        rv_sneakers = findViewById(R.id.rv_sneakers);
        refreshSneakerAdapter(getSneakers());

        rv_camera = findViewById(R.id.rv_camera);
        refreshCameraAdapter(getCameras());

    }

    private ArrayList<Essential> getEssentials() {
        ArrayList<Essential> essentials = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            essentials.add(new Essential("Oculus", R.drawable.img_1));
            essentials.add(new Essential("Gamer", R.drawable.img_2));
            essentials.add(new Essential("Mobile", R.drawable.img_3));
            essentials.add(new Essential("Virtuality", R.drawable.img_4));
        }
        return essentials;
    }

    private void refreshAdapter(ArrayList<Essential> essentials) {
        FavouriteAdapter favouriteAdapter = new FavouriteAdapter(essentials);
        recyclerView.setAdapter(favouriteAdapter);
    }

    private ArrayList<Sneaker> getSneakers() {
        ArrayList<Sneaker> sneakers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            sneakers.add(new Sneaker("Nike", R.drawable.im_1));
            sneakers.add(new Sneaker("Puma", R.drawable.im_2));
            sneakers.add(new Sneaker("Adidas", R.drawable.im_3));
            sneakers.add(new Sneaker("Waikiki", R.drawable.im_4));
        }
        return sneakers;

    }

    private void refreshSneakerAdapter(ArrayList<Sneaker> sneakers) {
        SneakerAdapter sneakerAdapter = new SneakerAdapter(sneakers);
        rv_sneakers.setAdapter(sneakerAdapter);
    }

    private ArrayList<Camera> getCameras() {
        ArrayList<Camera> cameras = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            cameras.add(new Camera("Nicon", R.drawable.cam_1));
            cameras.add(new Camera("Panasonic", R.drawable.cam_2));
            cameras.add(new Camera("Canon", R.drawable.cam_3));
            cameras.add(new Camera("Tesla", R.drawable.cam_4));
        }
        return cameras;

    }

    private void refreshCameraAdapter(ArrayList<Camera> cameras) {
        CameraAdapter cameraAdapter = new CameraAdapter(cameras);
        rv_camera.setAdapter(cameraAdapter);
    }
}