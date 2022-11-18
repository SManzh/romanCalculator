package com.GenInc;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите выражение");
        String fnum = "";
        String snum = "";
        String operation = "";
        String arabicExp = "";
        Double result;
        String line = LineNormalization.trimmedLine;


        char[] arrLine = line.toCharArray();
        for (int i = 1; i < arrLine.length; i++) {
            if ((line.charAt(i) == '*') || (line.charAt(i) == '/') || (line.charAt(i) == '+') || (line.charAt(i) == '-')) {
                fnum = line.substring(0, i);
                snum = line.substring(i + 1);
                operation = Character.toString(line.charAt(i));
            }
        }

        if ((arrLine[0] == '-') && ((Character.isLetter(arrLine[1])) ||
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
            line = Integer.toString(NumberConverter.romanToArabic(fnum)) + operation + Integer.toString(NumberConverter.romanToArabic(snum));
        }


        for (int i = 1; i < arrLine.length; i++) {
            switch (line.charAt(i)) {
                case ('+'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) + Double.parseDouble(snum);
                    System.out.println(result);
                    break;
                case ('-'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) - Double.parseDouble(snum);
                    System.out.println(result);
                    break;
                case ('*'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) * Double.parseDouble(snum);
                    System.out.println(result);
                    break;
                case ('/'):
                    fnum = line.substring(0, i);
                    snum = line.substring(i + 1);
                    result = Double.parseDouble(fnum) / Double.parseDouble(snum);
                    System.out.println(result);
                    break;
            }

        }

    }
}
