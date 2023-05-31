package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(summe(2, 3));
        System.out.println(summe2(2, 3));
        System.out.println(fakultyFor(7));
        System.out.println(fakultyWhile(7));

       // scannerSumme();
    }
    public static int addition(int x, int y){
        return x+y;
    }
    public static String summe(int x, int y){
        return "Summe: " + (x+y);
    }
    public static String summe2(int x, int y){
        return String.format("Summe: %d + %d = %d",x, y, (x+y));
    }
    public static String fakultyFor(int x){
        int f = 1;
        for(int i=1;i<=x;i++){
            f = f * i;
        }
        return String.format("For: Die Fakulät von %d ist: %d" ,x,f);
    }
    public static String fakultyWhile(int x){
        int f=1, count=1;
        while(count<=x){
            f=f * count;
            count++;
        }
        return String.format("While: Die Fakulät von %d ist: %d" ,x,f);
    }
    public static void scannerSumme(){
        int number1=0, number2=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe die erste Zahl ein:");
        if(scanner.hasNextInt())
            number1 = scanner.nextInt();
        System.out.print("Bitte gebe die zweite Zahl ein:");
        if(scanner.hasNextInt())
            number2 = scanner.nextInt();
        System.out.println(summe2(number1, number2));
    }
}