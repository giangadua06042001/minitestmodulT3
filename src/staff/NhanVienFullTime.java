package staff;

public class NhanVienFullTime extends NhanVien{
    private double tienThuong;
    private double tienPhat;
    private double luongCung;
    public NhanVienFullTime(){
    }

    public NhanVienFullTime(String maNhanVien, String name, int age, int number, String email, String diaChi, double tienThuong, double tienPhat, double luongCung) {
        super(maNhanVien, name, age, number, email, diaChi);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double tienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double tienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double luongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public double tinhLuong() {
        double tong=this.luongCung+(this.tienThuong-this.tienPhat);
        return tong;

            }

    @Override
    public String toString() {
        return super.toString()+luongCung
                 +tienPhat
                +tienThuong;
    }

}
