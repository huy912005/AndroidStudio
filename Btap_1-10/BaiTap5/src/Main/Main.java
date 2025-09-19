/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Class.KhuPho;
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
        KhuPho kp = new KhuPho();
        int lc;

        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Nhap danh sach ho dan");
            System.out.println("2. Hien thi danh sach ho dan");
            System.out.println("3. Hien thi cac ho co nguoi 80 tuoi");
            System.out.println("0. Thoat");
            System.out.print("Moi ban lua chon: ");
            lc = sc.nextInt();
            sc.nextLine();

            switch (lc) {
                case 1:
                    kp.nhapDanhSach(sc);
                    break;
                case 2:
                    kp.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap nam hien tai: ");
                    int nam = sc.nextInt();
                    sc.nextLine();
                    kp.hienThiHoCoNguoi80Tuoi(nam);
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
