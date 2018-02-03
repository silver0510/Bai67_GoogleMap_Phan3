package com.example.sinki.bai67_googlemap_phan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sinki.model.FakeNhaHang;
import com.example.sinki.model.NhaHang;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvNhaHang;
    ArrayList<NhaHang>dsNhaHang;
    ArrayAdapter<NhaHang>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        lvNhaHang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NhaHang nhaHang = dsNhaHang.get(position);

                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                intent.putExtra("NHAHANG",nhaHang);
                startActivity(intent);
            }
        });
    }

    private void addControls() {
        lvNhaHang = (ListView) findViewById(R.id.lvNhaHang);
        dsNhaHang = FakeNhaHang.layDanhSach();
        adapter = new ArrayAdapter<NhaHang>(MainActivity.this,android.R.layout.simple_list_item_1,dsNhaHang);
        lvNhaHang.setAdapter(adapter);
    }
}
