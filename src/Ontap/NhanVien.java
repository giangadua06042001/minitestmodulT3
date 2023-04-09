package Ontap;

public class NhanVien extends  Staff{
    private double luongCung;
    private double tienthuong;
    private double tienPhat;

    public NhanVien(int id, String name, int age, String email, String diaChi, double luongCung, double tienthuong, double tienPhat) {
        super(id, name, age, email, diaChi);
        this.luongCung = luongCung;
        this.tienthuong = tienthuong;
        this.tienPhat = tienPhat;
    }

    public NhanVien() {
    }

    public double luongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double tienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double tienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }
    public  double tongLuong(){
        double tong=this.luongCung+this.tienthuong-this.tienPhat;
        return tong;
    }
}
