/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanly;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LoaiXeDAO {
    List<LoaiXe> lsLSP = new ArrayList<>();
    
    public LoaiXeDAO(){
       lsLSP.add(new LoaiXe("1","YAMAHA"));
       lsLSP.add(new LoaiXe("2","KAWASAKI"));
       lsLSP.add(new LoaiXe("3","DUCATI"));
       lsLSP.add(new LoaiXe("4","SUZUKI"));
    }
    public int add(LoaiXe sp){
        lsLSP.add(sp);
        return  1;
    }
    public List<LoaiXe> getAllLoaiSP(){
        return lsLSP;
    }
    
}
