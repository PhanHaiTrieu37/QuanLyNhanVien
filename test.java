/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt56_200899881_PhanHaiTrieu;

import java.util.List;

/**
 *
 * @author HẢI TRIỀU
 */
public class test {
    public static void main(String[] args) {
        
        QuanLyDanhSachNhanVien ds = new QuanLyDanhSachNhanVien();
        ds.them(new GiangVien(111, 2.45f, 1000000, 1, ETrinhDo.THS));
        ds.them(new GiangVien(222, 2.45f, 1000000, 1, ETrinhDo.TS));
        ds.them(new GiangVien(333, 2.45f, 1000000, 1, ETrinhDo.TS));
        ds.them(new NhanVienHanhChinh(444, 2.45f, 500000, 2));
        ds.them(new NhanVienHanhChinh(555, 2.45f, 500000, 3));
        System.out.println("Danh sách nhân viên: "+ds);
        
        boolean kqxoa = ds.xoaNVTheoMa(111);
        if(kqxoa){
            System.out.println("Xóa thành công!\n Danh sách sau khi xóa");
            System.out.println(ds);
        }else{
            System.out.println("Xóa không thành không! Không có mã cần xóa");
        }
        
        ds.sxTheoMaGiam();
        System.out.println("Danh sách sau khi sắp xếp giảm dần theo mã:"+ ds);
        
        List<NhanVien> kq = ds.layDSTienSi();
        System.out.println("Danh sách nhân viên có trình độ là Tiến sĩ: ");
        System.out.println(GiangVien.getTieuDe());
        for (NhanVien nhanVien : kq) {
            System.out.println(nhanVien);
        }
    }
    
}
