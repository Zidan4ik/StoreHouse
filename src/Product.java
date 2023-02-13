public class Product {
    static int id;
    int Id;
    String Thing;
    String Name;
    double Price;

    public Product(String thing, String name, double price) {
        id++;
        Id = id;
        Thing = thing;
        Name = name;
        Price = price;
    }

    @Override
    public String toString() {
        return   "ID : " + Id +
                " Price : " + Price +
                " Name : " + Name;
    }
}
