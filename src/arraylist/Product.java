package arraylist;

public class Product {
    private  String name;
    private double price;
    private double weight;
    private int id;
    public Product(Product index) {

    }

    public Product(String name, double price, double weight,int id) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.id=id;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double price() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ",id =" + id +
                '}';
    }



}
