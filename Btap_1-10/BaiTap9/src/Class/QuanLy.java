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
public class QuanLy {

    private ArrayList<TheMuon> ds314;

    public QuanLy() {
        ds314 = new ArrayList<>();
    }

    public void themTheMuon(TheMuon tm) {
        ds314.add(tm);
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhap so the muon : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            TheMuon tm = new TheMuon();
            System.out.printf("---------- the muon %d -----------\n", i);
            tm.nhapThongTin(sc);
            themTheMuon(tm);
        }
    }

    public void hienThiThongTin() {
        int i =1;
        for (TheMuon tm : ds314) {
            System.out.printf("---------- thu %d -----------\n", i);
            tm.hienThiThongTin();
            i++;
        }
        if(i==1)
            System.out.println("Danh sach rong");
    }

    public void danhSachTraCuoiThang(){
        int i =1;
        for (TheMuon tm : ds314) {
            if (tm.getHanTra314().getDate() == 30 || tm.getHanTra314().getDate() == 31) {
                System.out.printf("---------- the muon %d -----------\n", i);
                tm.hienThiThongTin();
                i++;
            }
        }
        if(i==1)
            System.out.println("Danh sach rong");
    }
}
