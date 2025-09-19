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
public class ThiSinh {
    protected int soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected String uuTien;

    public int getSoBaoDanh() {
        return soBaoDanh;
    }
    
    public ThiSinh() {
    }

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap so bao danh : ");
        soBaoDanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi : ");
        diaChi = sc.nextLine();
        System.out.println("Nhap uu tien : ");
        uuTien = sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("So bao danh : "+soBaoDanh);
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Dia chi : "+diaChi);
        System.out.println("Uu tien : "+uuTien);
    }
}
