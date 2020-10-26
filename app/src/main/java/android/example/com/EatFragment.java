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

public class EatFragment extends Fragment {

    public EatFragment() {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_category, container,
                false);

        final ArrayList<data> items = new ArrayList<data>();

        items.add(new data(getString(R.string.annapoorna),
                R.drawable.filtercoffee,
                getString(R.string.many_branches)));

        items.add(new data(getString(R.string.aanandhas),
                R.drawable.breakfast,
                getString(R.string.sitra)));

        items.add(new data(getString(R.string.annalakshmi),
                R.drawable.pongal,
                getString(R.string.race_course)));

        items.add(new data(getString(R.string.junior_Kupanna),
                R.drawable.biriyani,
                getString(R.string.gandhi_puram)));

        items.add(new data(getString(R.string.subbu_mess),
                R.drawable.chillichicken,
                getString(R.string.gandhi_puram)));


        final dataAdapter adapter = new dataAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}