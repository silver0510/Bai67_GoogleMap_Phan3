package com.example.sinki.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sinki.bai67_googlemap_phan3.R;
import com.example.sinki.model.NhaHang;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by Sinki on 9/10/2017.
 */

public class CustomInfoAdapter implements GoogleMap.InfoWindowAdapter {
    Activity context;
    NhaHang nhaHang;
    public CustomInfoAdapter(Activity context,NhaHang nhaHang)
    {
        this.context = context;
        this.nhaHang = nhaHang;
    }
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View item = inflater.inflate(R.layout.item,null);
        ImageView imgHinh = (ImageView)item.findViewById(R.id.imgHinh);
        TextView txtTen = (TextView)item.findViewById(R.id.txtTen);

        imgHinh.setImageResource(nhaHang.getHinh());
        txtTen.setText(nhaHang.getTen());

        return item;
    }
}
