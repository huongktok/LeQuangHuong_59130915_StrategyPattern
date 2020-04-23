/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DT
 */
public class QLSV {
    List<SinhVien> dsSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    
    public void themSV(SinhVien sinhvien) {
        dsSV.add(sinhvien);
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }
    
    public void sapXep() {
        SinhVien sv = new SinhVien();
        for(int i=0; i<dsSV.size(); i++) {
            for(int j=i+1; j<dsSV.size(); j++) {
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) <= 0) {
                    sv = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, sv);
                }
            }
        }
        
    }
    
    public void inDS() {
        for(SinhVien sinhVien: dsSV) {
            System.out.println(sinhVien.inTT()+"\n");
        }
    }

}
