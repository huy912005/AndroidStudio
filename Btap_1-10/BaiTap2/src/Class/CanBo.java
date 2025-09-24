package Class;
import java.util.Scanner;
public class CanBo {
    protected String hoTen314;
    protected String ngaySinh314;
    protected String gioiTinh314;
    protected String diaChi314;
    public String getHoTen314() {
        return hoTen314;
    }
    public CanBo() {
    }
    public CanBo(String hoTen314, String ngaySinh314, String gioiTinh314, String diaChi314) {
        this.hoTen314 = hoTen314;
        this.ngaySinh314 = ngaySinh314;
        this.gioiTinh314 = gioiTinh314;
        this.diaChi314 = diaChi314;
    }
    public void nhapThongTin(Scanner sc){
        sc.nextLine();
        System.out.println("Nhap ho va ten : ");
        hoTen314 =sc.nextLine();
        System.out.println("Nhap ngay sinh dd/MM/yyyy : ");
        ngaySinh314 =sc.nextLine();
        System.out.println("Nhap gioi tinh : ");
        gioiTinh314 =sc.nextLine();
        System.out.println("Nhap dia chi : ");
        diaChi314 =sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("Ho va ten : "+this.hoTen314);
        System.out.println("Ngay sinh : "+this.ngaySinh314);
        System.out.println("Gioi tinh : "+this.gioiTinh314);
        System.out.println("Dia chi : "+this.diaChi314);
    }
}
