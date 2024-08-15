/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt1;

/**
 *
 * @author xuant
 */
public class Rectangle {
    private double Length;
    private double width;
    public Rectangle(){
    Length=1.0;
    width=1.0;
    }
    public Rectangle(double Length,double width){

        this.Length = Length;
        this.width = width;
}
    public double getLength(){
    return Length;
    }
    
    public void setLength(double Length){
    this.Length = Length;
    }
    
    public double getwidth(){
    return width;
    }
    
    public void setwidth(double width){
    this.width = width;
    }
    
    public double findArea(){
    double area = Length*width;
    return area;
    }
    
    public double findPerimeter(){
    return (Length+width)*2;
    }
}