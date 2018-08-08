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
public class PyramidsFragment extends Fragment {


    public PyramidsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Site> historicalSite = new ArrayList<Site>();

        historicalSite.add(new Site("The last surviving of the Seven Wonders of the Ancient World,the Pyramids of Giza are one of the world\"s most recognisable landmarks. Built as tombs for the mighty Pharaohs and guarded by the enigmatic Sphinx,Giza\"s pyramid complex has awed travelers down through the ages and had archaeologists (and a fair few conspiracy theorists) scratching their heads over how they were built for centuries.Today, these megalithic memorials to dead kings are still as wondrous a sight as they ever were.An undeniable highlight of any Egypt trip, Giza's pyramids should not be missed.",R.drawable.pyramids));

        SiteAdapter adapter = new SiteAdapter(getActivity(), historicalSite);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
