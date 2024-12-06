package org.example.Exo8Employee;

public class Main {
    public static void main(String[] args) {
        Employee marie = new EmployeBase("Marie", "Developpeur");
        marie.showDetails();

        Employee jojo = new EmployeBase("Jojo", "Testeur");
        jojo.showDetails();


        System.out.println();
        Manager manager = new Manager("Manager", "DRH" );
        manager.setEmployees(marie);
        manager.setEmployees(jojo);
        manager.showDetails();

    }
}
