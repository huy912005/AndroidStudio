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
public class KhoiC extends ThiSinh {
    private String van314;
    private String su314;
    private String dia314;

    public KhoiC() {
    }
    
    public KhoiC(String van314, String su314, String dia314, int soBaoDanh314, String hoTen314, String diaChi314, String uuTien314) {
        super(soBaoDanh314, hoTen314, diaChi314, uuTien314);
        this.van314 = van314;
        this.su314 = su314;
        this.dia314 = dia314;
    }
    
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap diem Van: ");
        van314 = sc.nextLine();
        System.out.print("Nhap diem Su: ");
        su314 = sc.nextLine();
        System.out.print("Nhap diem Dia: ");
        dia314 = sc.nextLine();
    }
    
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Van : " + this.van314);
        System.out.println("Su  : " + this.su314);
        System.out.println("Dia : " + this.dia314);
    }
}