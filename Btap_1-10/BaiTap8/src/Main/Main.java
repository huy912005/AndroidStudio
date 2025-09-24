package Main;
import Class.QuanLy;
import java.util.Scanner;
public class Main {
    private static void menu() {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        int chon;
        do {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Nhap danh sach can bo giao vien");
            System.out.println("2. Hien thi danh sach can bo giao vien");
            System.out.println("3. In danh sach CBGV co luong >= 8,000,000");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    ql.nhapThongTin(sc);
                    break;
                case 2:
                    ql.hienThiThongTin();
                    break;
                case 3:
                    ql.luongHonBang8Tr();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
    public static void main(String[] args) {
        menu();
    }
}
