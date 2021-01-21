package eu.senla.task2;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Red-1, Orange-2, Yellow-3, Green-4, Blue-5, Indigo-6, Violet-7");
        System.out.print("Enter number of rainbow colors : ");
        int colors = scanner.nextInt();

        switch (colors){
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
        }
        String[] mixColors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        System.out.println("Mix your rainbow colors");
        System.out.print("Color one : ");
        int color1 = scanner.nextInt()-1;
        System.out.print("Color to : ");
        int color2 = scanner.nextInt()-1;
        if (color1==color2) {
            System.out.println("Same color : "+mixColors[color1]);
        }else {
            System.out.println(mixColors[color1]+" "+mixColors[color2]);
        }



    }

}