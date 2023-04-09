package ontaplai;

public class Main {
    public static void main(String[] args) {
        System.out.println("linked list-java");
        LinkedList list =new LinkedList();
        list.insertAt(new Node(new Student("tom",22,1)),0);
        Student student=new Student("dua",22,2);
        Node node= new Node(student);
        list.insertAt(node,0);
        student.printInfo();
    }
}
