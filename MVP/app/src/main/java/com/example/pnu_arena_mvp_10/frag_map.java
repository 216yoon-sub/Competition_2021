package com.example.pnu_arena_mvp_10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class frag_map extends Fragment implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {
    private View view;
    private FragmentManager fragmentManager; //Fragment Manager
    private MapFragment mapFragment; //지도 fragment
    private MapView googlemap = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_map, container, false);

        googlemap = (MapView)view.findViewById(R.id.GoogleMap);
        googlemap.onCreate(savedInstanceState);
        googlemap.getMapAsync(this);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        googlemap.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
        googlemap.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        googlemap.onSaveInstanceState(outState);
    }

    @Override
    public void onResume() {
        super.onResume();
        googlemap.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        googlemap.onLowMemory();
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        LatLng center = new LatLng(35.23112453519772, 129.08231692683924);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("피자 전문점");
        markerOptions.snippet("피자");
        markerOptions.position(center);
        googleMap.addMarker(markerOptions);

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(center, 17));
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }

    @Override
    public void onInfoWindowClick(@NonNull Marker marker) {

    }
}
