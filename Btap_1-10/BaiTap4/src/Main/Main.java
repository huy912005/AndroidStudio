/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Class.TuyenSinh;
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
        TuyenSinh ts = new TuyenSinh();
        int lc;
        do {
            System.out.println("---------- MENU ----------");
            System.out.println("1. Nhap danh sach thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh");
            System.out.println("3. Tim kiem thi sinh theo so bao danh");
            System.out.println("0. Thoat");
            System.out.println("--------------------------");
            System.out.print("Moi ban lua chon: ");
            lc = sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 1:
                    ts.nhapDanhSach(sc);
                    break;
                case 2:
                    ts.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap so bao danh can tim: ");
                    int sbd = sc.nextInt();
                    sc.nextLine();
                    ts.timKiemThiSinh(sbd);
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (lc != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
