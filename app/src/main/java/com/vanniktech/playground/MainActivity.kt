package com.vanniktech.playground

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Glide.with(this).asBitmap().load("https://www.srf.ch/static/meteo/wetterkarte/media/web/CLOUDSONLY_20200224T1500Z.png").into(object : CustomTarget<Bitmap>() {
      override fun onResourceReady(
        resource: Bitmap,
        transition: Transition<in Bitmap>?
      ) {
        findViewById<ImageView>(R.id.imageView).setImageBitmap(resource)
      }

      override fun onLoadCleared(placeholder: Drawable?) {

      }
    })
  }
}
