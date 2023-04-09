package Stundent;

import java.util.ArrayList;

public class DanhSachSinhVien  {
    private ArrayList<SinhVien>listStudent;

    public DanhSachSinhVien(ArrayList<SinhVien> listStudent) {
        this.listStudent = listStudent;
    }

    public DanhSachSinhVien() {
        this.listStudent=new ArrayList<SinhVien>();
    }
    public void add(SinhVien student){
        this.listStudent.add(student);
    }
    public void showList(){
        for (SinhVien sinhVien :listStudent) {
            System.out.println(sinhVien);

        }
    }
    public boolean kiemTraDanhSach(){
        return this.listStudent.isEmpty();
    }
    public int layraSoluong(){
        return this.listStudent.size();
    }
    public void lamRongDanhSachSv(){
        this.listStudent.removeAll(listStudent);
    }
    public boolean kiemTra(SinhVien sinhVien){
        return  this.listStudent.contains(sinhVien);
    }
    public boolean xoaSinhVien(String name){
        return this.listStudent.remove(name);
    }
    public void timKiemSinhVien(String name) {
        for (SinhVien sinhVien : listStudent) {
            if (sinhVien.name().indexOf(name) >= 0) {
                System.out.println(sinhVien);
            }
        }

    }



}
