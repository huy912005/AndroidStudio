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
public class KhuPho {

    private ArrayList<HoGiaDinh> dsHo314;

    public KhuPho() {
        dsHo314 = new ArrayList<>();
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so ho dan: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ho dan thu " + (i + 1));
            HoGiaDinh ho = new HoGiaDinh();
            ho.nhapThongTin(sc);
            dsHo314.add(ho);
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < dsHo314.size(); i++) {
            System.out.println("===== Ho dan thu " + (i + 1) + " =====");
            dsHo314.get(i).hienThiThongTin();
        }
    }

    public void hienThiHoCoNguoi80Tuoi(int namHienTai) {
        for (int i = 0; i < dsHo314.size(); i++) {
            if (dsHo314.get(i).coNguoi80Tuoi(namHienTai)) {
                System.out.println("===== Ho dan thu " + (i + 1) + " co nguoi >= 80 tuoi =====");
                dsHo314.get(i).hienThiThongTin();
            }
        }
    }
}
