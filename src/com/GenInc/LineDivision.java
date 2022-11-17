package com.GenInc;

public class LineDivision {
    public static String fnum = "";
    public static String snum = "";
    public static String operation;
    String arabicExp = "";

    public static char[] arrLine = LineNormalization.trimmedLine.toCharArray();

    public static String LineDiv (String str) {
        for (int i = 1; i < arrLine.length; i++) {
            switch (LineNormalization.trimmedLine.charAt(i)) {
                case ('+'):
                    fnum = LineNormalization.trimmedLine.substring(0, i);
                    snum = LineNormalization.trimmedLine.substring(i + 1);
                    operation = "+";
                    return fnum;
                    break;
            }
        }
    }



}