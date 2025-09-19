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

    public String getHoTen314() {
        return hoTen314;
    }

    public Date getNgaySinh314() {
        return ngaySinh314;
    }

    public String getQueQuan314() {
        return queQuan314;
    }
    
    public Nguoi() {
    }

    public Nguoi(String hoTen314, Date ngaySinh314, String queQuan314) {
        this.hoTen314 = hoTen314;
        this.ngaySinh314 = ngaySinh314;
        this.queQuan314 = queQuan314;
    }
    
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen314 = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ns = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh314 = sdf.parse(ns);
        } catch (ParseException e) {
        } 
        System.out.print("Nhap que quan: ");
        queQuan314 = sc.nextLine();
    }

    public void hienThiThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ho ten: " + hoTen314);
        System.out.println("Ngay sinh: " + sdf.format(ngaySinh314));
        System.out.println("Que quan: " + queQuan314);
    }
}
