package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        if (((x / 10000) % 2 == 0) && ((x / 1000) % 2 == 0) && ((x / 100) % 2 == 0) && ((x / 10) % 2 == 0) && (x % 2 == 0)) {
            return "TRUE";
        } else {
            return "FALSE";
        }
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
