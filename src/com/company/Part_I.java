package com.company;
import java.util.*;

public class Part_I {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        String zadanie = sc.nextLine();
        int x, y, z;
        double d;
        switch (zadanie) {
            case "repeat":
                System.out.println(repeat(sc));
            case "differenceMaxMin":
                System.out.println(raznMaxMin());
            case "isAvgWhole":
                System.out.println(isAvgWhole());
            case "cumulativeSum":
                ziklsum();
            case "getDecimalPlaces":
                d=sc.nextDouble();
                System.out.println(znaki(d));
            case "Fibonacci":
                x=sc.nextInt();
                System.out.println(fib(x));
            case "index":
                System.out.println(index28());
            case "isStrangePair":
                System.out.println(stran(sc));
            case "boxSeq":
                d=sc.nextDouble();
                System.out.println(boxSeq(d));
            case "PrefSuf":
                System.out.println(PrefSuf(sc));
        }
    }
    public static String repeat(Scanner scanner){
        String inputstr=scanner.nextLine();
        int mnoz=scanner.nextInt();
        StringBuilder result=new StringBuilder();
        char[] stringArray=inputstr.toCharArray();
        for (int counter=0;counter<inputstr.length();counter++)
            result.append(String.valueOf(stringArray[counter]).repeat(Math.max(0,mnoz)));
        return result.toString();
    }
    public static int raznMaxMin(){
        System.out.println("Введите количество чисел и массив");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for (int i=0; i<size;i++){
            array[i]= sc.nextInt();
        }
        int max=0;
        int min=0;
        for (int i=0;i<size;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i=0;i<size;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        int rez=max-min;
        return rez;
    }
    public static boolean isAvgWhole(){
        System.out.println("Введите количество чисел и массив");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for (int i=0; i<size;i++){
            array[i]= sc.nextInt();
        }
        double sum=0;
        for (int i=0;i<size;i++){
            sum+=array[i];
        }
        double sred= sum / size;
        Boolean x;
        if (sred%1==0){
            x=true;
        }
        else {
            x=false;
        }
        return x;
    }
    public static void ziklsum(){
        System.out.println("Введите количество чисел и массив");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for (int i=0; i<size;i++){
            array[i]= sc.nextInt();
        }
        for (int i=1;i<size;i++){
            array[i]=array[i-1]+array[i];
        }
        for (int i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }
    }
    public static int znaki(double d){
        int sum=0;
        while (d%1!=0){
            d=d*10;
            sum+=1;
        }
        return sum;
    }
    public static int fib(int x){
        int a=1;
        int b=1;
        int sum_fib;
        for (int i=0;i<x;i++){
            sum_fib=a+b;
            a=b;
            b=sum_fib;
        }
        return a;
    }
    public static boolean index28(){
        Scanner scanner=new Scanner(System.in);
        String index=scanner.nextLine();
        return index.matches("\\d{5}");
    }
    public static boolean stran(Scanner scanner){
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        boolean x;
        if (str1.charAt(0)==str2.charAt(str2.length()-1)){
            if (str2.charAt(0)==str1.charAt(str1.length()-1)){
                x=true;
            }
            else
                x=false;
        }
        else
            x=false;
        return x;
    }
    public static boolean PrefSuf(Scanner scanner) {
        String str = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        boolean x = false;
        switch (str3) {
            case "prefix":
                x=str.startsWith(str2);
                break;
            case "suffix":
                x=str.endsWith(str2);
                break;
        }
        return x;
    }

    public static double boxSeq(double x){
        double y;
        if (x%2==0){
            y=x;
        }
        else {
            y = x + 2;
        }
        return y;
    }

}
