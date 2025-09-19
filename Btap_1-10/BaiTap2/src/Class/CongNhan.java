/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CongNhan extends CanBo{
    private String bac314;

    public CongNhan() {
    }

    public CongNhan(String bac314, String hoTen314, String ngaySinh314, String gioiTinh314, String diaChi314) {
        super(hoTen314, ngaySinh314, gioiTinh314, diaChi314);
        this.bac314 = bac314;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap bac : ");
        bac314 = sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Bac : "+this.bac314);
    }
}
