/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author win
 */
public class Student {
    private String ID;
    private String name;
    private int yob;

    public Student(String ID, String name, int yob) {
        this.ID = ID;
        this.name = name;
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name=" + name + ", yob=" + yob + '}';
    }
    public void showProfile(){
        System.out.println(ID + " " + name + " " + yob + " ");
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
}
