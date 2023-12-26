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
public abstract class NhanVien {

    private int maNV;
    private float heSoLuong;
    private double phuCap;

    public int getMaNV() {
        return maNV;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.maNV;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        if (this.maNV != other.maNV) {
            return false;
        }
        return true;
    }

    public void setMaNV(int maNV) {
        if (maNV < 0) {
            this.maNV = 0;
        } else {
            this.maNV = maNV;
        }
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        if (heSoLuong <= 4.99 && heSoLuong >= 2.34) {
            this.heSoLuong = heSoLuong;
        } else {
            this.heSoLuong = 2.34f;
        }
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        if (phuCap < 0) {
            this.phuCap = 0;
        } else {
            this.phuCap = phuCap;
        }
    }

    public NhanVien() {
        this(0,0,0);
    }

    public NhanVien(int maNV, float heSoLuong, double phuCap) {
        this.setMaNV(maNV);
        this.setHeSoLuong(heSoLuong);
        this.setPhuCap(phuCap);
    }

    public static String getTieuDe(){
        return String.format("%-15s %-20s %-20s", "Mã Nhân Viên", "Hệ số lương ","Phụ cấp");
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return String.format("%-15d %-20.2f %-20s", maNV, heSoLuong, df.format(phuCap));
    }

    public abstract double tinhLuongNV();
}
