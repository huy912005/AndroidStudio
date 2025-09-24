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
public class KhachSan {

    private ArrayList<KhachTro> ds314;

    public KhachSan() {
        ds314 = new ArrayList<>();
    }

    public void themKhachTro(KhachTro ks) {
        ds314.add(ks);
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhap so luong khach tro : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("--------------------------------");
            KhachTro kt = new KhachTro();
            kt.nhapThongTin(sc);
            themKhachTro(kt);
            sc.nextLine();
        }
    }

    public void hienThiThongTin() {
        int i = 1;
        for (KhachTro ks : ds314) {
            System.out.println("---Khach thu " + i + " ---");
            ks.hienThiThongTin();
            i++;
        }
        if (i == 1) {
            System.out.println("Danh sach tro rong!");
        }
    }

    public void xoaThongTin(String socm) {
        boolean removed = ds314.removeIf(kt -> kt.getSoCM().equals(socm));
        if (removed) {
            System.out.println("Xoa thanh cong khach co CMND: " + socm);
        } else {
            System.out.println("Khong tim thay khach co CMND: " + socm);
        }
    }

    public void tinhTien(String socm) {
        for (KhachTro ks : ds314) {
            if (socm.equals(ks.getSoCM())) {
                ks.hienThiThongTin();
                System.out.println("So tien can phai tra la : " + (ks.getGiaTro() * (double) ks.getSoNgayTro()));
            }
        }
    }
}
