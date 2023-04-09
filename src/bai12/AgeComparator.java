package bai12;

import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age()>o2.age()){
            return 1;
        }
        else if(o1.age()==o2.age()){
            return 0;
        }
        else {
            return -1;
        }


    }
}
