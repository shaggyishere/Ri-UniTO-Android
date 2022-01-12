package com.reservation.application.fragments.main.ui;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.reservation.application.fragments.main.FridayFragment;
import com.reservation.application.fragments.main.MondayFragment;
import com.reservation.application.R;
import com.reservation.application.fragments.main.ThursdayFragment;
import com.reservation.application.fragments.main.TuesdayFragment;
import com.reservation.application.fragments.main.WednesdayFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4, R.string.tab_text_5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
//        return PlaceholderFragment.newInstance(position + 1);
        switch (position) {
            case 1 :
                return new TuesdayFragment();
            case 2 :
                return new WednesdayFragment();
            case 3 :
                return new ThursdayFragment();
            case 4 :
                return new FridayFragment();
        }
        return new MondayFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }
}