package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SiteAdapter extends ArrayAdapter<Site> {

    public SiteAdapter(Activity context, ArrayList<Site> historicalSite) {

        super(context, 0, historicalSite);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }


        Site currentSite = getItem(position);

        TextView siteTextView = (TextView) listItemView.findViewById(R.id.text_view);

        siteTextView.setText(currentSite.getmSiteName());


        ImageView siteimageView = (ImageView) listItemView.findViewById(R.id.image);

        siteimageView.setImageResource(currentSite.getmSitepic());

        return listItemView;
    }

}
