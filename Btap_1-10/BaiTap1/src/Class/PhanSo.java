package Class;
import java.util.Scanner;
public class PhanSo {
    private int tuSo314;
    private int mauSo314;
    public int getTuSo() {
        return tuSo314;
    }
    public int getMauSo() {
        return mauSo314;
    }
    public PhanSo() {
    }
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo314 = tuSo;
        this.mauSo314 = mauSo;
    }
    public void NhapPS(Scanner sc){
        sc=new Scanner(System.in);
        System.out.println("Nhap vao tu so : ");
        tuSo314 = sc.nextInt();
        do{
            System.out.println("Nhap vao mau so : ");
            mauSo314 = sc.nextInt();
            if(mauSo314==0)
                System.out.println("Mau so phai khac 0. Vui long nhap lai!");
        }while(mauSo314==0);
    }
    public void XuatPS(){
        System.out.println(+tuSo314+"/"+mauSo314);
    }
    public PhanSo congPhanSo(PhanSo ps1){
        int tuSokq = tuSo314*ps1.mauSo314 + mauSo314*ps1.tuSo314;
        int mauSokq = mauSo314*ps1.mauSo314;
        return new PhanSo(tuSokq,mauSokq);
    }
    public PhanSo truPhanSo(PhanSo ps1){
        int tuSokq = tuSo314*ps1.mauSo314 - mauSo314*ps1.tuSo314;
        int mauSokq = tuSo314*mauSo314;
        return new PhanSo(tuSokq,mauSokq);
    }
    public PhanSo nhanPhanSo(PhanSo ps1){
        int tuSokq = tuSo314*ps1.tuSo314;
        int mauSokq = mauSo314*ps1.mauSo314;
        return new PhanSo(tuSokq,mauSokq);
    }
    public PhanSo chiaPhanSo(PhanSo ps1){
        int tuSokq = tuSo314*ps1.mauSo314;
        int mauSokq = mauSo314*ps1.tuSo314;
        return new PhanSo(tuSokq,mauSokq);
    }
    public boolean kTraToiGian(){
        if(tuSo314/UCLN(tuSo314, mauSo314)==0 && mauSo314/UCLN(tuSo314, mauSo314)==0)
            return false;
        return true;
    }
    public PhanSo PSTG(){
        int a= tuSo314/UCLN(tuSo314, mauSo314);
        int b=mauSo314/UCLN(tuSo314, mauSo314);
        return new PhanSo(a,b);
    }
    public int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
