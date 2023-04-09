package Stundent;

public class SinhVien {
    private String maSinhVien;
    private String name;
    private int age;
    private double diemTrungBinh;

    public SinhVien(String name) {
    }

    public SinhVien(String maSinhVien, String name, int age, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.age = age;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String maSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double diemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }


}
