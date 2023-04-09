package ontaplai;

public class Student {
    public static int autoId;
    private int id;
    private String name;
private int age;

    public Student(String name, int age,int id) {
        this.id=Student.autoId++;
        this.name = name;
        this.age = age;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
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
    public  void printInfo(){
        System.out.println("Id"+this.id);
        System.out.println("name"+this.name);
        System.out.println("Age"+this.age);
    }
}
