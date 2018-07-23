package com.death.uttamtutorial;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;

import com.death.uttamtutorial.adapter.SimpleListAdapter;
import com.death.uttamtutorial.model.DataItem;
import com.death.uttamtutorial.model.Response;
import com.rw.velocity.Velocity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    SimpleListAdapter simpleListAdapter;
    List<DataItem> dataItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = findViewById(R.id.list_sample);
        Velocity.initialize(3);
        Velocity.get("http://extrade.titanblue.com.au/api/categorylist").connect(new Velocity.ResponseListener()
        {
            @Override
            public void onVelocitySuccess(Velocity.Response response)
            {
                Response response1 = response.deserialize(Response.class);
                dataItems.clear();
                dataItems.addAll(response1.getData());
                simpleListAdapter = new SimpleListAdapter(dataItems,MainActivity.this);
                expandableListView.setAdapter(simpleListAdapter);
                Log.e("Data","data");

            //comment is added to the code

            }

            @Override
            public void onVelocityFailed(Velocity.Response error)
            {
            }
        });
    }
}
