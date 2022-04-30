package com.shockedli.mind.acm;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GetTriangleThirdSideLength {

    public static String format(double value) {
        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(value);
    }

    public static int whichOne(int a, int b, int c) {
        if (a == -1) {
            return 1;
        } else if (b == -1) {
            return 2;
        } else {
            return 3;
        }
    }

    public static String thirdSideLength(int a, int b, int c) {
        if (c != -1 && (a > c || b > c)) {
            return "Impossible.";
        }
        if (a == c || b == c) {
            return "Impossible.";
        }

        double requireSideLength = 0;

        int requireSide = whichOne(a, b, c);
        if (requireSide == 1) {
            requireSideLength = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
            return "a = " + format(requireSideLength);
        } else if (requireSide == 2) {
            requireSideLength = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            return "b = " + format(requireSideLength);
        } else {
            requireSideLength = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            return "c = " + format(requireSideLength);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -1, b = -1, c = -1;
        String str = null;
        String value = "Triangle #";
        int index = 0;
        while (true) {

            str = scanner.nextLine();
            String[] arr = str.split("\\s+");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            c = Integer.parseInt(arr[2]);

            if (a == 0 && b == 0 && c == 0) {
                return;
            }
            String message = thirdSideLength(a, b, c);
            index++;
            System.out.println(value + index);
            System.out.println(message);
            System.out.println();
        }
    }
}
