class Product {
    static int totalProducts = 0;
    int productId;
    String productName, category;
    private double price;

    // Default constructor
    public Product() {
        this.productId = ++totalProducts;
        this.productName = "Unknown";
        this.category = "General";
        this.price = 0.0;
    }

    // Parameterized constructor using 'this'
    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Category: " + category + ", Price: " + price);
    }

    // Static method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Method to calculate stock value
    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    // Overloaded method with discount rate
    public double calculateStockValue(int quantity, double discountRate) {
        return (price * quantity) * (1 - discountRate / 100);
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", "Electronics", 55000);
        Product p2 = new Product(102, "Smartphone", "Electronics", 30000);
        Product p3 = new Product();

        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();

        System.out.println("Stock Value of p1 (10 units): " + p1.calculateStockValue(10));
        System.out.println("Stock Value of p2 (5 units, 10% discount): " + p2.calculateStockValue(5, 10));

        Product.displayTotalProducts();
    }
}
