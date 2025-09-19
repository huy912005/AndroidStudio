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
public class KhachHang {
//     Họ tên chủ hộ, số nhà, mã số công tơ của hộ dân sử dụng điện.
    protected String tenChuHo314;
    protected int soNha314;
    protected String maSoCongTo314;

    public KhachHang() {
    }

    public KhachHang(String tenChuHo, int soNha, String maSoCongTo) {
        this.tenChuHo314 = tenChuHo;
        this.soNha314 = soNha;
        this.maSoCongTo314 = maSoCongTo;
    }
    
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap ten chu ho : ");
        tenChuHo314 = sc.nextLine();
        System.out.println("Nhap so nha : ");
        soNha314=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ma so cong to : ");
        maSoCongTo314=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        System.out.println("Ten chu ho : "+tenChuHo314);
        System.out.println("So nha : "+soNha314);
        System.out.println("Ma so cong to : "+maSoCongTo314);
    }
}
