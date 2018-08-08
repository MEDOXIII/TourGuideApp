package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return new PyramidsFragment();

        } else if (position == 1) {

            return new LuxorFragment();

        } else if (position == 2) {

            return new IslamicFragment();

        } else {
            return new SaintFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_pyramids);
        } else if (position == 1) {
            return mContext.getString(R.string.category_luxor);
        } else if (position == 2) {
            return mContext.getString(R.string.category_islamic);
        } else {
            return mContext.getString(R.string.category_saint);
        }
    }

}
