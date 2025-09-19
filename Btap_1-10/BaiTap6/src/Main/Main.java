/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Class.KhachSan;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static void menu() {
        Scanner sc = new Scanner(System.in);
        KhachSan ks = new KhachSan();
        int lc;
        do {
            System.out.println("====== QUAN LY KHACH SAN ======");
            System.out.println("1. Nhap danh sach khach tro");
            System.out.println("2. Hien thi danh sach khach tro");
            System.out.println("3. Tinh tien phong theo CMND");
            System.out.println("4. Xoa khach theo CMND");
            System.out.println("0. Thoat");
            System.out.println("===============================");
            System.out.print("Moi ban chon: ");
            lc = sc.nextInt();
            sc.nextLine();

            switch (lc) {
                case 1:
                    ks.nhapThongTin(sc);
                    break;
                case 2:
                    ks.hienThiThongTin();
                    break;
                case 3:
                    System.out.print("Nhap so CMND khach can tinh tien: ");
                    String cmndTinh = sc.nextLine();
                    ks.tinhTien(cmndTinh);
                    break;
                case 4:
                    System.out.print("Nhap so CMND khach can xoa: ");
                    String cmndXoa = sc.nextLine();
                    ks.xoaThongTin(cmndXoa);
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (lc != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
