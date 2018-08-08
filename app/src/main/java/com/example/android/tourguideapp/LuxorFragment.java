package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LuxorFragment extends Fragment {


    public LuxorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Site> historicalSite = new ArrayList<Site>();

        historicalSite.add(new Site(" Famed for the Valley of the Kings, Karnak Temple, and the Memorial Temple of Hatshepsut,the Nile-side town of Luxor in Upper Egypt has a glut of tourist attractions.This is ancient Thebes, powerbase of the New Kingdom pharaohs, and home to more sights than most can see on one visit.While the East Bank brims with vibrant souk action, the quieter West Bank is home to a bundle of tombs and temples that has been called the biggest open air museum in the world.Spend a few days here exploring the colorful wall art of the tombs and gazing in awe at the colossal columns in the temples,and you\"ll see why Luxor continues to fascinate historians and archaeologists.",R.drawable.luxor));

        SiteAdapter adapter = new SiteAdapter(getActivity(), historicalSite);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
