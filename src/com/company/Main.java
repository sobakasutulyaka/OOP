package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер модуля: ");
        int module = sc.nextInt();
        switch (module) {
            case 1 -> {
                Part_I.main();
            }
            case 2 -> {
                Part_II.main();
            }
            case 3 -> {
                Part_III.main();
            }
            case 4 -> {
                Part_IV.main();
            }
            case 5 -> {
                Part_V.main();
            }
            case 6 -> {
                Part_VI.main();
            }
        }
    }
}


