/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
     private String hoTen314;
    private Date ngaySinh314;
    private String ngheNghiep314;

    public Nguoi() {
    }

    public Nguoi(String hoTen314, Date ngaySinh314, String ngheNghiep314) {
        this.hoTen314 = hoTen314;
        this.ngaySinh314 = ngaySinh314;
        this.ngheNghiep314 = ngheNghiep314;
    }

    public String getHoTen314() {
        return hoTen314;
    }

    public Date getNgaySinh314() {
        return ngaySinh314;
    }

    public void nhapThongTin(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen314 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String ns = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh314 = sdf.parse(ns);
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le, mac dinh 01/01/1970");
            ngaySinh314 = new Date(0);
        }
        System.out.print("Nhap nghe nghiep: ");
        ngheNghiep314 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen314);
        System.out.println("Ngay sinh: " + ngaySinh314);
        System.out.println("Nghe nghiep: " + ngheNghiep314);
    }
}
