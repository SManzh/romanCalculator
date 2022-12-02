package com.GenInc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter();
        String[] actions = {"+", "-","/","*"};
        String[] regexActions = {"\\+","-","/","\\*"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String exp = scanner.nextLine();

        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])){
                actionIndex = i;
                break;
            }
        }

        // if action operator not found, stop program
        if (actionIndex == -1) {
            System.out.println("Incorrect expression!");
            return;
        }



        String[] data = exp.split(regexActions[actionIndex]);
        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
            int a,b;

            boolean isRoman = converter.isRoman(data[0]);
            if (isRoman) {
                a=converter.romanToInt(data[0]);
                b=converter.romanToInt(data[1]);
            } else {
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
            }

            int result;
            switch (actions[actionIndex]){
                case "+":
                    result = a+b;
                    break;
                case "-":
                    result = a-b;
                    break;
                case "*":
                    result = a*b;
                    break;
                default:
                    result = a/b;
                    break;
            }

            if (isRoman) {
                System.out.println(converter.intToRoman(result));
            } else {
                System.out.println(result);
            }
        } else {
            System.out.println("Numbers should have same format");
        }






















//        String line = inputLine;
//
//        String fnum = "";
//        String snum = "";
//        String operation = "";
//        Double result = 0.0;
//

//        char[] arrLine = line.toCharArray();
//        for (int i = 1; i < arrLine.length; i++) {
//            if ((line.charAt(i) == '*') || (line.charAt(i) == '/') || (line.charAt(i) == '+') || (line.charAt(i) == '-')) {
//                fnum = line.substring(0, i);
//                snum = line.substring(i + 1);
//                operation = Character.toString(line.charAt(i));
//            }
//        }
//
////
//
/////////////////////////////////////////////////////////////////////////////////////// LXXXIV+CXXVI
//
//        if ((arrLine[0] == '-') && ((Character.isLetter(arrLine[1])) ||
//                (arrLine[1] == 'I') ||
//                (arrLine[1] == 'V') ||
//                (arrLine[1] == 'X') ||
//                (arrLine[1] == 'l') ||
//                (arrLine[1] == 'C') ||
//                (arrLine[1] == 'D') ||
//                (arrLine[1] == 'M'))) {
//            System.out.println("invalid input");
//        }
//
//        if ((arrLine[0] == 'I') ||
//                (arrLine[0] == 'V') ||
//                (arrLine[0] == 'X') ||
//                (arrLine[0] == 'l') ||
//                (arrLine[0] == 'C') ||
//                (arrLine[0] == 'D') ||
//                (arrLine[0] == 'M')) {
//            line = NumberConverter.romanToArabic(fnum) + operation + NumberConverter.romanToArabic(snum);
//        }
//
//        System.out.println(line);

//        for (int i = 1; i < arrLine.length; i++) {
//            switch (line.charAt(i)) {
//                case ('+'):
//                    fnum = line.substring(0, i);
//                    snum = line.substring(i + 1);
//                    result = Double.parseDouble(fnum) + Double.parseDouble(snum);
//                    break;
//                case ('-'):
//                    fnum = line.substring(0, i);
//                    snum = line.substring(i + 1);
//                    result = Double.parseDouble(fnum) - Double.parseDouble(snum);
//                    break;
//                case ('*'):
//                    fnum = line.substring(0, i);
//                    snum = line.substring(i + 1);
//                    result = Double.parseDouble(fnum) * Double.parseDouble(snum);
//                    break;
//                case ('/'):
//                    fnum = line.substring(0, i);
//                    snum = line.substring(i + 1);
//                    result = Double.parseDouble(fnum) / Double.parseDouble(snum);
//                    break;
//            }
//
//        }
//
//        if ((inputLine.charAt(0) == 'I')||
//                (inputLine.charAt(0) == 'V')||
//                (inputLine.charAt(0) == 'X')||
//                (inputLine.charAt(0) == 'L')||
//                (inputLine.charAt(0) == 'C')||
//                (inputLine.charAt(0) == 'D')||
//                (inputLine.charAt(0) == 'M')) {
//            System.out.println(NumberConverter.arabicToRoman(result.intValue()));
//        } else {
//            System.out.println(result);
//        }
    }
}
