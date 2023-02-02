package com.example.coroutine

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import kotlinx.coroutines.*
import java.net.URL

class MainActivity : AppCompatActivity() {
    lateinit var btnLoad: Button
    lateinit var imgView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLoad = findViewById(R.id.btn_load)
        imgView = findViewById(R.id.img_view)

        btnLoad.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {
                Log.d("MyTag","on create :ThreadMain:${Thread.currentThread().name}")
                val url = URL("https://www.pinterest.com/pin/733031276833258839/")
                val bitmap=BitmapFactory.decodeStream(url.openStream())

                withContext(Dispatchers.Main){
                    Log.d("MyTag","on create withContext:ThreadMain:${Thread.currentThread().name}")
                    imgView.setImageBitmap(bitmap)
                }


            }

        }
    }
}