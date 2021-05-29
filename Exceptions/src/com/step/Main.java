package com.step;

import com.step.Exceptions.IndexOutExceptions;
import com.step.model.Employee.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here
        Scanner in = new Scanner(System.in);

/*        boolean verify = true;
        do {
            App app = new App();
            try{
                app.verifyIf_IsInt();
                verify = false;
            }catch (IntExceptions myEx){
                System.out.println(myEx.getMessage());
            }
        }while(verify);*/

/*        Employee employee = new Employee();
        char[] anything = employee.enterSentence();
        try{
            employee.showCharacter(anything);
        }catch (ArrayExceptions arrayEx){
            System.out.println(arrayEx.getMessage());
        }*/

        System.out.print("Enter count the employee for initialization: ");
        int x = in.nextInt();
        int id = 1;
        Employee[] emp = new Employee[x];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee(id);
            ++id;
        }

        Employee employee = new Employee();
        System.out.print("Enter the number employee for show: ");
        int positionInEmp = in.nextInt();
        try{
            employee.showAnEmployee(emp, positionInEmp);
        }catch (IndexOutExceptions idEx){
            System.out.println(idEx.getMessage());
        }


    }
}
