/*
Date: 9/11/2022
Author: Amaya Bryant
Assignment: 2 part 1
Purpose: learning how to implement cloneable and comparable
Course: OOP2 - CSC 360
*/
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    
    private double side;
    boolean wasCloned = false;

    //constructor 
    public Octagon(double side){
        this.side = side;
    }

    //getter
    public double getSide(){
        return side;
    }

    //methods
    public double getArea(){
        double area = ( 2 + 4 / Math.sqrt(2)) * side * side;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 8 * side;
        return perimeter;
    }

    //if the octagon was created via clone method, wasCloned = true
    public Object clone() throws CloneNotSupportedException {
        wasCloned = true;
        return super.clone();
    }

    @Override
    public int compareTo(Octagon o){
        //comparing the side value to see if they are the same or different
        int returnValue;
        if (this.side < o.getSide()){
            returnValue = -1;
        } else if (this.side > o.getSide()){
            returnValue = 1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    @Override
    public String toString(){
        return "Side length: " + side + " perimeter: " + getPerimeter() + " area: " + getArea() + " was cloned: " + wasCloned;
    }

    
}