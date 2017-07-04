package com.example.harsh.octiontestproject;

/**
 * Created by Harsh on 04-07-2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

public class CurrentItemAdapter extends RecyclerView.Adapter<CurrentItemAdapter.MyViewHolder> {

    private List<ItemDatum> ItemDatumsList;
    ImageLoader imageLoader;
    DisplayImageOptions displayimageOptions;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, current_price, retailPrice,time;
        ImageView imageView;

        MyViewHolder(View view) {
            super(view);
            imageView=(ImageView)view.findViewById(R.id.imageView);
            time = (TextView) view.findViewById(R.id.time);
            title = (TextView) view.findViewById(R.id.title);
            retailPrice = (TextView) view.findViewById(R.id.retail_prize);
            current_price = (TextView) view.findViewById(R.id.current_price);
        }
    }


    public CurrentItemAdapter(List<ItemDatum> ItemDatumsList, Context context) {
        this.ItemDatumsList = ItemDatumsList;
        displayimageOptions = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisk(true).build();


        // Create global configuration and initialize ImageLoader with this configuration
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context).
                defaultDisplayImageOptions(displayimageOptions).build();
        imageLoader = ImageLoader.getInstance();
        imageLoader.init(config);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.current_item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ItemDatum itemDatum = ItemDatumsList.get(position);
        holder.title.setText(itemDatum.getAuction().getTitle());
        holder.retailPrice.setText("Reatail Price "+itemDatum.getAuction().getProductPrice());
        holder.current_price.setText("HK$"+itemDatum.getAuction().getPrice());
        imageLoader.displayImage("https://dev-us-02.oction.co/api/v1"+itemDatum.getMedia().get(0).getMedia(), holder.imageView,displayimageOptions);
    }

    @Override
    public int getItemCount() {
        return ItemDatumsList.size();
    }
}
