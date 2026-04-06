import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<>();

    // Add products using a method
    addProduct(list, "Laptop", 1200.50, 5);
    addProduct(list, "Mouse", 25.00, 50);
    addProduct(list, "Keyboard", 75.20, 20);

    System.out.println("--- Original List ---");
    printList(list);

    // 1. Natural Sort
    Collections.sort(list);
    System.out.println("\n--- Sorted by Quantity (Desc) ---");
    printList(list);

    // 2. Sort by Name
    list.sort(new CompareByName());
    System.out.println("\n--- Sorted by Name ---");
    printList(list);

    // 3. Sort by Price
    list.sort(new CompareByPrice());
    System.out.println("\n--- Sorted by Price ---");
    printList(list);
  }

  public static void addProduct(ArrayList<Product> list, String n, double p, int q) {
    list.add(new Product(n, p, q));
  }

  public static void printList(ArrayList<Product> list) {
    for (Product p : list) {
      System.out.println(p + "\n----------------");
    }
  }
}
