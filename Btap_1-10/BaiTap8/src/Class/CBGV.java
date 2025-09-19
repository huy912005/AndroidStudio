/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CBGV extends Nguoi {

    private double luongCung314;
    private double thuong314;
    private double phat314;
    private double luongThucLinh314;

    public double getLuongThucLinh314() {
        return luongThucLinh314;
    }

    public CBGV() {
    }

    public CBGV(double luongCung314, double thuong314, double phat314, double luongThucLinh314, String hoTen, Date ngaySinh, String queQuan) {
        super(hoTen, ngaySinh, queQuan);
        this.luongCung314 = luongCung314;
        this.thuong314 = thuong314;
        this.phat314 = phat314;
        this.luongThucLinh314 = luongThucLinh314;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap luong cung : ");
        luongCung314 = sc.nextDouble();
        System.out.println("Nhap thuong : ");
        thuong314 = sc.nextDouble();
        System.out.println("Nhap phat : ");
        phat314 = sc.nextDouble();
        luongThucLinh314 = luongCung314 + thuong314 - phat314;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("Luong cung : %.0f\n", luongCung314);
        System.out.printf("Thuong : %.0f\n", thuong314);
        System.out.printf("Phat : %.0f\n", phat314);
        System.out.printf("Luong thuc linh : %.0f\n", luongThucLinh314);
    }

}
