package review_oop.exercise2.company;

import java.util.*;

public class OfficerManager{
    List<Officer> officerList;
    Scanner scanner = new Scanner(System.in);

    public OfficerManager(List<Officer> officerList) {
        this.officerList = officerList;
    }

    public void addOfficer() {
        boolean check;
        System.out.println("Full name is :");
        String fullName = scanner.nextLine();
        System.out.println("Gender is :");
        String gender = scanner.nextLine();
        System.out.println("Year of birth :");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Address is :");
        String address = scanner.nextLine();
        do {
            check = false;
            System.out.println("What is position?\n" +
                    "1.Worker\n" +
                    "2.Engineer\n" +
                    "3.Server");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Level is :");
                    String level = scanner.nextLine();
                    officerList.add(new Worker(fullName, gender, year, address, level));
                    break;
                case "2":
                    System.out.println("Training Industry :");
                    String trainingIndustry = scanner.nextLine();
                    officerList.add(new Engineer(fullName, gender, year, address, trainingIndustry));
                    break;
                case "3":
                    System.out.println("Job is :");
                    String job = scanner.nextLine();
                    officerList.add(new Server(fullName, gender, year, address, job));
                    break;
                default:
                    System.out.println("Warning : Error choice");
                    check = true;
            }
        } while (check);
    }

    public void showOfficerList() {
        for (Officer officer : officerList) {
            System.out.println(officer);
        }
    }

    public void searchByName() {
        boolean check = false;
        System.out.println("FullName is :");
        String fullName = scanner.nextLine();
        for (Officer officer : officerList){
            if(fullName.equals(officer.getFullName())){
                System.out.println(officer);
                check = true;
            }
        }
        if(!check){
            System.out.println("Do not have this officer");
        }
    }

    public void sortByName(){
        officerList.sort(Comparator.comparing(Officer::getFullName));
    }

    public void displayMainMenu(){
        System.out.println("Main Menu : \n" +
                "1.Add a new officer \n" +
                "2.Search \n" +
                "3.Sort \n" +
                "4.Show List \n" +
                "5.Exit");
    }

    public void choice(){
        System.out.println("Input your choice :");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                addOfficer();
                displayMainMenu();
                choice();
                break;
            case "2":
                searchByName();
                displayMainMenu();
                choice();
                break;
            case "3":
                sortByName();
                displayMainMenu();
                choice();
                break;
            case "4":
                showOfficerList();
                displayMainMenu();
                choice();
                break;
            case "5":
                System.out.println("-----------Good Bye-----------");
                System.exit(0);
                break;
            default:
                System.out.println("Warning : ERROR CHOICE");
                System.out.println("----------------------------------");
                displayMainMenu();
                choice();
        }
    }
}
