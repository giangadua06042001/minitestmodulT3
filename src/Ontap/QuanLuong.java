package Ontap;

import java.util.ArrayList;

public class QuanLuong {
    private ArrayList<Staff>staff;

    public QuanLuong() {
    }

    public QuanLuong(ArrayList<Staff> staff) {
        this.staff = staff;
    }
    public void add(Staff staff){
        this.staff.add(staff);
    }
    public void xoa(int id){
            this.staff.remove(id);
    }

}
