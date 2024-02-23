 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanly;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhachHang extends Thue implements Serializable {
    private  String maSp;
    private String tenSP;

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public KhachHang(String maSp, String tenSP) {
        this.maSp = maSp;
        this.tenSP = tenSP;
    }

    public KhachHang(String maSp, String tenSP, Date ngayNhap, int soLuong, double gia, LoaiXe loaiSp,int soGio,String soDienThoai) {
        super(ngayNhap, soLuong, gia, loaiSp,soGio,soDienThoai);
        this.maSp = maSp;
        this.tenSP = tenSP;
    }

    public KhachHang() {
    }
    
    

   

   
    
}
