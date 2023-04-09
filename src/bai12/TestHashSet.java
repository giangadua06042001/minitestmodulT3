package bai12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Student student3=new Student("tom",22,"lao cai");
        Student student1=new Student("dung",3,"lao cai");
        Student student2=new Student("dong",19,"lao cai");
        Map<Integer,Student>studentMap=new HashMap<Integer,Student>();
        studentMap.put(1,student3);
        studentMap.put(2,student1);
        studentMap.put(3,student2);
        for(Map.Entry<Integer, Student> student:studentMap.entrySet()){
           System.out.println(student.toString());
        }
        System.out.println("................Set");
        Set<Student>students=new HashSet<Student>();
        students.add(student3);
        students.add(student2);
        students.add(student1);
        for (Student student:students){
            System.out.println(student.toString());
        }
    }
}
