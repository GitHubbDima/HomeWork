package com.step.model.Employee;

import com.step.Exceptions.ArrayExceptions.ArrayExceptions;
import com.step.Exceptions.IndexOutExceptions;

import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private double salary;
    private String company;

    Scanner in = new Scanner(System.in);

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(){

    }

    public Employee(int id){
        this.id = id;

        System.out.print("Enter firstname: ");
        this.firstName = in.next();

        System.out.print("Enter lastname: ");
        this.lastName = in.next();

        System.out.print("Enter salary: ");
        this.salary = in.nextDouble();

        System.out.println("1. BUCURIA. ");
        System.out.println("2. PEGAS. ");
        System.out.println("3. FRANZELUTA. ");
        System.out.println("4. PETROM. ");
        System.out.println("5. FIDESCKO. ");

        do{
            System.out.print(" Choose the company: ");
            int number = in.nextInt();
            switch (number){
                case 1: { company = Company.BUCURIA.toString();  break; }
                case 2: { company = Company.PEGAS.toString(); break; }
                case 3: { company = Company.FRANZELUTA.toString();break; }
                case 4: { company = Company.PETROM.toString(); break; }
                case 5: { company = Company.FIDESKO.toString(); break; }
                default: { System.out.println("You don't choose from the list, try again..."); }
            }
        }while (company == null);
    }

    public void showAnEmployee(Employee[] employees, int position) throws IndexOutExceptions{
        try {
            System.out.println("id[" + employees[position - 1].id + "], " + employees[position - 1].firstName + " " + employees[position - 1].lastName);
            System.out.println("company " + employees[position - 1].company + " and salary - " + employees[position - 1].salary + " lei.");
        }catch (IndexOutOfBoundsException idEx){
            throw new IndexOutExceptions("Element does not exist. Please enter a value between 0 and " + (employees.length - 1));
        }
    }

    public char[] enterSentence(){
        System.out.println("Enter a sentence: ");
        return in.nextLine().toCharArray();
    }

    public void showCharacter(char[] sentence) throws ArrayExceptions{
        try {
            System.out.print("Enter the position of character in the sentence to show: ");
            int position = in.nextInt();
            System.out.println("Character: " + position + " - " + sentence[position - 1]);
        }catch (ArrayIndexOutOfBoundsException arrayEx){
            throw new ArrayExceptions("Out of bounds.");
        }
    }
}
