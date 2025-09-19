/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Class.QuanLySach;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();
        int nhap;
        do{
            System.out.println("----------Nhap----------");
            System.out.println("1.Nhap thong tin tai lieu");
            System.out.println("2.Tim kiem tai lieu");
            System.out.println("0.Thoat");
            System.out.println("------------------------");
            System.out.print("Xin moi nhap : ");
            nhap = sc.nextInt();
            sc.nextLine();
            switch (nhap) {
                case 1:
                    qls.nhapThongTin(sc);
                    break;
                case 2:
                    System.out.println("Nhap ma tai lieu : ");
                    String maTaiLieu = sc.nextLine();
                    qls.timKiem(maTaiLieu);
                    break;
                default:
                    System.out.println("Xin chao va hen gap lai!");
            }
        }while(nhap!=0);
    }
    public static void main(String[] args) {
        menu();
    }
    
}
