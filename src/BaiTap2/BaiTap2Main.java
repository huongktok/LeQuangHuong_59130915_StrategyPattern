/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author DT
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa h1 = new HangHoa("Áo Sơ Mi", 445000, "Áo Sơ Mi Nam IS19-03084 ");
        HangHoa h2 = new HangHoa("Quần Tây", 530000, "Quần Tây Nam A21 2019 R492126066");
        
        GioHang gh1 = new GioHang();
        gh1.themHH(h1);
        gh1.themHH(h2);
        gh1.setHinhThucTT(new ThanhToanCOD());
        gh1.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên COD: "+gh1.getThanhToan(gh1.getTienHang())+"\n");
        
        GioHang gh2 = new GioHang();
        gh2.themHH(h1);
        gh2.themHH(h2);
        gh2.setHinhThucTT(new ThanhToanOnline());
        gh2.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên Online: "+gh2.getThanhToan(gh2.getTienHang())+"\n");
    }
    
}
