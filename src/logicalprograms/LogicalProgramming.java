package logicalprograms;

import java.util.Scanner;

public class LogicalProgramming {
    void FibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        int range, num1 = 0, num2 = 1, num3;
        System.out.println("Enter the range to print the Fibonacci Series : ");
        range = sc.nextInt();
        System.out.println("The Fibonacci Series numbers are : ");
        for (int i = 1; i < range; i++) {
            System.out.println(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }

    void PerfectNumber() {
        Scanner sc = new Scanner(System.in);
        int num1, add = 0;
        System.out.println("Enter any number to find whether it's perfect or not : ");
        num1 = sc.nextInt();
        for (int count = 1; count < num1; count++) {
            if (num1 % count == 0) {
                add = add + count;
            }
        }
        if (num1 == add) {
            System.out.println("It's a Perfect number");
        } else System.out.println("It's not a perfect number");
    }

    void PrimeNum() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether it's prime or not : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It's a Prime Number");
        } else {
            System.out.println("It's not a Prime Number");
        }
    }

    void ReverseNum() {
        int num, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print in reverse order : ");
        num = sc.nextInt();
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("The Reverse order is : " + rev);
    }

    public static void CouponNumbers() {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 1326093247;
        int randNum = (int) (Math.random() * max);
        StringBuilder sb = new StringBuilder();
        while (randNum > 0) {
            sb.append(chars[randNum % chars.length]);
            randNum /= chars.length;
        }
        String disCoupons = sb.toString();
        System.out.println("Distinct Coupons : " + disCoupons);
    }

    public static void main(String[] args) {
        LogicalProgramming obj = new LogicalProgramming();
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to run a program : ");
        int choice = scr.nextInt();
        switch (choice) {
            case 1:
                obj.FibonacciSeries();
                break;
            case 2:
                obj.PerfectNumber();
                break;
            case 3:
                obj.PrimeNum();
                break;
            case 4:
                obj.ReverseNum();
                break;
            case 5:
                CouponNumbers();
                break;
            default:
                System.out.println("Entered a Wrong Input.");
        }
    }
}

