package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SaintFragment extends Fragment {




    public SaintFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Site> historicalSite = new ArrayList<Site>();

        historicalSite.add(new Site(" One of the oldest monasteries in the world, St. Catherine\"s stands at the foot of Mount Sinai, where Moses is said to have received the Ten Commandments.This desert monastery is home to an incredible collection of religious iconography, art, and manuscripts (some of which can be seen in the on-site museum) as well as the home of the burning bush.For most visitors here, a trip to St. Catherine's also involves a hike up Mount Sinai to see sunrise or sunset.Take the camel path for the easy route or climb the famous Steps of Repentance if you want better views.",R.drawable.katherines));


        SiteAdapter adapter = new SiteAdapter(getActivity(), historicalSite);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
