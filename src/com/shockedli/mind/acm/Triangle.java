package com.shockedli.mind.acm;

import java.util.Scanner;

public class Triangle {

    public static void createTriangle(String str) {
        System.out.println("  " + str);
        System.out.println(" " + str + str + str);
        System.out.println(str + str + str + str + str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 0 && i < 10) {
            String c1 = null;
            while (i > 0) {
                c1= scanner.next();
                createTriangle(c1);
                i--;
            }
        }

        return;
    }
}
