package _11_dsa_stack_queue.bai_tap.demering_use_queue;

import java.util.*;

public class DemeringUseQueue {
    public static void main(String[] args) {
        List<EmployeeList> employeeLists = new ArrayList<>();

        employeeLists.add(new EmployeeList("male", 1));

        employeeLists.add(new EmployeeList("female", 2));

        employeeLists.add(new EmployeeList("female", 3));

        employeeLists.add(new EmployeeList("male", 4));

        employeeLists.add(new EmployeeList("male", 5));

        employeeLists.add(new EmployeeList("female", 6));

        Queue<EmployeeList> femaleList = new ArrayDeque<>();

        Queue<EmployeeList> maleList = new ArrayDeque<>();

        for (EmployeeList employee : employeeLists) {
            if (employee.getGender().equals("female")) {
                femaleList.add(employee);
            } else {
                maleList.add(employee);
            }
        }

        employeeLists.clear();

        employeeLists.addAll(femaleList);

        employeeLists.addAll(maleList);

        for (EmployeeList employeeList : employeeLists) {
            System.out.println("Gender is " + employeeList.getGender() + ". Serial is " +
                    employeeList.getSerial());
        }

    }
}
