package com.GenInc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String line = scanner.nextLine();

        String[] arr = line.split(" ");
        switch (arr[1]) {
            case ("+"):
                System.out.println(Double.parseDouble(arr[0]) + Double.parseDouble(arr[2]));
                break;
            case ("-"):
                System.out.println(Double.parseDouble(arr[0]) - Double.parseDouble(arr[2]));
                break;
            case ("*"):
                System.out.println(Double.parseDouble(arr[0]) * Double.parseDouble(arr[2]));
                break;
            case ("/"):
                System.out.println(Double.parseDouble(arr[0]) / Double.parseDouble(arr[2]));
                break;
        }


    }
}
