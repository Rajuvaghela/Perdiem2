package com.bitnet.misterro.perdiem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class SubProductActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout ll_back;
    CardView card_view_wire_basket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_product);
        ll_back = (LinearLayout) findViewById(R.id.ll_back);
        card_view_wire_basket=(CardView)findViewById(R.id.card_view_wire_basket);
        card_view_wire_basket.setOnClickListener(this);
        ll_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_back:
                finish();
                break;

            case R.id.card_view_wire_basket:
                startActivity(new Intent(getApplicationContext(), ListOfProductActivity.class));
                break;

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
