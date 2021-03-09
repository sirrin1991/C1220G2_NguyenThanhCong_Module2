package review_oop.exercise2.company;

import java.util.ArrayList;

public class OfficerManagerController {
    public static void main(String[] args) {
        OfficerManager officerManager = new OfficerManager(new ArrayList<>());
        officerManager.displayMainMenu();
        officerManager.choice();
    }
}
