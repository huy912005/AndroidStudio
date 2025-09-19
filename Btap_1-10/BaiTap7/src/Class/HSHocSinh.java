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
public class HSHocSinh {
    private ArrayList<HocSinh> ds314;

    public HSHocSinh() {
        ds314= new ArrayList<>();
    }
    
    public void themThongTin(HocSinh hs){
        ds314.add(hs);
    }
    
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap so luong sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =1;i<=n;i++){
            System.out.println("Nhap sinh vien thu : "+i);
            HocSinh hs = new HocSinh();
            hs.nhapThongTin(sc);
            themThongTin(hs);
        }
    }
    
    public void hienThiSN85VaThaiNguyen(){
        for(HocSinh hs : ds314){
            if(hs.getNgaySinh314().getYear()+1900-1985>=0 && hs.getQueQuan314().toUpperCase().endsWith("THAI NGUYEN"))
                hs.hienThiThongTin();
        }
    }
    
    public void hienThi10A1(){
        for(HocSinh hs : ds314){
            if(hs.getLop().equals("10A1"))
                hs.hienThiThongTin();
        }
    }
}
