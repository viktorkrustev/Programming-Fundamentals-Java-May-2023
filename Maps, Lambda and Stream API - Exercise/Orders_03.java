import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Product> products = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!products.containsKey(name)) {
                Product product = new Product(name, price, quantity);
                products.put(name, product);
            } else {
                Product product = products.get(name);
                product.setQuantity(product.getQuantity() + quantity);
                if (product.getPrice() != price) {
                    product.setPrice(price);
                }
            }

            input = scanner.nextLine();
        }

        for (Product product : products.values()) {
            double totalPrice = product.getPrice() * product.getQuantity();
            System.out.printf("%s -> %.2f%n", product.getName(), totalPrice);
        }
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
