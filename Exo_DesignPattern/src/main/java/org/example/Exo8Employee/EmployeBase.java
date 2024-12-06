package org.example.Exo8Employee;

public class EmployeBase implements Employee {
    private String name;
    private String position;

    public EmployeBase(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public void showDetails() {
        System.out.println("Individual Employee: " + name + ", Position: " + position);
    }
}
