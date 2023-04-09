package staff;

import java.sql.SQLData;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLuong quanLuong = new QuanLuong();
        int luaChon = 0;
        do {
            System.out.println("MENU");
            System.out.println("1.Them nhan vien"
                    + "2.in danh sach"
                    + "3.xoa nhan vien"
                    + "4.Tim kiem thong tin theo id"
                    + "5.hien tong luong cua ca cong ty"
                    + "6.Hien luong phai tra cho nhan vien pastime"
                    + "7.Xap xep luong dan cua cac nhan vien trong cong ty"
                    + "8.Liet ke danh sach nhan vien fullTime co luong thap hon trung binh cua ca cong ty"
            );
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("chon them nhan vien");
                    System.out.println("a.Nhap vien FullTime"
                            + "b.nhap nhan vien Pastime"
                            + "c.Hien luong phai tra cho nhan vien pastime");
                    String id = scanner.nextLine();
                    switch (id) {
                        case "a":
                            System.out.println("nhap ma nhan vien");
                            String maNhanVien = scanner.nextLine();
                            System.out.println("nhap ho va ten");
                            String name = scanner.nextLine();
                            System.out.println("nhap tuoi");
                            int age = Integer.parseInt(scanner.next());
                            System.out.println("nhap so dien thoai");
                            int number = Integer.parseInt(scanner.next());
                            System.out.println("nhap luong cung");
                            double luongCung = Double.parseDouble(scanner.next());
                            System.out.println("nhap so tien thuong");
                            double tienThuong = Double.parseDouble(scanner.next());
                            System.out.println("nhap so tien phat");
                            double tienPhat = Double.parseDouble(scanner.next());
                            System.out.println("nhap dia chi");
                            String diaChi = scanner.nextLine();
                            System.out.println("nhap email");
                            String email = scanner.nextLine();
                            NhanVienFullTime nhanVienFullTime = new NhanVienFullTime(maNhanVien, name, age, number, email, diaChi, tienThuong, luongCung, tienPhat);
                            quanLuong.add(nhanVienFullTime);
                            break;
                        case "b":
                            System.out.println("nhap ma nhan vien");
                            String maNhanvien = scanner.nextLine();
                            System.out.println("nhap name");
                            String hoVaTen = scanner.nextLine();
                            System.out.println("nhap tuoi");
                            int tuoi = scanner.nextInt();
                            System.out.println("nhap so gio lam");
                            int gio = Integer.parseInt(scanner.next());
                            System.out.println("nhap so dien thoai");
                            int sdt = Integer.parseInt(scanner.next());
                            System.out.println("nhap dia chi");
                            String diachi = scanner.nextLine();
                            System.out.println("nhap email");
                            String Email = scanner.nextLine();
                            NhanVienPartTime nhanVienPartTime = new NhanVienPartTime(maNhanvien, hoVaTen, tuoi, sdt, Email, diachi, gio);
                            quanLuong.add(nhanVienPartTime);
                            System.out.println("luong phai tra cho nhanh vien parttime");
                    }
                case 2:
                    System.out.println("in danh sach ra man hinh");
                    quanLuong.showList();
                    break;
                case 3:
                    System.out.println("nhap mnv ban muon xoa");
                    String Id = scanner.nextLine();
                    quanLuong.xoa(Id);
                    break;
                case 4:
                    System.out.println("nhap mnv ban muon tim kiem");
                    String mvn = scanner.nextLine();
                    quanLuong.timTheoI(mvn);
                    break;
                case 5:
                    System.out.println("tong luong cua ca cong ty");
                    quanLuong.tongLuong();
                case 6:
                    System.out.println("tong luong phai tra cho nhan vien parttime");
                    quanLuong.tongLuongPast();
                case 7:
                    System.out.println();
                case 8:
                    System.out.println("luong nhan vien chinh thap hon luong trung binh");
                    quanLuong.lietKe();
            }


        } while (luaChon != 0);
    }
}
