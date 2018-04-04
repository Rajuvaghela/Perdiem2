package com.bitnet.misterro.perdiem.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bitnet.misterro.perdiem.R;
import com.bitnet.misterro.perdiem.SubProductActivity;

public class ProductFragment extends Fragment implements View.OnClickListener {

    CardView card_view_kitchen_accessories;
    public ProductFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_product, container, false);
        card_view_kitchen_accessories=(CardView)view.findViewById(R.id.card_view_kitchen_accessories);
        card_view_kitchen_accessories.setOnClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.card_view_kitchen_accessories:
                startActivity(new Intent(getActivity().getApplicationContext(), SubProductActivity.class));

                break;
        }
    }
}
