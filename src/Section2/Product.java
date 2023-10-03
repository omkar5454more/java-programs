package Section2;
import java.util.ArrayList;
import java.util.List;
public class Product {



        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    class ShoppingCart {
        private List<Product> items;

        public ShoppingCart() {
            items = new ArrayList<>();
        }

        public void addProduct(String name, double price) {
            Product product = new Product(name, price);
            items.add(product);
        }

        public void addProduct(Product product) {
            items.add(product);
        }

        public double getTotalPrice() {
            double total = 0;
            for (Product product : items) {
                total += product.getPrice();
            }
            return total;
        }

        public void printReceipt() {
            System.out.println("Receipt:");
            for (Product product : items) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
            System.out.println("Total: $" + getTotalPrice());
        }
    }




