package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySach {
    private ArrayList<TaiLieu> qls314;
    public QuanLySach() {
        qls314 = new ArrayList<>();
    }
    public void themThongTin(TaiLieu tl){
        qls314.add(tl);
    }
    public void nhapThongTin(Scanner sc){
        TaiLieu tl = new TaiLieu();
        System.out.println("----------Nhap----------");
        System.out.println("\t1.Sach");
        System.out.println("\t2.Tap chi");
        System.out.println("\t3.Bao");
        System.out.println("------------------------");
        System.out.println("Xin moi nhap : ");
        int nhap = sc.nextInt();
        sc.nextLine();
        switch (nhap) {
            case 1:
                tl = new Sach();
                tl.nhapThongTin(sc);
                break;
            case 2:
                tl=new TapChi();
                tl.nhapThongTin(sc);
                break;
            case 3:
                tl= new Bao();
                tl.nhapThongTin(sc);
                break;
            default:
                System.out.println("Vui long nhap 1-3!");
        }
        themThongTin(tl);
    }
    public void timKiem(String maTaiLieu){
        int dem=0;
        for(TaiLieu tl : qls314){
            if(maTaiLieu.equals(tl.maTaiLieu314))
                tl.hienThiThongTin();
            else
                dem++;
        }
        if(dem!=0)
            System.out.println("Khong tim thay thong tin!");
    }
}
