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
    private ArrayList<CBGV> ds314;

    public QuanLy() {
        ds314= new ArrayList<>();
    }
    
    public void themCBGV(CBGV cbgv){
        ds314.add(cbgv);
    }
    
    public void nhapThongTin(Scanner sc){
        CBGV cbgv;
        System.out.println("Nhap so luong can bo giao vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1;i<=n;i++){
            cbgv=new CBGV();
            cbgv.nhapThongTin(sc);
            themCBGV(cbgv);
            sc.nextLine();
        }
    }
    
    public void hienThiThongTin(){
        int i=1;
        for(CBGV cbgv : ds314){
            System.out.printf("----------thu %d ------------\n",i);
            cbgv.hienThiThongTin();
            i++;
        }
        if(i==1)
            System.out.println("Danh sach rong!");
    }
    
    public void luongHonBang8Tr(){
        int i=1;
        for(CBGV cbgv : ds314){
            if(cbgv.getLuongThucLinh314()>=8000000){
                System.out.printf("----------thu %d ------------\n",i);
                cbgv.hienThiThongTin();
                i++;
            }
        }
        if(i==1)
            System.out.println("Khong co ai luong >= 8000000");
    }
}
