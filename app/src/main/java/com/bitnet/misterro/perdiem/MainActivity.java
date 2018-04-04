package com.bitnet.misterro.perdiem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about_us);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
