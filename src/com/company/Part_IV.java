package com.company;
import java.util.*;
import java.util.regex.*;
public class Part_IV {

    public static void main() {
        System.out.println("Введите название задания"); //выбор задания
        Scanner in = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        String zadanie=sc.nextLine();
        int x,y,z;
        double d,r,g;
        String s,n;
        switch (zadanie){
            case "bessey":
                System.out.println("Введите ограничение для строки и текст через пробел");
                x=sc.nextInt();
                System.out.println(bessey(x,sc));
            case "split":
                System.out.println("Введите строку скобок");
                s=sc.nextLine();
                Arrays.toString(split(s));
            case "toCamelCase":
                System.out.println("Введите строку");
                s=sc.nextLine();
                System.out.println(toCamelCase(s));
            case "toSnakelCase":
                System.out.println("Введите строку");
                s=sc.nextLine();
                System.out.println(toSnakelCase(s));
            case "overTime":
                System.out.println("Введите начало и конец рабочего дня, почасовую ставку и коэф переработки");
                d=sc.nextDouble();
                r=sc.nextDouble();
                x=sc.nextInt();
                g=sc.nextDouble();
                System.out.println("$"+overTime(d,r,x,g));
            case "BMI":
                System.out.println("Введите массу и рост с единицами измерения");
                s=sc.nextLine();
                BMI(s);
            case "bugger":
                x=sc.nextInt();
                System.out.println(bugger(x));
            case "toStarShorthand":
                s=sc.nextLine();
                toStarShorthand(s);
            case "doesRhyme":
                s=sc.nextLine();
                n=sc.nextLine();
                System.out.println(doesRhyme(s,n));
            case "trouble":
                s=sc.nextLine();
                n=sc.nextLine();
                System.out.println(trouble(s,n));
            case "countUniqueBooks":
                s=sc.nextLine();
                n=sc.nextLine();
                System.out.println(countUniqueBooks(s,n));
        }
    }
    public static String bessey(int k, Scanner scanner) {
        String s = scanner.nextLine();
        String res = "\n";
        String[] words = s.split(" "); //разделение строки на слова
        String currentString = "";
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            ; if (currentString.length() + word.length()+1 < k) //условие для длины строки
                currentString += " " + word;
            else {
                res += currentString + '\n';
                currentString = word;
            }
        }
        String word = words[words.length -1];
        if (currentString.length() + word.length()+1 < k)
            currentString += " " + word;
        else {
            res += word ;
        }
        return res;
    }
    public static String[] split(String s) {
        ArrayList<String> cls = new ArrayList<String>();
        int brackets = 0;
        String currentString = "";
        int size = 0;
        String[] arr = {};
        for(char c : s.toCharArray()) {
            if(c=='(')brackets++;
            else if (c==')')brackets++;

            currentString+=c;
            if (brackets == 0) {
                size+=1;
                String[] a = arr;
                arr = new String[size];
                for(int i = 1; i <= a.length; i++) {
                    arr[i] = a[i-1];
                }
                arr[0] = currentString;
                currentString = "";
            }
        }
        return arr;
    }
    public static String toCamelCase(String s) {
        String res = "";
        char[] a = s.toCharArray();

        for(int i = 0; i < s.length(); i++) { //перебор строки
            if(i>0 && a[i-1] == '_') { //проверка на наличие пробела
                res+=Character.toUpperCase(a[i]);
            }else if(a[i] != '_') {
                res += a[i];
            }
        }

        return res;
    }
    public static String toSnakelCase(String s) {
        String res = "";
        char[] a = s.toCharArray();

        for(int i = 0; i < s.length(); i++) { //перебор строки
            if (Character.isUpperCase(a[i])) { //проверка на заглавную букву
                res+="_"+Character.toLowerCase(a[i]);
            }else
                res+=a[i];
        }

        return res;
    }
    public static double overTime(double nach,double kon,int den,double koef){
        double res=0;
        if (kon>17) {
            res=(kon-17)*den*koef+(17-nach)*den;
        }
        else {
            res=(kon-nach)*den;
        }
        return res;
    }
    public static void BMI (String s){
        String[] str=s.split(" ");
        if (str[1].equals("pounds")){ //проверка на единицы измерения
            str[0]=String.valueOf(Float.parseFloat(str[0])/2.20462); //перевод единиц измерения
        }
        if (str[3].equals("inches")){
            str[2]=String.valueOf(Float.parseFloat(str[2])*0.0254);
        }
        float index=(float)(Float.parseFloat(str[0])/Math.pow(Float.parseFloat(str[2]),2)); //расчет ИМТ
        if (index<18.5){
            System.out.println("Индекс массы тела: "+index+", недостаток веса");
        }
        else if (index>=25){
            System.out.println("Индекс массы тела: "+index+", Избыток веса");
        }
        else {
            System.out.println("Индекс массы тела: "+index+", Нормальный вес");
        }
    }
    public static int bugger(int x){
        int y=x;
        int d;
        int s=0;
        int proizv=1;
        while (x>9){
            while (y>0){ //цикл рассчета произведения цифр числа
                d=y%10;
                y=y/10;
                proizv*=d;
            }
            s++;
            y=proizv;
            x=y;
        }
    return s;
    }
    public static void toStarShorthand(String str){
        StringBuilder line = new StringBuilder();
        LinkedHashMap<String, Integer> scorer = new LinkedHashMap<>();
        for (int i=0; i<str.length();i++){
            if (scorer.containsKey(String.valueOf(str.charAt(i)))){
                scorer.put(String.valueOf(str.charAt(i)),scorer.get(String.valueOf(str.charAt(i)))+1);
            }
            else{
                scorer.put(String.valueOf(str.charAt(i)),1);
            }
        }
        for (String key : scorer.keySet()){
            if (scorer.get(key)>1) {
                line.append(key).append("*").append(scorer.get(key));
            }
            else{
                line.append(key);
            }
        }
        System.out.println(line);
    }
    public static boolean doesRhyme(String str, String str1){
        Set<String> ru = new HashSet<>(Arrays.asList("а", "у", "о", "ы", "и", "э", "я", "ю", "е", "ё"));
        Set<String> en = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u", "y"));
        String[] line = str.toLowerCase().split(" ");
        String[] line1 = str1.toLowerCase().split(" ");
//Массив символов последнего слова
        Set<String> end = new HashSet<>(Arrays.asList(line[line.length-1].split("")));
        Set<String> end1 = new HashSet<>(Arrays.asList(line1[line1.length-1].split("")));
//Определяем язык и находим пересечение гласных
        if (end.toArray()[0].toString().matches("[а-я]") && end1.toArray()[0].toString().matches("[а-я]")){
            end.retainAll(ru);
            end1.retainAll(ru);
        }
        else if (end.toArray()[0].toString().matches("[a-z]") && end1.toArray()[0].toString().matches("[a-z]")){
            end.retainAll(en);
            end1.retainAll(en);
        }
        return end.equals(end1);
    }
    public static boolean trouble(String str, String str1){
        for (int i=0;i<10;i++) {
            if (str.matches(".*["+i+"]{3}.*") && str1.matches(".*["+i+"]{2}.*"))
                return true;
        }
        return false;
    }
    public static int countUniqueBooks(String str, String str1){
        Set<Character> count = new HashSet<>();
        boolean run = false;
        int f=0;
        for (int i=0;i<str.length();i++){
            boolean equals = String.valueOf(str.charAt(i)).equals(str1);
            if (equals && f==0){
                run = true;
                f++;
            }
            else if (equals){
                run=false;
                f=0;
            }
            if (!count.toString().matches(String.valueOf(str.charAt(i))) && run && !str1.equals(String.valueOf(str.charAt(i)))){
                count.add(str.charAt(i));
            }
        }
        return count.size();
    }
}
