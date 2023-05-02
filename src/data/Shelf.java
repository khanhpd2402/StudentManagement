/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class Shelf {

    //dac diem cua cai tu
    private String color;
    private String label;
    private Student[] list = new Student[5];
    private Scanner sc = new Scanner(System.in);
    private int count = 0;

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void inputAStudent() {
        System.out.print("Input id: ");
        String id = sc.nextLine();
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input yob: ");
        int yob = Integer.parseInt(sc.nextLine());
        list[count] = new  Student(id, name, yob);
        count++;
    }
    public void addAStudent(){
        list[count] = new Student(color, label, count);
        count++;
    }
    public void searchStudentById() {
        String id;
        System.out.print("Input id to search: ");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if(list[i].getID().equalsIgnoreCase(id) == true){
                list[i].showProfile();
                return;
            }
        }
        System.out.println("Not found!!!");
    }
    public void display(){
        System.out.println("The student list: ");
        for (int i = 0; i < count; i++) {
            list[i].showProfile();
        }
    }
}
