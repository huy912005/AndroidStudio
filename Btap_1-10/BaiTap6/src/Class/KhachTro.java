package Class;
import java.util.Date;
import java.util.Scanner;
public class KhachTro extends Nguoi{
    private int soNgayTro314;
    private String loaiTro314;
    private double giaTro314;
    public int getSoNgayTro() {
        return soNgayTro314;
    }
    public double getGiaTro() {
        return giaTro314;
    }
    public KhachTro() {}
    public KhachTro(int soNgayTro314, String loaiTro314, double giaTro314, String hoTen, Date ngaySinh, String soCM) {
        super(hoTen, ngaySinh, soCM);
        this.soNgayTro314 = soNgayTro314;
        this.loaiTro314 = loaiTro314;
        this.giaTro314 = giaTro314;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap so ngay tro : ");
        soNgayTro314 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap loai tro : ");
        loaiTro314=sc.nextLine();
        System.out.println("Nhap gia tro : ");
        giaTro314= sc.nextDouble();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("So ngay tro : "+soNgayTro314);
        System.out.println("Loai tro : "+loaiTro314);
        System.out.println("Gia tro : "+giaTro314);
    }
}
