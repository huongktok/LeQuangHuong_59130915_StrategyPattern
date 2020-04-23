/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author DT
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat ns = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Lê Quang Hưởng", ns.parse("20/11/1998"), 8.5f);
        SinhVien sv2 = new SinhVien("Nguyễn Cao Hùng", ns.parse("01/05/1999"), 8.0f);
        SinhVien sv3 = new SinhVien("Nguyễn Minh Thành", ns.parse("14/12/1999"), 8.3f);
        SinhVien sv4 = new SinhVien("Châu Cẩm Ly", ns.parse("11/01/1999"), 7.6f);
        SinhVien sv5 = new SinhVien("Hồ Thúy Vi", ns.parse("05/05/1999"), 9.2f);
        
        QLSV dssv = new QLSV();
        dssv.themSV(sv1);
        dssv.themSV(sv2);
        dssv.themSV(sv3);
        dssv.themSV(sv4);
        dssv.themSV(sv5);
        
        dssv.setSoSanh(new SoSanhTheoTen());
        dssv.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo tên:"+"\n");
        dssv.inDS();
        
        dssv.setSoSanh(new SoSanhTheoDiem());
        dssv.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo điểm:"+"\n");
        dssv.inDS();
    }
    
}
