/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;
public class KhoiA extends ThiSinh {
    private String toan314;
    private String li314;
    private String hoa314;
    public KhoiA() {
    }
    public KhoiA(String toan314, String li314, String hoa314, int soBaoDanh314, String hoTen314, String diaChi314, String uuTien314) {
        super(soBaoDanh314, hoTen314, diaChi314, uuTien314);
        this.toan314 = toan314;
        this.li314 = li314;
        this.hoa314 = hoa314;
    }
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap diem Toan: ");
        toan314 = sc.nextLine();
        System.out.print("Nhap diem ly : ");
        li314 = sc.nextLine();
        System.out.print("Nhap diem hoa : ");
        hoa314 = sc.nextLine();
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Toan : " + this.toan314);
        System.out.println("Ly : " + this.li314);
        System.out.println("Hoa  : " + this.hoa314);
    }
}
