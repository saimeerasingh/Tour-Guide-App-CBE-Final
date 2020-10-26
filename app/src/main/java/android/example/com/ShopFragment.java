package android.example.com;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    public ShopFragment(){

    }
    @Override
    public void onStart() {
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        final ArrayList<data> items = new ArrayList<data>();

        items.add(new data(getString(R.string.crosscut_road),
                R.drawable.crosscut,
                getString(R.string.showroom)));

        items.add(new data(getString(R.string.oppanakaara_st),
                R.drawable.oppanakara,
                getString(R.string.street_shopping)));

        items.add(new data(getString(R.string.raja_st),
                R.drawable.rajast,
                getString(R.string.street_shopping)));

        items.add(new data(getString(R.string.brook_field),
                R.drawable.brookfeilds,
                getString(R.string.showroom)));

        items.add(new data(getString(R.string.poompuhar),
                R.drawable.handicraft,
                getString(R.string.handicrafts)));



        final dataAdapter adapter = new dataAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}