package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
    private ArrayList<Product> products = new ArrayList<>();

    public Manager() {
        this.products = new ArrayList<Product>();
    }

    public Manager(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void showList() {
        for (Product product1 : products) {
            System.out.println(product1);
        }
    }

    public void timTheoTen(String name) {
        for (Product product : products) {
            if (product.name().indexOf(name) >= 0) ;
            System.out.println(product);

        }
    }

    public void xoa(int id) {
        int cuont = 0;
        {
            for (Product product : products) {
                if (product.id() == id) {
                    products.remove(cuont);
                    return;

                }
                cuont++;
            }
        }
    }

    public  void sapXep() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {

                if (o1.price() < o2.price()) {
                    return 1;
                } else if (o1.price() == o2.price()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }
        public void sua ( int id){
            int index = 0;
            for (Product product : products) {
                if (product.id() == id) {
                    index = products.indexOf(product);
                }

            }
            products.set(index, index());
        }
        public double tong () {
            double tong = 0;
            for (Product pt : products) {
                tong += pt.price();
            }
            return tong;

        }
        public Product index () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap ten ");
            String name = scanner.nextLine();
            System.out.println("nhap gia cua san pham");
            double price = scanner.nextDouble();
            System.out.println("nhap can nang");
            double weight = scanner.nextDouble();
            System.out.println("nhap id");
            int id = scanner.nextInt();
            Product product = new Product(name, price, weight, id);
            return product;
        }


    }


