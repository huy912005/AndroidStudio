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
public class KhoiB extends ThiSinh {
    private String toan314;
    private String hoa314;
    private String sinh314;

    public KhoiB() {
    }

    public KhoiB(String toan314, String hoa314, String sinh314, int soBaoDanh314, String hoTen314, String diaChi314, String uuTien314) {
        super(soBaoDanh314, hoTen314, diaChi314, uuTien314);
        this.toan314 = toan314;
        this.hoa314 = hoa314;
        this.sinh314 = sinh314;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap diem Toan: ");
        toan314 = sc.nextLine();
        System.out.print("Nhap diem Hoa: ");
        hoa314 = sc.nextLine();
        System.out.print("Nhap diem Sinh: ");
        sinh314 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Toan : " + this.toan314);
        System.out.println("Hoa  : " + this.hoa314);
        System.out.println("Sinh : " + this.sinh314);
    }
}
