package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
    protected String hoTen314;
    protected Date ngaySinh314;
    protected String queQuan314;
    public Nguoi() {
    }
    public Nguoi(String hoTen314, Date ngaySinh314, String queQuan314) {
        this.hoTen314 = hoTen314;
        this.ngaySinh314 = ngaySinh314;
        this.queQuan314 = queQuan314;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap ho ten : ");
        hoTen314=sc.nextLine();
        System.out.println("Nhap ngay sinh dd/MM/yyyy : ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh314 = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
        }
        System.out.println("Nhap que quan : ");
        queQuan314=sc.nextLine();
    }
    public void hienThiThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("HO ten : "+hoTen314);
        System.out.println("Ngay sinh : "+sdf.format(ngaySinh314));
        System.out.println("Que quan : "+queQuan314);
    }
}
