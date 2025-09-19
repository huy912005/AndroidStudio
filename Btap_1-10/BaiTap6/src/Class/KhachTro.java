/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KhachTro extends Nguoi{
     private int soNgayTro;
    private String loaiTro;
    private double giaTro;

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public double getGiaTro() {
        return giaTro;
    }
    
    public KhachTro() {
    }

    public KhachTro(int soNgayTro, String loaiTro, double giaTro, String hoTen, Date ngaySinh, String soCM) {
        super(hoTen, ngaySinh, soCM);
        this.soNgayTro = soNgayTro;
        this.loaiTro = loaiTro;
        this.giaTro = giaTro;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap so ngay tro : ");
        soNgayTro = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap loai tro : ");
        loaiTro=sc.nextLine();
        System.out.println("Nhap gia tro : ");
        giaTro= sc.nextDouble();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("So ngay tro : "+soNgayTro);
        System.out.println("Loai tro : "+loaiTro);
        System.out.println("Gia tro : "+giaTro);
    }
}
