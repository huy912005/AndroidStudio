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
public class Sach extends TaiLieu{
    private String tenTacGia314;
    private int soTrang314;

    public Sach() {
    }

    public Sach(String tenTacGia314, int soTrang314, String maTaiLieu314, String tenNhaSX314, String soBanPhatHanh314) {
        super(maTaiLieu314, tenNhaSX314, soBanPhatHanh314);
        this.tenTacGia314 = tenTacGia314;
        this.soTrang314 = soTrang314;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhap ten tac gia : ");
        tenTacGia314 = sc.nextLine();
        System.out.print("Nhap so trang : ");
        soTrang314 = sc.nextInt();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Ten tac gia : "+tenTacGia314);
        System.out.println("So trang : "+soTrang314);
    }
}
