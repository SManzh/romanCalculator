package com.GenInc;

import java.util.Scanner;

public class LineNormalization {

    private static Scanner scanner = new Scanner(System.in);
    private static String inputLine = scanner.nextLine();

    public static String oddSymbDel(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
        }

        String line = LineNormalization.trimmedLine;
        line = LineNormalization.oddSymbDel(line);
;

        return str;
    }


    public static String trimmedLine = inputLine.replaceAll(" ","");


}
