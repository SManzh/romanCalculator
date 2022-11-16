package com.GenInc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите выражение");
        String fnum = "";
        String snum = "";
        String operation;
        Double result;
        String line = LineNormalization.trimmedLine;
        line = LineNormalization.oddSymbDel(line);
        System.out.println(line);

//        char[] arrLine = line.toCharArray();
//        if ((arrLine[0] == '-') && ((Character.isLetter(arrLine[1])) ||
//                                    (arrLine[1] == 'V') ||
//                                    (arrLine[1] == 'X') ||
//                                    (arrLine[1] == 'l') ||
//                                    (arrLine[1] == 'C') ||
//                                    (arrLine[1] == 'D') ||
//                                    (arrLine[1] == 'M'))) {
//            System.out.println("invalid input");
//        } else if ((arrLine[0] == 'I') ||
//                    (arrLine[0] == 'V') ||
//                    (arrLine[0] == 'X') ||
//                    (arrLine[0] == 'l') ||
//                    (arrLine[0] == 'C') ||
//                    (arrLine[0] == 'D') ||
//                    (arrLine[0] == 'M')) {
//            System.out.println(NumberConverter.romanToArabic(fnum));
//        } else {
//            for (int i = 1; i < arrLine.length; i++) {
//                switch (line.charAt(i)) {
//                    case ('+'):
//                        fnum = line.substring(0, i);
//                        snum = line.substring(i + 1);
//                        result = Double.parseDouble(fnum) + Double.parseDouble(snum);
//                        System.out.println(result);
//                        break;
//                    case ('-'):
//                        fnum = line.substring(0, i);
//                        snum = line.substring(i + 1);
//                        result = Double.parseDouble(fnum) - Double.parseDouble(snum);
//                        System.out.println(result);
//                        break;
//                    case ('*'):
//                        fnum = line.substring(0, i);
//                        snum = line.substring(i + 1);
//                        result = Double.parseDouble(fnum) * Double.parseDouble(snum);
//                        System.out.println(result);
//                        break;
//                    case ('/'):
//                        fnum = line.substring(0, i);
//                        snum = line.substring(i + 1);
//                        result = Double.parseDouble(fnum) / Double.parseDouble(snum);
//                        System.out.println(result);
//                        break;
//                }
//
//            }
//        }
    }
}
