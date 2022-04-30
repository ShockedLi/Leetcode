package com.shockedli.mind;

public class TelNumber {

    private static String telNumber(int[] num, int[] index) {
        String tel = "";
        for (int i : index) {
            tel += num[i];
        }
        return tel;
    }

    public static void main(String[] args) {
        int[] num = {1, 5, 6, 0, 7, 4, 9, 3};
        int[] index = {0, 1, 2, 3, 4, 0, 5, 1, 2, 6, 7};
        String telNumber = telNumber(num, index);
        System.out.println("小姐姐的電話號碼為：" + telNumber);
    }
}
