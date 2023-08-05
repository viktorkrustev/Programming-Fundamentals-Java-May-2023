import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        Random randomWord = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rndIndex1 = randomWord.nextInt(arr.length);
            int rndIndex2 = randomWord.nextInt(arr.length);
            String temp = arr[rndIndex1];
            arr[rndIndex1] = arr[rndIndex2];
            arr[rndIndex2] = temp;


        }
        for(String el:arr){
            System.out.println(el);
        }
    }
}
