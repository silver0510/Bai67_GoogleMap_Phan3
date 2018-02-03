package com.example.sinki.model;

import com.example.sinki.bai67_googlemap_phan3.R;

import java.util.ArrayList;

/**
 * Created by Sinki on 9/10/2017.
 */

public class FakeNhaHang {
    public static ArrayList<NhaHang>layDanhSach()
    {
        ArrayList<NhaHang> ds = new ArrayList<>();
        ds.add(new NhaHang("Nhà hàng Bạch Kim", R.drawable.nhahang,10.783075,106.642614));
        ds.add(new NhaHang("Nhà hàng Hương Phố", R.drawable.huongpho,10.786175, 106.636995));
        return ds;
    }
}
