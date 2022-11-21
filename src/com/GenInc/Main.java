package com.GenInc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите выражение");

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String line = inputLine.replaceAll(" ","");

        String fnum = "";
        String snum = "";
        String operation = "";
        Double result = 0.0;
        String answ = "";


        char[] arrLine = line.toCharArray();
        for (int i = 1; i < arrLine.length; i++) {
            if ((line.charAt(i) == '*') || (line.charAt(i) == '/') || (line.charAt(i) == '+') || (line.charAt(i) == '-')) {
                fnum = line.substring(0, i);
                snum = line.substring(i + 1);
                operation = Character.toString(line.charAt(i));
            }
        }

        if ((arrLine[0] == '-') && ((Character.isLetter(arrLine[1])) ||
                (arrLine[1] == 'I') ||
                (arrLine[1] == 'V') ||
                (arrLine[1] == 'X') ||
                (arrLine[1] == 'l') ||
                (arrLine[1] == 'C') ||
                (arrLine[1] == 'D') ||
                (arrLine[1] == 'M'))) {
            System.out.println("invalid input");
        }

        if ((arrLine[0] == 'I') ||
                (arrLine[0] == 'V') ||
                (arrLine[0] == 'X') ||
                (arrLine[0] == 'l') ||
                (arrLine[0] == 'C') ||
                (arrLine[0] == 'D') ||
                (arrLine[0] == 'M')) {
            line = NumberConverter.romanToArabic(fnum) + operation + NumberConverter.romanToArabic(snum);

        }


        for (int i = 1; i < arrLine.length; i++) {
            switch (line.charAt(i)) {
                case ('+'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) + Double.parseDouble(snum);
                    answ = String.valueOf(result);
                    break;
                case ('-'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) - Double.parseDouble(snum);
                    answ = String.valueOf(result);
                    break;
                case ('*'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) * Double.parseDouble(snum);
                    answ = String.valueOf(result);
                    break;
                case ('/'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) / Double.parseDouble(snum);
                    answ = String.valueOf(result);
                    break;
            }

        }

        if ((inputLine.charAt(0) == 'I')||
                (inputLine.charAt(0) == 'V')||
                (inputLine.charAt(0) == 'X')||
                (inputLine.charAt(0) == 'L')||
                (inputLine.charAt(0) == 'C')||
                (inputLine.charAt(0) == 'D')||
                (inputLine.charAt(0) == 'M')) {
            System.out.println(NumberConverter.arabicToRoman(result.intValue()));
        } else {
            System.out.println(result);
        }
    }
}
