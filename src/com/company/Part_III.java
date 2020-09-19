package com.company;
import java.util.*;

public class Part_III {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String zadanie = sc.nextLine();
        int x, y, z;
        double d, h, g;
        switch (zadanie) {
            case "solution":
                d = sc.nextDouble();
                h = sc.nextDouble();
                g = sc.nextDouble();
                kvadrati(d, h, g);

        }
    }
    public static void kvadrati(double d,double h,double g){
        double dis=Math.pow(h,2)-4*d*g;
        if (d!=0) {
            System.out.print(d + "x^2 ");
        }
        else if (d==1){
                    System.out.print("x^2 ");
        }

        if (h!=0){
            System.out.print(h+"x ");
        }
        else if (h==1){
            System.out.print("x ");
        }
        if (g!=0){
            System.out.print(g+" = 0");
        }
        if (dis<0){
            System.out.println("решений нет");
        }
        else if (dis==0){
            System.out.println("существует одно решение");
            System.out.println((-1*h)/(2*d));
        }
        else if (dis>0){
            System.out.println("существует два решения");
            System.out.println("X1 = "+(Math.pow(dis,0.5)-1*h)/(2*d)+" X2 = "+(-1*(Math.pow(dis,0.5))-1*h)/(2*d));
        }
    }
}

