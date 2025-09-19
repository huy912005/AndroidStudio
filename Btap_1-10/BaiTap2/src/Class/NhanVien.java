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
public class NhanVien extends CanBo{
    private String congViec314;

    public NhanVien() {
    }
    
    public NhanVien(String congViec314, String hoTen314, String ngaySinh314, String gioiTinh314, String diaChi314) {
        super(hoTen314, ngaySinh314, gioiTinh314, diaChi314);
        this.congViec314 = congViec314;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap cong viec : ");
        congViec314 = sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Cong viec : "+this.congViec314);
    }
}
