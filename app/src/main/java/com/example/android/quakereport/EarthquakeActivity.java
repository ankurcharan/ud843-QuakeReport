/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        QueryUtils.extractEarthquakes();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();
//        earthquakes.add(new Earthquake("8.0", "San Francisco", "Mar 6, 2020"));
//        earthquakes.add(new Earthquake("8.1", "London", "Mar 7, 2020"));
//        earthquakes.add(new Earthquake("8.2", "Tokyo", "Mar 8, 2020"));
//        earthquakes.add(new Earthquake("8.3", "Mexico City", "Mar 9, 2020"));
//        earthquakes.add(new Earthquake("8.4", "Moscow", "Mar 10, 2020"));
//        earthquakes.add(new Earthquake("8.5", "Rio de Janeiro", "Mar 11, 2020"));
//        earthquakes.add(new Earthquake("8.6", "Paris", "Mar 12, 2020"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // earthquake adapter
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
