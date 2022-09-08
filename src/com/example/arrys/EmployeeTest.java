package com.example.arrys;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"sudheer",30000);
        Employee e2= new Employee(2,"surendra",40000);
        Employee e3= new Employee(3,"kb",50000);

        Employee[] employees= new Employee[3];
        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;

       /* for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i]);
        }*/

        for (Employee e:employees) {
            System.out.println(e);
        }

    }
}
