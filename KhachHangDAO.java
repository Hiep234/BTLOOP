/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanly;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangDAO {
    List<KhachHang> lsSP = new ArrayList<>();
    public int add(KhachHang sp){
        lsSP.add(sp);
        return 1;
    }
    
    public int count(){
        return lsSP.size();
    }
    public void setAllSanPham(List<KhachHang> danhSachKhachHang) {
        lsSP = danhSachKhachHang;
    }

    
    public List<KhachHang> getAllSanPham(){
        return lsSP;
    }
    public KhachHang findByID(String id){
        for (KhachHang sp : lsSP) {
            if(sp.getMaSp().equalsIgnoreCase(id)){
                return sp;
            }
        }
        return null;
    }
    
    public int del(String id){
        KhachHang sp = findByID(id);
        if(sp!=null){
            lsSP.remove(sp);
            return 1;
        }
        return -1;
    }
    
    public KhachHang getSanPhamAtPoint(int position){
        return lsSP.get(position);
    }
    public int edit(KhachHang spNew){
        for(KhachHang sp : lsSP){
            if(sp.getMaSp().equalsIgnoreCase(spNew.getMaSp())){
                sp.setTenSP(spNew.getTenSP());
                sp.setNgayNhap(spNew.getNgayNhap());
                sp.setGia(spNew.getGia());
                sp.setSoLuong(spNew.getSoLuong());
                sp.setSoGio(spNew.getSoGio());
                sp.setLoaiSp(spNew.getLoaiSp());
                sp.setSoDienThoai(spNew.getSoDienThoai());
                return 1;
                
            }
        }
        return -1;
    }
    
     public void saveToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(lsSP); // listKhachHang là danh sách chứa dữ liệu cần lưu
        }
    }
     
     public void readFromFile(String fileName) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            lsSP = (List<KhachHang>) ois.readObject(); // listKhachHang là danh sách chứa dữ liệu đọc từ file
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
