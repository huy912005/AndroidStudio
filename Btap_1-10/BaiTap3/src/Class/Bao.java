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
public class Bao extends TaiLieu{
    private String ngayPhatHanh314;

    public Bao() {
    }

    public Bao(String ngayPhatHanh314, String maTaiLieu314, String tenNhaSX314, String soBanPhatHanh314) {
        super(maTaiLieu314, tenNhaSX314, soBanPhatHanh314);
        this.ngayPhatHanh314 = ngayPhatHanh314;
    }
    
    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhap ngay phat hanh dd/MM/yyyy : ");
        ngayPhatHanh314 = sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Ngay phat hanh : "+ngayPhatHanh314);
    }
}
