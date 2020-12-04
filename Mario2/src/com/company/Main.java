package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Size:");
            size = input.nextInt();

        }
        while (size < 1 || size > 8);
        hashtags(size);
        System.out.println("Size = " + size);
    }

    static void hashtags(int size) {
        for (int x = 0; x < size; x++) {

        for (int space = 0; space < size - x - 1; space++) {
                System.out.print(" ");
            }
        for (int columns = 0; columns <= x; columns++) {
                System.out.print("#");
            }
            System.out.print("  ");
        for (int columns = 0; columns <= x; columns++) {
                System.out.print("#");
            }
        System.out.print("\n");
        }
    }
}
