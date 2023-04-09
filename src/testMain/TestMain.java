package testMain;

import arraylist.Manager;
import arraylist.Product;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager pt = new Manager();
        String luachon;
        do {
            System.out.println("MENU");
            System.out.println("1.Them danh sach san pham.\n" +
                    "2.Hien thi danh sach.\n"
                    + "3.tim kiem theo ten.\n"
                    + "4.Xoa theo id.\n"
                    + "5.sua san pham theo id.\n"
                    + "6.Sap xep theo danh sach.\n"
                    +"7.Tinh gia tong sam pham.\n"
                    + "0.thoat khoi chuong trinh");
            ;

            luachon = scanner.next();
            System.out.println(luachon);
            if (luachon.equals("1")) {
                System.out.println("nhap ten san pham");
                String name = scanner.next();
                System.out.println("nhap gia san pham");
                double price = scanner.nextDouble();
                System.out.println("nhap can nang ");
                double weght = scanner.nextDouble();
                System.out.println("nhap id cua san pham");
                int id = Integer.parseInt(scanner.next());
                Product products = new Product(name, price, weght, id);
                pt.add(products);

            } else if (luachon.equals("2")) {
                pt.showList();
            } else if (luachon.equals("3")) {
                System.out.println("nhap ten san pham");
                String name = scanner.next();
                pt.timTheoTen(name);
            } else if (luachon.equals("4")) {
                System.out.println("nhap id ban muon xoa");
                int  id = Integer.parseInt(scanner.next());
                pt.xoa(id);
            } else if (luachon.equals("5")) {
                System.out.println("nhap id muon sua");
                int id = scanner.nextInt();
                pt.sua(id);
            }else if(luachon.equals("6")) {
                System.out.println("sap xep thu tu giam dan");
               pt.sapXep();
               System.out.println(Arrays.toString(new Manager[]{pt}));
            }
            else if(luachon.equals("7")){
               System.out.println("tong san pham"+ pt.tong());
            }

        } while (luachon.equals("0"));


    }
}
