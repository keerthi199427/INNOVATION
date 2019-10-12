package com.creative.projecty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class newBookActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newbook);

        Spinner stateList = (Spinner) findViewById(R.id.state_spinner);
        Spinner districtList = (Spinner) findViewById(R.id.district_spinner);
        Spinner villageList = (Spinner) findViewById(R.id.village_spinner);
        stateList.setOnItemSelectedListener(this);
        districtList.setOnItemSelectedListener(this);
        villageList.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(this,
                R.array.state_list, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        stateList.setAdapter(stateAdapter);

        ArrayAdapter<CharSequence> districtAdapter = ArrayAdapter.createFromResource(this,
                R.array.district_list, android.R.layout.simple_spinner_item);
        districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        districtList.setAdapter(districtAdapter);

        ArrayAdapter<CharSequence> villageAdapter = ArrayAdapter.createFromResource(this,
                R.array.village_list, android.R.layout.simple_spinner_item);
        villageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        villageList.setAdapter(villageAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
