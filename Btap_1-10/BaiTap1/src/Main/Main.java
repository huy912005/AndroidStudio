/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Class.PhanSo;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void Menu(){
        Scanner sc = new Scanner(System.in);
        int lc;
        PhanSo ps1= new PhanSo();
        PhanSo ps2= new PhanSo();
        PhanSo PsTinh= new PhanSo();
        do{
            System.out.println("-------------------------------");
            System.out.println("\t 1.Nhap 2 phan so");
            System.out.println("\t 2.Xuat phan so");
            System.out.println("\t 3.Cong hai phan so");
            System.out.println("\t 4.Tru hai phan so");
            System.out.println("\t 5.Nhan hai phan so");
            System.out.println("\t 6.Chia hai phan so");
            System.out.println("\t 7.Kiem tra phan so toi gian");
            System.out.println("\t 8.Tim dang toi gian cua phan so");
            System.out.println("\t 9.Uoc chung lon nhat");
            System.out.println("\t 0.Thoat");
            System.out.println("-------------------------------");
            System.out.println("Xin moi ban lua chon : ");
            lc = sc.nextInt();
            switch (lc) {
                case 1:
                    System.out.println("Xin moi nhap vao phan so thu nhat : ");
                    ps1.NhapPS(sc);
                    System.out.println("Xin moi nhap vao phan so thu hai : ");
                    ps2.NhapPS(sc);
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    System.out.println("\t 1.Phan so 1");
                    System.out.println("\t 2.Phan so 2");
                    System.out.println("\t 3.Ca hai phan so");
                    System.out.println("-------------------------------");
                    System.out.println("Xin moi ban lua chon : ");
                    lc=sc.nextInt();
                    switch (lc) {
                        case 1:
                            if(ps1.getMauSo()==0)
                                System.out.println("Ban phai nhap truoc khi xuat!");
                            else{
                                System.out.print("Phan so 1 la : ");
                                ps1.XuatPS();
                            }
                            break;
                        case 2:
                            if(ps2.getMauSo()==0)
                                System.out.println("Ban phai nhap truoc khi xuat!");
                            else{
                                System.out.print("Phan so 2 la : ");
                                ps2.XuatPS();
                            }
                            break;
                        case 3:
                            if(ps1.getMauSo()==0 && ps2.getMauSo()==0)
                                System.out.println("Ban phai nhap vao 2 phan so!");
                            else{
                                System.out.print("Phan so 1 la : ");
                                ps1.XuatPS();
                                System.out.print("Phan so 2 la : ");
                                ps2.XuatPS();
                            }
                            break;
                        default:
                            System.out.println("Phai nhap 1 - 3");
                    }
                    break;
                case 3:
                    if(ps1.getMauSo()==0 && ps2.getMauSo()==0)
                        System.out.println("Ban phai nhap vao 2 phan so!");
                    else{
                        System.out.println("Cong hai phan so la : ");
                        PsTinh=ps1.congPhanSo(ps2);
                        PsTinh.XuatPS();
                    }
                    break;
                case 4:
                    if(ps1.getMauSo()==0 && ps2.getMauSo()==0)
                        System.out.println("Ban phai nhap vao 2 phan so!");
                    else{
                        System.out.println("Tru hai phan so la : ");
                        PsTinh=ps1.truPhanSo(ps2);
                        PsTinh.XuatPS();
                    }
                    break;
                case 5:
                    if(ps1.getMauSo()==0 && ps2.getMauSo()==0)
                        System.out.println("Ban phai nhap vao 2 phan so!");
                    else{
                        System.out.println("Nhan hai phan so la : ");
                        PsTinh=ps1.nhanPhanSo(ps2);
                        PsTinh.XuatPS();
                    }
                    break;
                case 6:
                    if(ps1.getMauSo()==0 && ps2.getMauSo()==0)
                        System.out.println("Ban phai nhap vao 2 phan so!");
                    else{
                        System.out.println("Chia hai phan so la : ");
                        PsTinh=ps1.chiaPhanSo(ps2);
                        PsTinh.XuatPS();
                    }
                    break;
                case 7:
                    if(ps1.getMauSo()==0 && ps2.getMauSo()==0)
                        System.out.println("Ban phai nhap vao 2 phan so!");
                    else{
                        if(ps1.kTraToiGian()==true)
                            System.out.println("Phan so 1 toi gian");
                        else
                            System.out.println("Phan so 1 khong toi gian");
                        if(ps2.kTraToiGian()==true)
                            System.out.println("Phan so 2 toi gian");
                        else
                            System.out.println("Phan so 2 khong toi gian");
                    }
                    break;
                case 8:
                    if(ps1.getMauSo()==0 && ps2.getMauSo()==0)
                        System.out.println("Ban phai nhap vao 2 phan so!");
                    else{
                        System.out.println("Dang toi dang cua phan so 1 : ");
                        PsTinh=ps1.PSTG();
                        PsTinh.XuatPS();
                        System.out.println("Dang toi dang cua phan so 2 : ");
                        PsTinh=ps2.PSTG();
                        PsTinh.XuatPS();
                    }
                    break;
                case 9:
                    System.out.println("Nhap so thu nhat : ");
                    int a= sc.nextInt();
                    System.out.println("Nhap so thu hai : ");
                    int b= sc.nextInt();
                    System.out.printf("Uoc so chung lon nhat cua %d va %d la : %d\n",a,b,ps1.UCLN(a, b));
                    break;
                default:
                    System.out.println("Ban phai nhap 0-9");
            }
        }while(lc!=0);
    }
    public static void main(String[] args) {
        Menu();
    }
}
