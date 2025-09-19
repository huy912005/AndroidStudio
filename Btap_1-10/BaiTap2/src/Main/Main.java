/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.Scanner;
import Class.QLCB;


/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static void menu(){
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        int lc;
        do{
            System.out.println("----------Nhap-----------");
            System.out.println("\t1.Nhap danh sach can bo");
            System.out.println("\t2.Tim kiem");
            System.out.println("\t3.Hien thi danh sach can bo");
            System.out.println("\t0.Thoat");
            System.out.println("-------------------------");
            System.out.println("Xin moi lua chon : ");
            lc = sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 1:
                    qlcb.nhapDanhSach(sc);
                    break;
                case 2:
                    System.out.print("Nhap ho ten can tim kiem : ");
                    String hoTen = sc.nextLine();
                    qlcb.timKiemCanBo(hoTen);
                    break;
                case 3:
                    qlcb.hienThiDscb();
                    break;
                default:
                    System.out.println("Xin chao va hen gap lai!");
            }
        }while(lc!=0);
    }
    public static void main(String[] args) {
        menu();
    }
    
}
