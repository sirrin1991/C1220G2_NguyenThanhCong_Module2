package _17_binary_file_and_serialization.bai_tap.product_manager;

import java.util.Scanner;

public class ProductManagerController {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.displayMainMenu();
        System.out.println("Input your choice");
        Scanner scanner = new Scanner(System.in);
        String choice;
        while (true){
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    productManager.addNewProduct();
                    break;
                case "2":
                    productManager.searchProductByName();
                    break;
                case "3":
                    productManager.showProductList();
                    break;
                case "4":
                    System.out.println("------------See you late------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Warning : Error Choice");

            }
        }
    }
}
