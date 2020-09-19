package com.company;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Part_I {

    public static void main() {
        Scanner in = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        String zadanie=sc.nextLine();
        int x,y,z;
        System.out.print("Введите название задания");
        switch (zadanie){
            case "remainder":
                System.out.print("Введите 2 числа");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(remainder(x,y));
            case "triArea":
                System.out.print("Введите основание и высоту треугольника");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(triArea(x,y));
            case "animals":
                System.out.print("Введите число куриц, коров, свиней");
                x=sc.nextInt();
                y=sc.nextInt();
                z=sc.nextInt();
                System.out.println(animals(x,y,z));
            case "profitableGamble":
                System.out.print("Введите три аргумента");
                x=sc.nextInt();
                y=sc.nextInt();
                z=sc.nextInt();
                System.out.println(profitableGamble(x,y,z));
            case "operation":
                System.out.print("Введите 3 числа");
                x=sc.nextInt();
                y=sc.nextInt();
                z=sc.nextInt();
                System.out.println(operation(x,y,z));
            case "ctoa":
                System.out.print("Введите символ");
                System.out.println(ctoa());
            case "addUpTo":
                System.out.print("Введите число");
                x=sc.nextInt();
                System.out.println(addUpTo(x));
            case "nextEdge":
                System.out.print("Введите 2 стороны треугольника");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(nextEdge(x,y));
            case "sumOfCubes":
                System.out.print("Введите строку");
                System.out.println(sumOfCubes(in));
            case "abcmath":
                System.out.print("Введите 3 числа");
                x=sc.nextInt();
                y=sc.nextInt();
                z=sc.nextInt();
                System.out.println(abcmath(x,y,z));
        }
    }

    public static int remainder(int x, int y) {
        int z = x % y;
        return z;
    }
    public static double triArea(int x, int y) {
        double z = 0.5*x*y;
        return z;
    }
    public static double animals(int x, int y, int z) {
        double d = 2*x+4*x+4*z;
        return  d;
    }
    public static String profitableGamble(int prob, int prize, int pay) {
        String d;
        if (prob*prize>pay) {
            d = "true";
        }
        else {
            d = "false";
        }
        return d;
    }
    public static String operation(int x, int y, int z) {
        String d;
        if (x/y==z) {
            d= "multiply";
        }
        else if (x*y==z){
            d= "to split";
        }
        else if (x-y==z){
            d="fold";
        }
        else if (x+y==z){
            d="subtract";
        }
        else {
            d="none";
        }
        return d;
    }
    public static int ctoa() {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int x = (char) c;
        return x;
    }
    public static int addUpTo(int x){
        int y=0;
        while (x>0) {
            y=y+x;
            x=x-1;
        }
        return y;
    }
    public static int nextEdge (int x, int y) {
        int z=x+y-1;
        return z;
    }
    public static int sumOfCubes(Scanner scanner) {
        System.out.println("Введите количество элементов массива, и введите массив");
        int size = scanner.nextInt();
        int array[] = new int[size];
        int sum = 0;
        for (int counter = 0; counter < size; counter++) {
            array[counter] = scanner.nextInt();
        }
        for (int counter = 0; counter < size; counter++) {
            sum += Math.pow(array[counter], 3);
        }
        return sum;
    }
    public static boolean abcmath(int x,int y, int z) {
        int d=2*x;
        boolean e;
        for (int i=1;i<y;i++){
            d=2*d;
        }
        if (d%z==0) {
            e=true;
        }
        else {
            e=false;
        }
        return e;
    }
}
