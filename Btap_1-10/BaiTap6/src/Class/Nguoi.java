package Class;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
    protected String hoTen314;
    protected Date ngaySinh314;
    protected String soCM314;
    public String getSoCM() {
        return soCM314;
    }
    public Nguoi() {}
    public Nguoi(String hoTen, Date ngaySinh, String soCM) {
        this.hoTen314 = hoTen;
        this.ngaySinh314 = ngaySinh;
        this.soCM314 = soCM;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap ho ten : ");
        hoTen314=sc.nextLine();
        System.out.println("Nhap ngay sinh dd/MM/yyyy : ");
        String ns =sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh314 = sdf.parse(ns);
        } catch (Exception e) {
        }
        System.out.println("Nhap so chung minh : ");
        soCM314 = sc.nextLine();
    }
    public void hienThiThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ho ten : "+hoTen314);
        System.out.println("Ngay sinh : "+sdf.format(ngaySinh314));
        System.out.println("So chung minh : "+soCM314);
    }
}
