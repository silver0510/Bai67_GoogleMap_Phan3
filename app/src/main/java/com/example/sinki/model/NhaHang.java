package com.example.sinki.model;

import java.io.Serializable;

/**
 * Created by Sinki on 9/10/2017.
 */

public class NhaHang implements Serializable {
    private String ten;
    private int hinh;
    private double viDo;
    private double kinhDo;

    public NhaHang(String ten, int hinh, double viDo, double kinhDo) {
        this.ten = ten;
        this.hinh = hinh;
        this.viDo = viDo;
        this.kinhDo = kinhDo;
    }

    public NhaHang() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public double getViDo() {
        return viDo;
    }

    public void setViDo(double viDo) {
        this.viDo = viDo;
    }

    public double getKinhDo() {
        return kinhDo;
    }

    public void setKinhDo(double kinhDo) {
        this.kinhDo = kinhDo;
    }

    @Override
    public String toString() {
        return this.ten;
    }
}
