package poly;

public class Product {
    int price;
    int bomusPoint;
    
    public Product(int = price){
        this.price = price;
        this.bomusPoint += (int) (price / 10.0)
    }
}
