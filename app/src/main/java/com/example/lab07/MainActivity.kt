package com.example.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.blender)
        val zoominBtn: Button = findViewById(R.id.zoomIn)
        val zoomOutBtn: Button = findViewById(R.id.zoomOut)
        val fadeBtn: Button = findViewById(R.id.fade)
        val rotateBtn: Button = findViewById(R.id.rotate)
        val lottie: Button = findViewById(R.id.lottie)

        zoominBtn.setOnClickListener {
            val zoomInAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            imageView.startAnimation(zoomInAnimation)
        }

        zoomOutBtn.setOnClickListener{
            val zoomOutAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            imageView.startAnimation(zoomOutAnimation)
        }

        fadeBtn.setOnClickListener{
            val fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.fade)
            imageView.startAnimation(fadeAnimation)
        }

        rotateBtn.setOnClickListener{
            val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            imageView.startAnimation(rotateAnimation)
        }

        lottie.setOnClickListener{
            val intent = Intent(this, LottieAnimation::class.java)
            startActivity(intent)
        }
    }
}
