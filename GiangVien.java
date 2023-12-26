/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt56_200899881_PhanHaiTrieu;

import java.text.DecimalFormat;

/**
 *
 * @author HẢI TRIỀU
 */
public class GiangVien extends NhanVien {

    private float soTietDay;
    private ETrinhDo trinhDo;

    public float getSoTietDạy() {
        return soTietDay;
    }

    public void setSoTietDay(float soTietDay) {
        if (soTietDay < 0) {
            this.soTietDay = 0;
        } else {
            this.soTietDay = soTietDay;
        }
    }

    public ETrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(ETrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public GiangVien( int maNV, float heSoLuong, double phuCap, float soTietDay, ETrinhDo trinhDo) {
        super(maNV, heSoLuong, phuCap);
        this.setSoTietDay(soTietDay);
        this.setTrinhDo(trinhDo);
    }

    public GiangVien() {
        this(0,0,0,0,ETrinhDo.CN);
    }

    public static String getTieuDe(){
        return String.format("%s %-15s %-15s %-15s", NhanVien.getTieuDe(), "Số tiết dạy", "Trình độ","Lương");
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return String.format("%s %-15.0f %-15s %-15s", super.toString(), soTietDay, trinhDo, df.format(tinhLuongNV()));
    }

    @Override
    public double tinhLuongNV() {
        double luong =0;
        if(trinhDo == trinhDo.TS){
            luong  = (double) getHeSoLuong() * 1490 + getPhuCap() + (double) soTietDay * 1.5 * 100;
        }else{
            luong = (double) getHeSoLuong() * 1490 + getPhuCap() + (double) soTietDay * 100;
        }
        return luong;
    }

}
