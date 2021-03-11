package _17_binary_file_and_serialization.bai_tap.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Serializable {
    private final String PATH = "D:\\C1220G2_NguyenThanhCong_Module2\\src\\_17_binary_file_and_serialization\\bai_tap\\product_manager\\product.txt";


    public void addNewProduct() {
        Scanner scanner = new Scanner(System.in);

        List<Product> productList = new ArrayList<>(readProductFile());
        System.out.println("how many product need to add ? :");
        int amount = 0;
        do {
            try {
                amount = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error !!! Try again :");
            }
        } while (amount <= 0);
        for (int i = 0; i < amount; i++) {
            System.out.println("Product's code :");
            String productCode = scanner.nextLine();
            System.out.println("Product's name :");
            String productName = scanner.nextLine();
            System.out.println("Factory's name :");
            String factory = scanner.nextLine();
            System.out.println("Product's price :");
            float price;
            while (true) {
                try {
                    price = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input false , try again");
                }
            }
            System.out.println("Product's color :");
            String color = scanner.nextLine();
            Product product = new Product(productCode, productName, factory, price, color);
            productList.add(product);
        }
        writeProductFile(productList);
        displayMainMenu();
    }

    public void showProductList() {
        List<Product> productList = new ArrayList<>(readProductFile());
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        displayMainMenu();
    }

    public void searchProductByName() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        showProductList();
        List<Product> productList = new ArrayList<>(readProductFile());
        System.out.println("Product's name need to search");
        String productName = scanner.nextLine();
        for (Product product : productList) {
            if (productName.equals(product.getProductName())) {
                System.out.println(product.toString());
                check = true;
            }
            break;
        }
        if (!check){
            System.out.println("Do not have this product !!!");
            System.out.println("----------------------------");

        }
        displayMainMenu();
    }

//    public void editProduct(){
//        Scanner scanner = new Scanner(System.in);
//        List<Product> productList = new ArrayList<>(readProductFile());
//        if(productList.size()<=0){
//            System.out.println("Empty list");
//            return;
//        }
//        showProductList();
//        System.out.println("--------------------------");
//        System.out.println("Product's code need to edit");
//        String choice = scanner.nextLine();
//        for (int i = 0 ; i < productList.size();i++){
//            if(choice.equals(productList.get(i).getProductCode())){
//                System.out.println(productList.get(i).toString());
//            }
//        }
//    }
//
//    public void changeProductInformation(Product product.txt){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choice :\n" +
//                "1.Edit product's code \n" +
//                "2.Edit product's name \n" +
//                "3.Edit product's factory \n" +
//                "4.Edit product's price \n" +
//                "5.Edit product's color \n" +
//                "6.Exit");
//        int choice = Integer.parseInt(scanner.nextLine());
//    }

    public void writeProductFile(List<Product> productList) {
        FileOutputStream productFile = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            productFile = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(productFile);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private List<Product> readProductFile() {
        File file = new File(PATH);
        if(file.length() >0) {
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            List<Product> productList = null;
            try {
                fileInputStream = new FileInputStream(PATH);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return productList;
        }else {
            return new ArrayList<>();
        }
    }

    public void displayMainMenu() {
        System.out.println("Main menu :\n" +
                "1.Add a new product txt\n" +
                "2.Search by name\n" +
                "3.Show product's list\n" +
                "4.Exit");
    }
}
