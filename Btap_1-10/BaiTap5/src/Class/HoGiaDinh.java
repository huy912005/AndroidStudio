/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HoGiaDinh {
    private int soThanhVien314;
    private String soNha314;
    private ArrayList<Nguoi> dsNguoi314;

    public HoGiaDinh() {
        dsNguoi314 = new ArrayList<>();
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap so nha: ");
        soNha314 = sc.nextLine();
        System.out.print("Nhap so thanh vien: ");
        soThanhVien314 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soThanhVien314; i++) {
            System.out.println("Nhap thong tin thanh vien thu " + (i + 1));
            Nguoi ng = new Nguoi();
            ng.nhapThongTin(sc);
            dsNguoi314.add(ng);
        }
    }

    public void hienThiThongTin() {
        System.out.println("So nha: " + soNha314);
        System.out.println("So thanh vien: " + soThanhVien314);
        for (Nguoi ng : dsNguoi314) {
            System.out.println("----- Thanh vien -----");
            ng.hienThiThongTin();
        }
    }

    public boolean coNguoi80Tuoi(int namHienTai) {
        for (Nguoi ng : dsNguoi314) {
            try {
                int namSinh = ng.getNgaySinh314().getYear()+1900;
                if (namHienTai - namSinh >= 80) {
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }
}
