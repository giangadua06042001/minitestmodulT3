package staff;

public class NhanVienPartTime extends NhanVien{
    private double gio;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String maNhanVien, String name, int age, int number, String email, String diaChi, double gio) {
        super(maNhanVien, name, age, number, email, diaChi);
        this.gio = gio;
    }

    public double gio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }

    @Override
    public double tinhLuong() {
        double tong=this.gio*10000;
        return tong;
    }

    @Override
    public String toString() {
        return super.toString()
                +gio;
    }

}
