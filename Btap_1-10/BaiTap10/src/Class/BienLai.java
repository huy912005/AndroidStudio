package Class;

import java.util.Scanner;

public class BienLai extends KhachHang{
    private int chiSoCu314;
    private int chiSoMoi314;
    private double soTienPhaiTra314;

    public BienLai() {
    }

    public BienLai(int chiSoCu, int chiSoMoi, double soTienPhaiTra, String tenChuHo, int soNha, String maSoCongTo) {
        super(tenChuHo, soNha, maSoCongTo);
        this.chiSoCu314 = chiSoCu;
        this.chiSoMoi314 = chiSoMoi;
        this.soTienPhaiTra314 = soTienPhaiTra;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("Nhap chi so cu : ");
        chiSoCu314=sc.nextInt();
        System.out.println("Nhap chi so moi : ");
        chiSoMoi314=sc.nextInt();
        soTienPhaiTra314 =(chiSoMoi314-chiSoCu314)*750;
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Chi so cu : "+chiSoCu314);
        System.out.println("Chi so moi : "+chiSoMoi314);
        System.out.println("So tien phai tra: "+soTienPhaiTra314);
    }
}
