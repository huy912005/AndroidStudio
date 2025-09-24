package Class;
import java.util.Scanner;
public class ThiSinh {
    protected int soBaoDanh314;
    protected String hoTen314;
    protected String diaChi314;
    protected String uuTien314;
    public int getSoBaoDanh() {
        return soBaoDanh314;
    }
    public ThiSinh() {
    }
    public ThiSinh(int soBaoDanh314, String hoTen314, String diaChi314, String uuTien314) {
        this.soBaoDanh314 = soBaoDanh314;
        this.hoTen314 = hoTen314;
        this.diaChi314 = diaChi314;
        this.uuTien314 = uuTien314;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhap so bao danh : ");
        soBaoDanh314 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten : ");
        hoTen314 = sc.nextLine();
        System.out.println("Nhap dia chi : ");
        diaChi314 = sc.nextLine();
        System.out.println("Nhap uu tien : ");
        uuTien314 = sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("So bao danh : "+soBaoDanh314);
        System.out.println("Ho ten : "+hoTen314);
        System.out.println("Dia chi : "+diaChi314);
        System.out.println("Uu tien : "+uuTien314);
    }
}
