package staff;

import java.util.*;

public class QuanLuong {
    private ArrayList<NhanVien> nhanViens;

    public QuanLuong(ArrayList<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public QuanLuong() {
        this.nhanViens = new ArrayList<NhanVien>();
    }

    public void add(NhanVien nhanVien) {

        this.nhanViens.add(nhanVien);
    }

    public double tongLuong() {
        double sum = 0;
        for (NhanVien vn : nhanViens) {
            sum += vn.tinhLuong();
        }
        return sum;
    }

    public double tb() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            total = tongLuong() / this.nhanViens.size();
        }
        return total;
    }

    public void lietKe() {
        for (NhanVien nv : nhanViens) {
            NhanVienFullTime nhanVienFullTime = nv instanceof NhanVienFullTime ? ((NhanVienFullTime) nv) : null;
            if (nhanVienFullTime.tinhLuong() < tb()) {
                System.out.println(nhanVienFullTime);
            }

        }

    }

    public double tongLuongPast() {
        double total = 0;
        for (NhanVien nv : nhanViens) {
            NhanVienPartTime nhanVienPartTime = nv instanceof NhanVienPartTime ? ((NhanVienPartTime) nv) : null;
            total += nhanVienPartTime.tinhLuong();

        }
        return total;
    }

    public void sapXep() {
        for (NhanVien nv : nhanViens) {
            NhanVienFullTime nhanVienFullTime = nv instanceof NhanVienFullTime ? ((NhanVienFullTime) nv) : null;
            Collections.sort(this.nhanViens, new Comparator<NhanVien>() {

                @Override
                public int compare(NhanVien o1, NhanVien o2) {
                    return 0;
                }
            });
        }
    }


    public void timTheoI(String id) {
        for (NhanVien nv : nhanViens) {
            if (nv.maNhanVien().indexOf(id) >= 0) ;
            System.out.println(nv);

        }

    }


    public void xoa(String id) {
        int count = 0;
        {
            for (NhanVien nv : nhanViens) {
                if (id == nv.maNhanVien()) {
                    nhanViens.remove(count);
                    return;
                }
                count++;
            }
        }
    }

    public void showList() {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv);
        }
    }


}
