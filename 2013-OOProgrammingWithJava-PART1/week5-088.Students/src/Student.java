/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Student {
    private String name;
    private String studentNumber;

    public Student(String n, String nn) {
        this.name = n;
        this.studentNumber = nn;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "" + this.name + " (" + this.studentNumber + ")";
    }
    
    
}
