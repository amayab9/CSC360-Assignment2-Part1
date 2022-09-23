/*
Date: 9/11/2022
Author: Amaya Bryant
Assignment: 2 part 1
Purpose: learning how to implement cloneable and comparable
Course: OOP2 - CSC 360
*/
public class TestOctagon {
    /*oct1: Octagon with side = 5.0, perimeter = 40.0, area = 120.71067811865476, wasCloned = false      
    oct2: Octagon with side = 5.0, perimeter = 40.0, area = 120.71067811865476, wasCloned = true      
    oct1.compareTo(oct2): 0  */
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon oct1 = new Octagon(5);
        System.out.println(oct1.toString()); //display the object

        Octagon oct2 = (Octagon) oct1.clone(); // clone it
        System.out.println(oct2.toString()); //display the clone

        System.out.println("Octagon 1 compared to Octagon 2: " + oct1.compareTo(oct2));
    }
    
    //Octagon oct2 = new Octagon();
     
    
}