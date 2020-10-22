package com.company;
import java.util.*;

public class Part_IV {

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
                System.out.println(bessey(x,sc));
            case "triArea":

        }
    }
    static String bessey(int k, Scanner scanner) {
        String s = scanner.nextLine();
        String res = "\n";
        String[] words = s.split(" ");
        String currentString = "";
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            ; if (currentString.length() + word.length()+1 < k)
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
}
