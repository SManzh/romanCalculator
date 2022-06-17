package com.GenInc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String line = scanner.nextLine();
        line = line.replace(" ", "");
        String fnum;
        String snum;
        Double result;
        char[] arrLine = line.toCharArray();
        for (int i = 1; i < arrLine.length; i++) {
            switch (line.charAt(i)){
                case('+'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i+1);
                    result = Double.parseDouble(fnum) + Double.parseDouble(snum);
                    System.out.println(result);
                case('-'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i+1);
                    result = Double.parseDouble(fnum) - Double.parseDouble(snum);
                    System.out.println(result);
                case('*'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i+1);
                    result = Double.parseDouble(fnum) * Double.parseDouble(snum);
                    System.out.println(result);
                case('/'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i+1);
                    result = Double.parseDouble(fnum) / Double.parseDouble(snum);
                    System.out.println(result);
            }
        }


    }
}
