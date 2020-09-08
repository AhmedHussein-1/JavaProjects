/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Maxka
 */
public class Student {
    private String name;
    private double[] grades = new double[4];
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double[] getGrades() {
        return grades;
    }
    public double setGradePointAverage() {
        double totalPoints = 0;
        
        for (int i = 0; i < grades.length; i++) {
            totalPoints += grades[i];
        }
        return totalPoints/grades.length;

    }
}
