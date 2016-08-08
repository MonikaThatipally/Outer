package com.example.monikathatipally.outer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Custom extends ArrayAdapter<String> {
    Custom(Context context, String[] foods) {
        super(context, R.layout.custom ,foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customView = buckysInflater.inflate(R.layout.custom, parent, false);

        String singleFoodItem = getItem(position);
        TextView buckysText = (TextView) customView.findViewById(R.id.tvvid);
        ImageView buckysImage = (ImageView) customView.findViewById(R.id.imageid);

        buckysText.setText(singleFoodItem);

        if(position==0) {
            buckysImage.setImageResource(R.drawable.soy);
        }
        if(position==1) {

            buckysImage.setImageResource(R.drawable.pancake);
        }
        if(position==2) {

            buckysImage.setImageResource(R.drawable.smartdog);
        }
        if(position==3) {
            buckysImage.setImageResource(R.drawable.breadsticks);
        }
        if(position==4) {

            buckysImage.setImageResource(R.drawable.ghatiasticks);
        }
        if(position==5) {
            buckysImage.setImageResource(R.drawable.sevpuri);
        }
        if(position==6) {

            buckysImage.setImageResource(R.drawable.masalavada);
        }
        if(position==7) {

            buckysImage.setImageResource(R.drawable.broccolibread);
        }
        if(position==8) {

            buckysImage.setImageResource(R.drawable.pancake);
        }
        return customView;
    }
}
