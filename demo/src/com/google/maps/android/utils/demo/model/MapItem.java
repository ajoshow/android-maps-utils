package com.google.maps.android.utils.demo.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

import java.util.Random;

public class MapItem implements ClusterItem {
    public final int id;
    public final String name;
    public final int profilePhoto;
    private final LatLng mPosition;

    public MapItem(LatLng position, int id, String name, int pictureResource) {
        this.id = id;
        this.name = name;
        profilePhoto = pictureResource;
        mPosition = position;
    }

    public boolean placeStatusAtRight(){
        return new Random().nextInt() % 2 == 0;
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }

    @Override
    public long getId() {
        return id;
    }
}
