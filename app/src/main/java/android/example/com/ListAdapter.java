package android.example.com;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;



public class ListAdapter extends FragmentPagerAdapter {
    private Context thisContext;
    private int currentPos = -1;

    public ListAdapter(Context context, FragmentManager fm) {
        super(fm);
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.addToBackStack(null);
        transaction.commit();
        thisContext = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            currentPos = 0;
            return new VisitFragment();
        } else if (position == 1) {
            currentPos = 1;
            return new EatFragment();
        } else if (position == 2) {
            currentPos = 2;
            return new ShopFragment();
        } else
            currentPos = 3;
        return new StayFragment();
    }


    @Override
    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return thisContext.getString(R.string.visit);
        } else if (position == 1) {
            return thisContext.getString(R.string.eat);
        } else if (position == 2) {
            return thisContext.getString(R.string.shop);
        } else if (position == 3) {
            return thisContext.getString(R.string.stay);
        } else {
            return "";
        }
    }

}