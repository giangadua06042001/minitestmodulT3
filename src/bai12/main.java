package bai12;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Student student1= new Student("tom",22,"lao cai");
        Student student2= new Student("dong",19,"lao cai");
        Student student3= new Student("dung",3,"lao cai");
        List<Student>list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for(Student st:list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator= new AgeComparator();
        list.sort(ageComparator);
        System.out.println("so sanh theo tuoi");
        for(Student student:list){
            System.out.println(student);
        }

    }
}
