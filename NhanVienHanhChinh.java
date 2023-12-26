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
public class NhanVienHanhChinh extends NhanVien {

    private int soNgayNghi;

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        if (soNgayNghi < 0) {
            this.soNgayNghi = 0;
        } else {
            this.soNgayNghi = soNgayNghi;
        }
    }

    public NhanVienHanhChinh( int maNV, float heSoLuong, double phuCap, int soNgayNghi) {
        super(maNV, heSoLuong, phuCap);
        this.setSoNgayNghi(soNgayNghi);
    }

    public NhanVienHanhChinh() {
        this(0,0,0,0);
    }
 
    public static String getTieuDe(){
        return String.format("%s %-10s %-15s", NhanVien.getTieuDe(), "Số ngày nghỉ","Lương");
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return String.format("%s %-10d %-15s", super.toString(), soNgayNghi,df.format(tinhLuongNV()));
    }

    @Override
    public double tinhLuongNV() {
        return (double) getHeSoLuong() * 1490 + getPhuCap() - (double) soNgayNghi * 200;
    }

}
