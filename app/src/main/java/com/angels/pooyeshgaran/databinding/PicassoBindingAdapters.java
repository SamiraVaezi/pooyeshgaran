package com.angels.pooyeshgaran.databinding;

import android.content.Context;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.angels.pooyeshgaran.R;
import com.squareup.picasso.Picasso;

public class PicassoBindingAdapters {

    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView view, String imageUrl){

        Context context = view.getContext();

        Picasso.with(context)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(view);
    }
}
