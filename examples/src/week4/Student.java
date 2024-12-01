package week4;

import java.text.DecimalFormat;
public class Student
{
    private String name;
    private String major;
    private double gpa;
    private int hours;

    public Student(String newName, String newMajor, double newGPA, int newHours)
    {
        name = newName;
        major = newMajor;
        gpa = newGPA;
        hours = newHours;
    }
    public String toString( )
    {
        DecimalFormat df = new DecimalFormat("0.000");
        return name + "\n" + major + "\n" + df.format(gpa) + "\n" + hours;
    }
}