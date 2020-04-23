/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author DT
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context lq=new context();
        lq.setTinhtoan(new Cong());
        System.out.println("Tổng của 75 + 12 là: "+lq.tinh(75, 12));
        lq.setTinhtoan(new Tru());
        System.out.println("Hiệu của 54 - 78 là: "+lq.tinh(54, 78));
    }
    
}
