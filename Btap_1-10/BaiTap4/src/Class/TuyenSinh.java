package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class TuyenSinh {
    private ArrayList<ThiSinh> dsts;
    public TuyenSinh() {
        dsts = new ArrayList<>();
    }
    public void themThiSinh(ThiSinh ts) {
        dsts.add(ts);
    }
    public void nhapDanhSach(Scanner sc) {
        ThiSinh ts;
        int chon;
        System.out.print("Nhap vao so luong thi sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("------ Chon khoi thi ------");
            System.out.println("\t1. Khoi A");
            System.out.println("\t2. Khoi B");
            System.out.println("\t3. Khoi C");
            System.out.println("---------------------------");
            System.out.print("Moi ban chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ts = new KhoiA();
                    break;
                case 2:
                    ts = new KhoiB();
                    break;
                case 3:
                    ts = new KhoiC();
                    break;
                default:
                    ts = new KhoiA();
                    break;
            }
            ts.nhapThongTin(sc);
            themThiSinh(ts);
        }
    }
    public void hienThiDanhSach() {
        int i=1;
        for(ThiSinh ts : dsts){
            System.out.println("-----Thi sinh thu : "+i+"-----");
            ts.hienThiThongTin();
            i++;
        }
        if(i==1)
            System.out.println("Danh sach rong!");
    }
    public void timKiemThiSinh(int soBaoDanh) {
        for (ThiSinh ts : dsts) {
            if (ts.getSoBaoDanh()== soBaoDanh) {
                ts.hienThiThongTin();
            }
        }
    }
}
