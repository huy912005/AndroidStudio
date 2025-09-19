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
public class KySu extends CanBo{
    private String nganhDaoTao314;

    public KySu() {
    }

    public KySu(String nganhDaoTao314, String hoTen314, String ngaySinh314, String gioiTinh314, String diaChi314) {
        super(hoTen314, ngaySinh314, gioiTinh314, diaChi314);
        this.nganhDaoTao314 = nganhDaoTao314;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap nganh dao tao : ");
        nganhDaoTao314 = sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Cong viec : "+this.nganhDaoTao314);
    }
}
