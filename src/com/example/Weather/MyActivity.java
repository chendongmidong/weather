package com.example.Weather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MyActivity extends Activity implements View.OnClickListener {
    private Button cityList;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);

        cityList = (Button) findViewById(R.id.city_list);
        cityList.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int requestCode = 1;
        switch (v.getId()) {
            case R.id.city_list: {
                Intent showCity = new Intent(MyActivity.this, ShowCity.class);
                startActivityForResult(showCity, requestCode);
            }
        }
    }
}
