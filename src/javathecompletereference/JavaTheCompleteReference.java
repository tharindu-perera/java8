/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javathecompletereference;


/**
 * @author Your Name Tharindu Dhanushka
 */
public class JavaTheCompleteReference {
    private int marks = 99;
    private int age = 1;

    public JavaTheCompleteReference() {
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        throw new RuntimeException();
    }


    /**
     * @param args the command line arguments
     */
    public void main2(String[] args) {


    }


}
