package testMain;

import Stundent.DanhSachSinhVien;
import Stundent.SinhVien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       DanhSachSinhVien dssv=new DanhSachSinhVien();
        int luaChon=0;
        do {
            System.out.println("MENU");
            System.out.println("1.them sanh sach sinh vien.\n"
                    +"2.In danh sach sinh vien.\n"
                    +"3.Kiem tra danh sach sinh vien.\n"
                    +"4.lay ra so luong sinh vien von .\n"
                    +"5.lam rong danh sach sinh vien.\n"
                    +"6.kiem tra mot sinh  vien co ton tai khong dua vao ma sinh vien.\n"
                    +"7.xoa mot  sinh vien dua tren id.\n"
                    +"8.Tim kiem tat ca cac sinh vien dua theo ten.\n"
                    +"9.xuat ra danh sach cac sinh co diem tu thap den cao.\n"
                    +"0.Thoat khoi chuong trinh");
            luaChon=scanner.nextInt();
            scanner.nextLine();
            if(luaChon==1){
                System.out.println("nhap ma sinh vien ");
                String id=scanner.nextLine();
                System.out.println("nhap ho va ten");
                String name=scanner.nextLine();
                System.out.println("nhap tuoi");
                int age=scanner.nextInt();
                System.out.println("nhap diem");
                double diem=scanner.nextDouble();
                SinhVien student1=new SinhVien(id,name,age,diem);
              dssv.add(student1);
            }
           else if(luaChon==2){
                System.out.println("in danh sach sinh vien");
                dssv.showList();
            }
           else if(luaChon==3){
                System.out.println("lam rong danh sach sinh vien");
                dssv.lamRongDanhSachSv();
            }
           else if(luaChon ==4){
               System.out.println("lay ra so luong sinh vien");
               dssv.layraSoluong();
            }
           else if(luaChon==5){
               System.out.println("kiem tra xem danh sach co rong khong");
               dssv.kiemTraDanhSach();
            }
           else if(luaChon==6){
               System.out.println("kiem tra su ton tai cua em");
               String name=scanner.nextLine();
              SinhVien sinhVien=new SinhVien(name);
              dssv.kiemTra(sinhVien);
            }
           else if(luaChon==7){
             System.out.println("nhap ma sinh vien");
             String id=scanner.nextLine();
             dssv.xoaSinhVien(id);
            }
           else if(luaChon==8){
               System.out.println("tim kiem theo ten");
               String name=scanner.nextLine();
               dssv.timKiemSinhVien(name);
            }

        }while (luaChon!=0);
    }
}
