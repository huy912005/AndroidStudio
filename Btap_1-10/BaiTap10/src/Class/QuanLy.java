package Class;

import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
    private ArrayList<BienLai> ds;

    public QuanLy() {
        ds= new ArrayList<>();
    }
    
    public void themBienLai(BienLai bl){
        ds.add(bl);
    }
    
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap so luong ho dan : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =1;i<=n;i++){
            BienLai bl = new BienLai();
            System.out.println("-------------Nhap bien lai thu "+i+"-----------------");
            bl.nhapThongTin(sc);
            themBienLai(bl);
        }
    }
    
    public void hienThiThongTin(){
        for(BienLai bl : ds){
            System.out.println("--------------------------------");
            bl.hienThiThongTin();
        }   
    }
}
