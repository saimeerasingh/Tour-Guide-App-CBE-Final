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


public class StayFragment extends Fragment {

    public StayFragment() {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        final ArrayList<data> items = new ArrayList<data>();

        items.add(new data(getString(R.string.taj),
                R.drawable.vivanta_cbe,
                getString(R.string.city_centre)));

        items.add(new data(getString(R.string.lemon_tree),
                R.drawable.lemontree_cbe,
                getString(R.string.closer_to_airport)));

        items.add(new data(getString(R.string.residency),
                R.drawable.residency_cbe,
                getString(R.string.city_centre)));

        items.add(new data(getString(R.string.marriott),
                R.drawable.marriott_cbe,
                getString(R.string.closer_to_airport)));

        items.add(new data(getString(R.string.jenneys),
                R.drawable.jenneys_cbe,
                getString(R.string.closer_to_airport)));


        final dataAdapter adapter = new dataAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}