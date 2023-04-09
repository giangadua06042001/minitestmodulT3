package Ontap;

import java.lang.management.ThreadInfo;

public class CongNhan extends Staff{
    private double luongCung;

    private double gioTangCa;
    private double luongLamThem;

    public CongNhan() {
    }

    public CongNhan(int id, String name, int age, String email, String diaChi, double luongCung, double gioTangCa, double luongLamThem) {
        super(id, name, age, email, diaChi);
        this.luongCung = luongCung;
        this.gioTangCa = gioTangCa;
        this.luongLamThem = luongLamThem;
    }

    public double luongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double gioTangCa() {
        return gioTangCa;
    }

    public void setGioTangCa(double gioTangCa) {
        this.gioTangCa = gioTangCa;
    }

    public double luongLamThem() {
        return luongLamThem;
    }

    public void setLuongLamThem(double luongLamThem) {
        this.luongLamThem = luongLamThem;
    }
    public double tongLuong(){
        double tong= this.luongCung+this.gioTangCa*this.luongLamThem;
        return tong;
    }
}
