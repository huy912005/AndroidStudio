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
public class TapChi extends TaiLieu{
    private int soPhatHanh314;
    private int thangPhatHang314;

    public TapChi() {
    }

    public TapChi(int soPhatHanh314, int thangPhatHang314) {
        this.soPhatHanh314 = soPhatHanh314;
        this.thangPhatHang314 = thangPhatHang314;
    }

    public TapChi(int soPhatHanh314, int thangPhatHang314, String maTaiLieu314, String tenNhaSX314, String soBanPhatHanh314) {
        super(maTaiLieu314, tenNhaSX314, soBanPhatHanh314);
        this.soPhatHanh314 = soPhatHanh314;
        this.thangPhatHang314 = thangPhatHang314;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap so phat hanh : ");
        soPhatHanh314 = sc.nextInt();
        System.out.println("Nhap thang phat hanh : ");
        thangPhatHang314 = sc.nextInt();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("So phat hanh : "+soPhatHanh314);
        System.out.println("Thang phat hanh : "+thangPhatHang314);
    }
}
