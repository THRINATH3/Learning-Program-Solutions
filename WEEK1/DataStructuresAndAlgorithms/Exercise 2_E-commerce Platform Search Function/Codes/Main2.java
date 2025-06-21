import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int qty;
    double price;

    public Product(int productId, String productName, int qty, double price) {
        this.productId = productId;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }
}

class Main2 {

    public static Product getProduct(int getId, ArrayList<Product> a) {
        for (Product p : a) {
            if (p.productId == getId) {
                return p;
            }
        }
        return null;
    }

    public static Product getProductBS(int getId, ArrayList<Product> a) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid).productId == getId) {
                return a.get(mid);
            } else if (a.get(mid).productId < getId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        ArrayList<Product> a = new ArrayList<>();
        System.out.println("Enter the data size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.println("Enter the productId, Name, Qty, Price: ");
            int productId = sc.nextInt();
            sc.nextLine();
            String productName = sc.nextLine();
            int qty = sc.nextInt();
            double price = sc.nextDouble();
            a.add(new Product(productId, productName, qty, price));
        }

        System.out.println("Enter the Id for linear search: ");
        int linearSearchId = sc.nextInt();

        System.out.println("After Linear Search:");
        Product p = getProduct(linearSearchId, a);
        if (p != null) {
            System.out.println("Product Id: " + p.productId + " Product Name: " + p.productName + " Qty: " + p.qty + " Price: " + p.price);
        } else {
            System.out.println("Product not found.");
        }

        Collections.sort(a, Comparator.comparingInt(t -> t.productId));

        System.out.println("Enter the Id for binary search: ");
        int binarySearchId = sc.nextInt();

        System.out.println("After Binary Search:");
        p = getProductBS(binarySearchId, a);
        if (p != null) {
            System.out.println("Product Id: " + p.productId + " Product Name: " + p.productName + " Qty: " + p.qty + " Price: " + p.price);
        } else {
            System.out.println("Product not found.");
        }
        sc.close();
    }
}

/*Liner search for the small or unsorted data 
 *Binary Search for the sorting data and is more efficient while it removing the half of the data at every iteration
  
  Time Complexities:
  Liner Search : O(n);
  Binary Search : O(logn)
 */