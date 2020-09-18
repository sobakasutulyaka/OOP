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

        }
    }
}


