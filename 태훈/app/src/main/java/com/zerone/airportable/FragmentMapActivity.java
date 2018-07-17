package com.zerone.airportable;

/**
 * Created by yoonhwan on 2018-07-15.
 * 프래그먼트를 사용해서 맵을 키는 방법
 */
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.nhn.android.maps.NMapView;

public class FragmentMapActivity extends FragmentActivity {

    private NMapView mMapView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragments);

        mMapView = (NMapView)findViewById(R.id.mapView);

        // initialize map view
        mMapView.setClickable(true);
        mMapView.setEnabled(true);
        mMapView.setFocusable(true);
        mMapView.setFocusableInTouchMode(true);
        mMapView.requestFocus();
    }
}