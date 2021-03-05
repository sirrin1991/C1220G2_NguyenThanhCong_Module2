package _012_java_collection_framework.bai_tap;

import java.util.*;

public class TestProductManager {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "tiger", 34));
        productList.add(new Product(2, "larue", 21));
        productList.add(new Product(3, "saigon", 23));
        int choice;
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        ProductManager.displayMenu();
        do {
            System.out.println("Input your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ProductManager.addProduct(productList);
                    ProductManager.displayMenu();
                    break;
                case 2:
                    ProductManager.displayInformationList(productList);
                    ProductManager.displayMenu();
                    break;
                case 3:
                    ProductManager.changeProductInformationById(productList);
                    ProductManager.displayMenu();
                    break;
                case 4:
                    ProductManager.deleteProductById(productList);
                    ProductManager.displayMenu();
                    break;
                case 5:
                    ProductManager.searchProductByName(productList);
                    ProductManager.displayMenu();
                    break;
                case 6:
                    ProductManager.sortProductList(productList);
                    ProductManager.displayMenu();
                    break;
                case 7:
                    System.out.println("Bye bye anh Trung");
                    check = false;
                    break;
                default:
                    System.out.println("Error Input");
            }
        } while (check);
    }
}

