package pl.programujodpodstaw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tabeli liczb: ");
        int firstArraySize = scanner.nextInt();

        int[] firstArray = new int[firstArraySize];
        int[] secondArray = new int[firstArray.length];

        System.out.println("Podaj liczby do tabeli: ");
        for (int i = 0; i< firstArray.length; i++){
            firstArray[i] = scanner.nextInt();
        }

        int multi = 1;

        for (int i = 0; i< firstArray.length; i++){
            for (int numberToCheck : firstArray) {
                if (firstArray[i] != numberToCheck) {
                    multi *= numberToCheck;
                }
            }
            secondArray[i] = multi;
            multi = 1;
        }

        for (int number : secondArray){
            System.out.print(number + " ");
        }
    }
}