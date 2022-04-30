package com.shockedli.mind.acm;



import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static  String format (double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(value);
    }

    public static double devide (int a, int b) {
        return (double) a / (double) b;
    }
    public static void calculator(int a, int b, String c) {
        switch (c) {
            case "+" :
                System.out.println(a + b);break;
            case "-" :
                System.out.println(a - b);break;
            case "*" :
                System.out.println(a * b);break;
            case "/" :
               if (b != 0) {
                   System.out.println(format(devide(a, b)));
               } else {
                   System.out.println("Divided by zero!");
               }break;
            default:
                System.out.println("Invalid operator!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a,b = 0;
        String c = null;
        if (i > 0 && i < 10) {
            String c1 = null;
            scanner.nextLine();
            while (i > 0) {

               c1 = scanner.nextLine();
                String[] arr = c1.split("\\s+");
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[1]);
                c = arr[2];

                calculator(a,b,c);
                i--;
            }
        }

        return;
    }
}
