package _012_java_collection_framework.bai_tap;

import java.util.*;

public class ProductManager{
    public static void displayMenu() {
        System.out.println("Menu : \n" +
                "1. Add a new product \n" +
                "2. Product List \n" +
                "3. Edit Information \n" +
                "4. Delete the product \n" +
                "5. Search the product \n" +
                "6. Sort the product's list \n" +
                "7. Exit");
    }

    public static void addProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Product's name");
        String name = scanner.nextLine();
        System.out.println("Input id of a product");
        int id = scanner.nextInt();
        System.out.println("Input Product's price");
        double price = scanner.nextDouble();
        Product product = new Product(id, name, price);
        list.add(product);
    }

    public static void displayInformationList(List<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public static void changeProductInformationById(List<Product> list) {
        boolean check = true;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose the product's ID");
            displayInformationList(list);
            choice = scanner.nextInt();
            for (Product product : list) {
                if (choice == product.getId()) {
                    System.out.println("You want to change ? \n" +
                            "1.Name \n" +
                            "2.Price");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println("New product's name is ");
                        String newName = scanner.next();
                        product.setName(newName);
                        check = false;
                        break;
                    } else if (choice3 == 2) {
                        System.out.println("New product's price is ");
                        double newPrice = scanner.nextDouble();
                        product.setPrice(newPrice);
                        check = false;
                        break;
                    } else {
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("Error choose");
            } else {
                displayInformationList(list);
            }
        } while (check);
    }

    public static void deleteProductById(List<Product> list) {
        boolean check = true;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose the product's ID");
            displayInformationList(list);
            choice = scanner.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if (choice == list.get(i).getId()) {
                    list.remove(list.get(i));
                    check = false;
                }
            }
            if (check) {
                System.out.println("Error choose");
            } else {
                displayInformationList(list);
            }
        } while (check);
    }

    public static void searchProductByName(List<Product> list) {
        System.out.println("Input a name");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.next();
        boolean check = false;
        for (Product product : list) {
            if (searchName.equals(product.getName())) {
                System.out.println(product.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Do not have this Product");
        }

    }

    public static void sortProductList(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Sorted by price(increase)\n" +
                "2.Sorted by price(decrease)\n" +
                "3.Sorted by name");
        System.out.println("Input your choice");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                list.sort(Comparator.comparing(Product::getPrice));
                displayInformationList(list);
                break;
            case 2:
                list.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
                displayInformationList(list);
                break;
            case 3 :
                list.sort(Comparator.comparing(Product::getName));
                displayInformationList(list);
                break;
            default:
                System.out.println("Error choice");
        }
    }
}

