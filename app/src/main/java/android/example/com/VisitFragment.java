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

public class VisitFragment extends Fragment {

    public VisitFragment() {

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

        items.add(new data(getString(R.string.pateeshwarar_kovil),
                R.drawable.perurkovil,
                getString(R.string.perur)));

        items.add(new data(getString(R.string.waterfalls),
                R.drawable.siruvani,
                getString(R.string.siruvani_waterfalls)));

        items.add(new data(getString(R.string.murugan_temple),
                R.drawable.marudhamalai,
                getString(R.string.marudhamalai)));

        items.add(new data(getString(R.string.aaliyardam),
                R.drawable.aaliyardam,
                getString(R.string.anaimalai)));

        items.add(new data(getString(R.string.shiva_statue),
                R.drawable.adiyogi,
                getString(R.string.isha_yoga)));


        final dataAdapter adapter = new dataAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}