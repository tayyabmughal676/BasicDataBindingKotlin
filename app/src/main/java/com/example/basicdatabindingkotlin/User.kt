package com.example.basicdatabindingkotlin

import android.content.Context
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


data class User(
    val name: String,
    val age: Int,
    val active: Boolean,
    val imageUrl: String
) {
    fun handleClick() {
        val TAG = "Handle"
        Log.d(TAG, "handleClick: $name")
    }
}

// Solution 1
@BindingAdapter("android:loadImage")
fun loadImage(userImageView: ImageView, imageUrl: String): Unit {
    Glide
        .with(userImageView)
        .load(imageUrl)
        .into(userImageView)
}
