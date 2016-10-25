package co.creativev.bootcamp.got;

import android.databinding.BindingAdapter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BindingAdapters {

    @BindingAdapter("bind:imageUrl")
    public static void setImageUrl(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(Uri.parse(url))
                .placeholder(R.drawable.profile_placeholder_full)
                .error(R.drawable.profile_placeholder_error_full)
                .into(view);
    }

}
