package string;

import java.util.Scanner;

public class AchaLetra {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String str = scanner.nextLine().toUpperCase();
        char[] chars = str.toCharArray();
        int count = 0;
                System.out.println("A palavra: " + str);
        for(char caracter : chars) {
            if(caracter == 'A') {
                count++;
            }
        }
        System.out.println("contem " + count+ " letras 'A'.");
        scanner.close();
    }
}
