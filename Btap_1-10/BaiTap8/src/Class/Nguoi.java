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
public class Nguoi {
    protected String hoTen314;
    protected Date ngaySinh314;
    protected String queQuan314;

    public Nguoi() {
    }

    public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
        this.hoTen314 = hoTen;
        this.ngaySinh314 = ngaySinh;
        this.queQuan314 = queQuan;
    }
    
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap ho ten : ");
        hoTen314=sc.nextLine();
        System.out.println("Nhap ngay sinh dd/MM/yyyy : ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh314 = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
        }
        System.out.println("Nhap que quan : ");
        queQuan314=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("HO ten : "+hoTen314);
        System.out.println("Ngay sinh : "+sdf.format(ngaySinh314));
        System.out.println("Que quan : "+queQuan314);
    }
}
