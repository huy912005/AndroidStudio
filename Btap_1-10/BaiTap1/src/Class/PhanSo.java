package Class;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    public static Scanner sc;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // Nhap phan so
    public void NhapPS(){
        sc=new Scanner(System.in);
        System.out.println("Nhap vao tu so : ");
        tuSo = sc.nextInt();
        do{
            System.out.println("Nhap vao mau so : ");
            mauSo = sc.nextInt();
            if(mauSo==0)
                System.out.println("Mau so phai khac 0. Vui long nhap lai!");
        }while(mauSo==0);
    }

    // Xuat phan so
    public void XuatPS(){
        System.out.println(+tuSo+"/"+mauSo);
    }

    // Cong phan so
    public PhanSo congPhanSo(PhanSo ps1){
        int tuSokq = tuSo*ps1.mauSo + mauSo*ps1.tuSo;
        int mauSokq = mauSo*ps1.mauSo;
        return new PhanSo(tuSokq,mauSokq);
    }
    
    //Tru phan so
    public PhanSo truPhanSo(PhanSo ps1){
        int tuSokq = tuSo*ps1.mauSo - mauSo*ps1.tuSo;
        int mauSokq = tuSo*mauSo;
        return new PhanSo(tuSokq,mauSokq);
    }

    //Nhan phan so
    public PhanSo nhanPhanSo(PhanSo ps1){
        int tuSokq = tuSo*ps1.tuSo;
        int mauSokq = mauSo*ps1.mauSo;
        return new PhanSo(tuSokq,mauSokq);
    }

    //Chia phan so
    public PhanSo chiaPhanSo(PhanSo ps1){
        int tuSokq = tuSo*ps1.mauSo;
        int mauSokq = mauSo*ps1.tuSo;
        return new PhanSo(tuSokq,mauSokq);
    }

    // Kiem tra toi gian
    public boolean kTraToiGian(){
        if(tuSo/UCLN(tuSo, mauSo)==0 && mauSo/UCLN(tuSo, mauSo)==0)
            return false;
        return true;
    }

    //Phan so toi gian 
    public PhanSo PSTG(){
        int a= tuSo/UCLN(tuSo, mauSo);
        int b=mauSo/UCLN(tuSo, mauSo);
        return new PhanSo(a,b);
    }

    //Uoc chung lon nhat
    public int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
