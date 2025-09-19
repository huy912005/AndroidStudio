/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TaiLieu {
    protected String maTaiLieu314;
    protected String tenNhaSX314;
    protected String soBanPhatHanh314;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu314, String tenNhaSX314, String soBanPhatHanh314) {
        this.maTaiLieu314 = maTaiLieu314;
        this.tenNhaSX314 = tenNhaSX314;
        this.soBanPhatHanh314 = soBanPhatHanh314;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap ma tai lieu : ");
        maTaiLieu314 = sc.nextLine();
        System.out.println("Nhap ten nha san xuat : ");
        tenNhaSX314 = sc.nextLine();
        System.out.println("Nhap so ban nha phat hanh : ");
        soBanPhatHanh314 = sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("Ma tai lieu : "+maTaiLieu314);
        System.out.println("Ten nha san xuat : "+tenNhaSX314);
        System.out.println("So ban nha phat hanh : "+soBanPhatHanh314);
    }
}
