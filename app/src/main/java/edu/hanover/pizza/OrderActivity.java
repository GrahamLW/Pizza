package edu.hanover.pizza;

import android.app.Activity;
import android.os.Bundle;
import android.app.ActionBar;
import android.util.Log;

public class OrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("Order","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
