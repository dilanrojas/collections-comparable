public class Product implements Comparable<Product> {
  // Attributes
  private String name;
  private double price;
  private int quantity;

  public Product() {
    this.name = null;
    this.price = 0.0;
    this.quantity = 0;
  }

  public Product(
      String name,
      double price,
      int quantity) {
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

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public int compareTo(Product p) {
    return Integer.compare(this.quantity, p.getQuantity());
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity;
  }

}
