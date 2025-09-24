/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Class.HSHocSinh;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        HSHocSinh hs = new HSHocSinh();
        int chon;
        do {
            System.out.println("===== MENU QUAN LY HOC SINH =====");
            System.out.println("1. Nhap danh sach hoc sinh");
            System.out.println("2. Hien thi hoc sinh sinh nam 1985 va que Thai Nguyen");
            System.out.println("3. Hien thi hoc sinh lop 10A1");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            chon = sc.nextInt();
            sc.nextLine(); 
            switch (chon) {
                case 1:
                    hs.nhapThongTin(sc);
                    break;
                case 2:
                    System.out.println("=== HOC SINH SINH NAM 1985 VA QUE THAI NGUYEN ===");
                    hs.hienThiSN85VaThaiNguyen();
                    break;
                case 3:
                    System.out.println("=== HOC SINH LOP 10A1 ===");
                    hs.hienThi10A1();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, moi chon lai!");
            }
        } while (chon != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
