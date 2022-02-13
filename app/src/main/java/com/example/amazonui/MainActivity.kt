package com.example.amazonui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var rv_sneakers: RecyclerView
    private lateinit var rv_camera: RecyclerView
    private var essentials: ArrayList<Essential> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_essential)
        addEssentials()
        refreshAdapter()

        rv_sneakers = findViewById(R.id.rv_sneakers)
        refreshSneakerAdapter(getSneakers())

        rv_camera = findViewById(R.id.rv_camera)
        refreshCameraAdapter(getCameras())
    }

    private fun refreshAdapter() {
        val adapter = FavoriteAdapter(essentials)
        recyclerView.adapter = adapter
    }

    private fun addEssentials() {
        for (i in 0..2) {
            essentials.add(Essential("Oculus", R.drawable.img_1))
            essentials.add(Essential("Gamer", R.drawable.img_2))
            essentials.add(Essential("Mobile", R.drawable.img_3))
            essentials.add(Essential("Virtuality", R.drawable.img_4))
        }
    }

    private fun getSneakers(): java.util.ArrayList<Sneaker> {
        val sneakers = java.util.ArrayList<Sneaker>()
        for (i in 0..1) {
            sneakers.add(Sneaker("Nike", R.drawable.im_1))
            sneakers.add(Sneaker("Puma", R.drawable.im_2))
            sneakers.add(Sneaker("Adidas", R.drawable.im_3))
            sneakers.add(Sneaker("Waikiki", R.drawable.im_4))
        }
        return sneakers
    }

    private fun refreshSneakerAdapter(sneakers: java.util.ArrayList<Sneaker>) {
        val sneakerAdapter = SneakerAdapter(sneakers)
        rv_sneakers.adapter = sneakerAdapter
    }

    private fun getCameras(): ArrayList<Camera> {
        val cameras = java.util.ArrayList<Camera>()
        for (i in 0..1) {
            cameras.add(Camera("Nicon", R.drawable.cam_1))
            cameras.add(Camera("Panasonic", R.drawable.cam_2))
            cameras.add(Camera("Canon", R.drawable.cam_3))
            cameras.add(Camera("Tesla", R.drawable.cam_4))
        }
        return cameras
    }

    private fun refreshCameraAdapter(cameras: java.util.ArrayList<Camera>) {
        val cameraAdapter = CameraAdapter(cameras)
        rv_camera.adapter = cameraAdapter
    }
}