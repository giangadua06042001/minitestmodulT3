package staff;

public class NhanVien {
    private String maNhanVien;
    private String name;
    private int age;
    private int number;
    private String email;
    private String diaChi;

    public NhanVien(String maNhanVien, String name, int age, int number, String email, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
        this.diaChi = diaChi;
    }
    public NhanVien(){
    }

    public String maNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
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

    public int number() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String diaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public double tinhLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}

