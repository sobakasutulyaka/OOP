package com.company;
import java.util.*;

public class Part_III {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String zadanie = sc.nextLine();
        int x, y, z;
        double d, h, g;
        System.out.print("Введите название задания");
        switch (zadanie) { //выбор задания
            case "solution":
                System.out.print("введите коэффициенты а,в,с");
                d = sc.nextDouble();
                h = sc.nextDouble();
                g = sc.nextDouble();
                kvadrati(d, h, g);
            case "checkPerfect":
                System.out.print("Введите число");
                x=sc.nextInt();
                System.out.println(perf(x));
            case "findZip":
                System.out.print("Введите строку");
                System.out.println(zip(sc));
            case "flipEndChars":
                System.out.print("Введите строку");
                vhodvihod(sc);
            case "isValidHexCode":
                System.out.print("Введите код");
                System.out.print(cod(sc));
            case "same":
                System.out.print(same(sc));
                System.out.print("Введите числовую строку");
        }
    }
    public static void kvadrati(double d,double h,double g){
        double dis=Math.pow(h,2)-4*d*g; //дискрименант
        if (d!=0) {
            System.out.print(d + "x^2 ");
        }
        else if (d==1){ //вывод уравнения
                    System.out.print("x^2 ");
        }

        if (h!=0){
            System.out.print(h+"x ");
        }
        else if (h==1){
            System.out.print("x ");
        }
        if (g!=0){
            System.out.print(g+" = 0 ");
        }
        if (dis<0 || d==0 || h==0){ //проверка на решения
            System.out.println("решений нет");
        }
        else if (dis==0){ //решение уравнения
            System.out.println("существует одно решение");
            System.out.println((-1*h)/(2*d));
        }
        else if (dis>0){
            System.out.println("существует два решения");
            System.out.println("X1 = "+(Math.pow(dis,0.5)-1*h)/(2*d)+" X2 = "+(-1*(Math.pow(dis,0.5))-1*h)/(2*d));
        }
    }
    public static int zip(Scanner scanner){
        String str = scanner.nextLine();
        int index1=str.indexOf("zip");
        int index2;
        if (index1==-1){
            index2=index1;
        }
        else {
            index2=str.indexOf("zip",index1+3);
        }
    return index2;
    }

    public static boolean perf(int x){
        int sum=0;
        for (int i=1;i<x;i++){ //вычесление суммы всех делителей числа
            if (x%i==0){
                sum+=i;
            }
        }
        boolean z;
        if (x==sum){ //проверка равенства суммы и числа
            z=true;
        }
        else {
            z=false;
        }
    return z;
    }
    public static void vhodvihod(Scanner scanner){
        String str=scanner.nextLine(); //ввод строки
        int x=str.length(); //длинна строки
        String result0=str.substring(0,1);
        String result1=str.substring(x-1,x); //определяю 1 и последний символ в строке
        boolean y=result0.equals(result1); //сравнение 1го и последнего символа
        if (x<2){ //ограничение по длинне строки
            System.out.print("несовместимо");
        }
        else if (y==true){ //1 и последний символ не должны быть равны
            System.out.print("два это пара");
        }
        else {
            String newstr=str.replaceFirst(result0,result1); //замена 1го символа на последний
            System.out.print(newstr.substring(0,x-1)+result0);//обезка строки до предпоследнего символа+1 символ
        }
    }
    public static boolean cod(Scanner scanner){
        String str=scanner.nextLine(); //ввод
        int x=0;
        boolean y=false;
        if (str.charAt(0)=='#'){ //проверка на #
            for (int i=1;i<str.length();i++){ //проверка каждого символа на условие
                if ((str.charAt(i)>='0'&& str.charAt(i)<='9') || (str.charAt(i)>='A' && str.charAt(i)<='F') || (str.charAt(i)>='a' && str.charAt(i)<='f')){
                    x+=1;
                }
            }
            if (x==6 && str.length()==7){ //проверка строки на длинну и выполнение условия для всех символов
                y=true;
            }
            else {
                y=false;
            }
        }
    return y;
    }
    public static boolean same(Scanner scanner){
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();  //ввод строк
        int x1=0;
        int x2=0;
        int y1=0;
        int y2=0;
        boolean povt1=false;
        boolean povt2=false;
        for (int i=0;i<str1.length();i++){ //проверка на уникальность каждого символа
            int x=str1.charAt(i);
            for (int d=0;d<str1.length();d++){ //символ сравнивается с каждым символом строки
                if (x==str1.charAt(d)){
                    x1+=1;
                }
                if (x1>1){ //если есть повтор, то это фиксируется
                    povt1=true;
                }
            }
        if (x1==1){ //считается количесвто уникальных символов
            y1+=1;
        }
        }
        if (povt1==true){ //добавляются дублирующиеся символы
            y1+=1;
        }
        for (int i=0;i<str2.length();i++){ //такая же проверка для 2 строки
            int x=str2.charAt(i);
            for (int d=0;d<str2.length();d++){
                if (x==str2.charAt(d)){
                    x2+=1;
                }
                if (x2>1){
                    povt2=true;
                }
            }
            if (x2==1) {
                y2 += 1;
            }
        }
        if (povt2==true){
            y2+=1;
        }
        boolean a=false;
        if (y1==y2){ //сравнение количества уникальных элементов строк
            a=true;
        }
        else {
            a=false;
        }
    return a;
    }


}

