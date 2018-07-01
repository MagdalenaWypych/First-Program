package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number=1;
        Scanner scanner = new Scanner(System.in);


        while (number !=10) {
            System.out.println("Podaj odpowiednią liczbę");
            number = scanner.nextInt();
            if (number >10)
            System.out.println("Za dużo");
            else if (number <10) System.out.println("za mało");
        }
        System.out.println("Gratulacje");


    }
}
