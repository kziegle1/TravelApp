package com.example.android.travelapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family activities.
 */
public class FamilyFragment extends Fragment {

    public FamilyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.mora_iced_creamery,
                R.string.mora_iced_creamery_address, R.drawable.mora_ice_cream));
        places.add(new Place(R.string.suquamish_museum,
                R.string.suquamish_museum_address, R.drawable.suquamish_museum));
        places.add(new Place(R.string.white_horse,
                R.string.white_horse_address, R.drawable.white_horse));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.colorPrimary);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        //You can also use Butterknife library for view binding instead of writing findValueById() for each view element.
        //Android ButterKnife library is a view injection library that injects views into android activity / fragments using annotations. For example, @BindView annotation avoids using findViewById()method by automatically type casting the view element.
        //https://www.androidhive.info/2017/10/android-working-with-butterknife-viewbinding-library/

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        //Since there is no action on event of list item click, you can remove this code from all your fragment,
        // or just show an Toast message to display the name of the list attraction.

        // ***** FINISH*** Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@linkPlace} object at the given position the user clicked on
                Place place = places.get(position);
            }
        });

        return rootView;
    }

}

