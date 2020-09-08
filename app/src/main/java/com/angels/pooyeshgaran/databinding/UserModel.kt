package com.angels.pooyeshgaran.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.angels.pooyeshgaran.R
import com.squareup.picasso.Picasso

class UserModel {

    lateinit var userName: String
    lateinit var userImage: String
    lateinit var userImage2: String

    @BindingAdapter("userImage")
    fun setImageResource(view: ImageView, imageUrl: String?) {
        val context = view.context
        Picasso.with(context)
            .load(imageUrl)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .into(view)
    }
}