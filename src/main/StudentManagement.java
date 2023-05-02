package main;

import data.Shelf;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
//        Shelf shelf = new Shelf("trang", "hanoi");
//        shelf.inputAStudent();
//        shelf.display();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Input your choice: ");
        choice = Integer.parseInt(sc.nextLine()); 
        do {            
            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        } while (choice != 6);
    }
    public static void menu() {
        System.out.println("1.Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5 Remove a student profile");
        System.out.println("6 Quit");
    }

    
}
