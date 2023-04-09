package ontaplai;

public class Node {
    private Student student;
    private Node next;

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }
    public void printData(){
        student.printInfo();
    }
}
