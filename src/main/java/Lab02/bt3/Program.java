/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int chon = 5;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========CHUONG TRINH QUAN LI SINH VIEN========");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Xuat danh sach sinh vien");
            System.out.println("3.Xuat danh sach sinh vien hoc luc gioi");
            System.out.println("4.Sap xep danh sach sinh vien theo diem");
            System.out.println("5.Ket thuc");
            System.out.println("----------------------------------------------");
            System.out.print("Ban chon (1->5)");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    xuatSVGioi();
                    break;
                case 5:
                    System.out.println("Goodbye. See you again");
                    break;
            }
        } while (chon != 5);
    }

    private static void nhapDS() {
        String tieptuc = "v";
        do {
            SinhVien sv = null;
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Thuc hien nhap danh sach sinh vien");
            int chon = 0;
            System.out.println("Cho biet loai SV{IT:1, Biz:2} :");
            chon = sc1.nextInt();
            if (chon == 1) {
                System.out.print("Ho Ten:");
                String hoten = sc2.nextLine();
                System.out.print("Diem Java:");
                double java = sc1.nextDouble();
                System.out.print("Diem Css:");
                double css = sc1.nextDouble();
                System.out.print("Diem Html:");
                double html = sc1.nextDouble();

                sv = new SinhVienIT(hoten, java, css, html);
            } else if (chon == 2) {
                System.out.print("Ho Ten:");
                String hoten = sc2.nextLine();
                System.out.print("Diem Marketing:");
                double diemMarketing = sc1.nextDouble();
                System.out.print("Diem Sales:");
                double diemSales = sc1.nextDouble();
                sv=new SinhVienBiz(hoten,diemMarketing,diemSales);
            }
            if (sv != null) {
                ds.add(sv);
            }
            System.out.println("Co tiep tuc khong? (y/n):");
            tieptuc = sc2.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }

    private static void xuatDS() {
        System.out.println("Thuc hien xuat danh sach");
        for (SinhVien sv : ds) {
            sv.xuat();
        }
    }
    private static void xuatSVGioi(){
        System.out.println("Danh sach sinh vien gioi");
        for(SinhVien sv:ds){
            if(sv.getDiem()<9 && sv.getDiem()>=7.5){
                sv.xuat();
            }
        }
    }
}
