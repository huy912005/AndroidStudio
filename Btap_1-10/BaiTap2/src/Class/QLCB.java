/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLCB {
    private ArrayList<CanBo> dscb;

    public QLCB() {
        dscb= new ArrayList<>();
    }
    public void themCanBo(CanBo cb){
        dscb.add(cb);
    }
    public void nhapDanhSach(Scanner sc){
        CanBo cb ;
        System.out.println("Nhap so luong can bo : ");
        int sl = sc.nextInt();
        for(int i = 0;i<sl;i++){
            System.out.println("Nhap can bo thu : "+i+1);
            System.out.println("----------Nhap-----------");
            System.out.println("\t1.Nhan vien");
            System.out.println("\t2.Ky su");
            System.out.println("\t3.Cong nhan");
            System.out.println("-------------------------");
            int lc = sc.nextInt();
            cb= new CanBo();
            switch (lc) {
                case 1:
                    cb = new NhanVien();
                    break;
                case 2:
                    cb = new KySu();
                    break;
                case 3:
                    cb = new CongNhan();
                    break;
                default:
                    System.out.println("Vui long nhap 1-3");
            }
            cb.nhapThongTin(sc);
            themCanBo(cb);
        }
    }
    public void timKiemCanBo(String hoten){
        for(CanBo cb : dscb){
            if(hoten.equals(cb.getHoTen314()))
            {
                cb.hienThiThongTin();
            }
        }
    }
    public void hienThiDscb(){
        for(CanBo cb : dscb){
            System.out.println("-------------------------");
            cb.hienThiThongTin();
        }
    }
}
