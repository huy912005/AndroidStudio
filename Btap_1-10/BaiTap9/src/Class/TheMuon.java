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
public class TheMuon extends SinhVien{
    private String soPhieuMuon314;
    private Date ngayMuon314;
    private Date hanTra314;
    private String soHieuSach314;

    public Date getHanTra314() {
        return hanTra314;
    }

    public TheMuon() {
    }

    public TheMuon(String soPhieuMuon314, Date ngayMuon314, Date hanTra314, String soHieuSach314, String hoTen314, String maSV314, Date ngaySinh314, String lop314) {
        super(hoTen314, maSV314, ngaySinh314, lop314);
        this.soPhieuMuon314 = soPhieuMuon314;
        this.ngayMuon314 = ngayMuon314;
        this.hanTra314 = hanTra314;
        this.soHieuSach314 = soHieuSach314;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap so phieu muon : ");
        soPhieuMuon314 = sc.nextLine();
        System.out.println("Nhap ngay muon : ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngayMuon314 = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
        }
        System.out.println("Nhap han tra : ");
        try {
            hanTra314 = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
        }
        System.out.println("Nhap so hieu sach : ");
        soHieuSach314 = sc.nextLine();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("So phieu muon : "+soPhieuMuon314);
        System.out.println("Ngay muon : "+sdf.format(ngayMuon314));
        System.out.println("Han tra : "+sdf.format(hanTra314));
        System.out.println("So hieu sach : "+soHieuSach314);
    }
}
