package com.redcliffe.mygalleryandroid;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import java.util.ArrayList;


public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.MyViewHolder> {

    ArrayList<Integer> personNames;
    ArrayList<String> personImages;
    Context context;

    public GalleryAdapter(Context context, ArrayList<Integer> personNames, ArrayList<String> personImages) {
        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
       // holder.name.setText(personNames.get(position));
        holder.image.setImageResource(personNames.get(position));
        // implement setOnClickListener event on item view.
        try{
           /* Glide.with(context)
                    .load("https://www.myeaccounts.com//uploads/packaging_category/item_image/1206/thumb_Endive1__1_.jpg")
                   // .transition(DrawableTransitionOptions.withCrossFade())
                    .into(holder.image);*/

          // // val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open another activity on item click
                /*Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("image", personImages.get(position)); // put image data in Intent
                context.startActivity(intent); // start Intent*/
            }
        });

    }


    @Override
    public int getItemCount() {
        return personNames.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name;
        AppCompatImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.name);
            image = (AppCompatImageView) itemView.findViewById(R.id.image);

        }
    }
}
