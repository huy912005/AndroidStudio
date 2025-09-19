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
public class HocSinh extends Nguoi{
    private String lop314;
    private String khoaHoc314;
    private String kyHoc314;

    public String getLop() {
        return lop314;
    }

    public HocSinh() {
    }

    public HocSinh(String lop314, String khoaHoc314, String kyHoc314, String hoTen314, Date ngaySinh314, String queQuan314) {
        super(hoTen314, ngaySinh314, queQuan314);
        this.lop314 = lop314;
        this.khoaHoc314 = khoaHoc314;
        this.kyHoc314 = kyHoc314;
    }
    
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap lop: ");
        lop314 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc314 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc314 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lop: " + lop314);
        System.out.println("Khoa hoc: " + khoaHoc314);
        System.out.println("Ky hoc: " + kyHoc314);
    }
}
