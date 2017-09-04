package com.example.ladvi.chernobylwelcome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by ladvi on 05/01/2017.
 */
public class LandmarkList extends AppCompatActivity {


    String[] landmarkArray = {"Ferris wheel","Hospital","Reactor number 4","Red Forest",
            "Hotel Polesia","Jupiter Factory","River Pripyat","Prometheus statue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landmarklist);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.landmarklist, landmarkArray);

        ListView listView = (ListView) findViewById(R.id.landmark_list_view);
        listView.setAdapter(adapter);


    }
}
