package com.example.Weather;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by zhao on 2015/11/17.
 */
public class ShowCity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.city_list);
    }
}
