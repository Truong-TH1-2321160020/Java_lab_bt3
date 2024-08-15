/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author xuant
 */
public class ChuongTrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1,r2;
        System.out.println("Tao doi tuong r1...");
        r1 = new Rectangle();
        System.out.println("Tao ddoi tuong r2");
        System.out.println("cho biet dai: ");
        double dai = sc.nextDouble();
        System.out.println("cho biet rong: ");
        double rong = sc.nextDouble();
        r2 = new Rectangle(dai,rong);
        System.out.println("Thong tin ket qua: ");
        System.out.println("HCN thu 1: dai:"+ "-rong:"+ r1.getwidth()+"-dien tich:"+ r1.findArea()+"-chu vi:"+ r1.findPerimeter());
        System.out.println("HCN thu 1: dai:"+ "-rong:"+ r1.getwidth()+"-dien tich:"+ r1.findArea()+"-chu vi:"+ r1.findPerimeter());
    }
}
