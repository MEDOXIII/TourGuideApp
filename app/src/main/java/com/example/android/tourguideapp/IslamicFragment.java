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
public class IslamicFragment extends Fragment {


    public IslamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Site> historicalSite = new ArrayList<Site>();

        historicalSite.add(new Site(" The atmospheric, narrow lanes of the capital\"s Islamic Cairo district are crammed full of mosques, madrassas (Islamic schools of learning),and monuments dating from the Fatimid through to the Mameluke eras. This is where you'll find the labyrinth shopping souk of Khan el-Khalili where coppersmiths and artisans still have their tiny workshops, and stalls are laden with ceramics, textiles, spice, and perfume.Surrounding the market is a muddle of roads, home to some of the most beautiful preserved architecture of the old Islamic empires. There is a wealth of history here to explore. Visit Al-Azhar Mosque and the dazzling Sultan Hassan Mosque,and make sure you climb to the roof of the ancient medieval gate of Bab Zuweila for the best minaret-speckled panoramas across the district.",R.drawable.islamic));

        SiteAdapter adapter = new SiteAdapter(getActivity(), historicalSite);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
