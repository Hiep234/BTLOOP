/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanly;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author TRAN HOANG HIEP
 */
public class Thue implements Serializable {
    private Date ngayNhap;
    private int soLuong;
    private double gia;
    private LoaiXe loaiSp;
    private int soGio;
    private String soDienThoai;

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public LoaiXe getLoaiSp() {
        return loaiSp;
    }

    public void setLoaiSp(LoaiXe loaiSp) {
        this.loaiSp = loaiSp;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
    
    public String getSoDienThoai(){
        return soDienThoai;
    }
    
    public void setSoDienThoai(String soDienThoai){
        this.soDienThoai=soDienThoai;
    }

    public Thue(Date ngayNhap, int soLuong, double gia, LoaiXe loaiSp, int soGio,String soDienThoai) {
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.gia = gia;
        this.loaiSp = loaiSp;
        this.soGio = soGio;
        this.soDienThoai=soDienThoai;
    }

    public Thue() {
    }
    
   

    
}
