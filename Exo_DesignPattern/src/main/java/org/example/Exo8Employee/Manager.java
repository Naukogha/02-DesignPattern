package org.example.Exo8Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String position;
    private List<Employee> employees ;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employe) {
        employees.add(employe);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Individual Manager: " + name + ", Position: " + position + "Liste Employer ");
        for (Employee subordinate : employees) {
            subordinate.showDetails();
        }
    }

}
