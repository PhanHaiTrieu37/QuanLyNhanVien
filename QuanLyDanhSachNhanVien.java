/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt56_200899881_PhanHaiTrieu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author HẢI TRIỀU
 */
public class QuanLyDanhSachNhanVien {

    List<NhanVien> list;

    public List<NhanVien> getList() {
        return list;
    }

    public QuanLyDanhSachNhanVien() {
        this.list = new ArrayList<NhanVien>();
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nGiảng viên \n" + GiangVien.getTieuDe() + "\n";
        for (NhanVien nhanVien : list) {
            if (nhanVien instanceof GiangVien) {
                s += nhanVien + "\n";
            }

        }

        s += "\nNhân viên hành chính \n" + NhanVienHanhChinh.getTieuDe() + "\n";
        for (NhanVien nhanVien : list) {
            if (nhanVien instanceof NhanVienHanhChinh) {
                s += nhanVien + "\n";
            }

        }

        return s;
    }

    public boolean them(NhanVien nv) {
        if (list.contains(nv)) {
            return false;
        } else {
            list.add(nv);
            return true;
        }
    }
    
    public boolean xoaNVTheoMa(int maXoa){
        return list.removeIf(nv -> nv.getMaNV() == maXoa);
    }

    public void sxTheoMaGiam(){
        Collections.sort(list, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Integer.compare(o2.getMaNV(), o1.getMaNV());
            }
        });
    }
    
    public List<NhanVien> layDSTienSi(){
        List<NhanVien> temps = new ArrayList<NhanVien>();
        for (NhanVien nhanVien : list) {
            if(nhanVien instanceof GiangVien){
                if(((GiangVien) nhanVien).getTrinhDo() == ETrinhDo.TS){
                    temps.add(nhanVien);
                    
                }
            }
        }
        return temps;
    }
}
