/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    protected String hoTen314;
    protected  String maSV314;
    protected Date ngaySinh314;
    protected String lop314;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, Date ngaySinh, String lop) {
        this.hoTen314 = hoTen;
        this.maSV314 = maSV;
        this.ngaySinh314 = ngaySinh;
        this.lop314 = lop;
    }
    
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap ho ten : ");
        hoTen314 =sc.nextLine();
        System.out.println("Nhap ma sinh vien : ");
        maSV314 = sc.nextLine();
        System.out.println("Nhap ngay sinh dd/MM/yyyy : ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh314 = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
        }
        System.out.println("Nhap lop : ");
        lop314=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ho ten : "+hoTen314);
        System.out.println("Ma sinh vien : "+maSV314);
        System.out.println("Ngay sinh : "+sdf.format(ngaySinh314));
        System.out.println("Lop : "+lop314);
    }
}
