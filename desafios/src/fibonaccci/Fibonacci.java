package fibonaccci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1, n2 = 0, n3, avaliateNumber = 3;
        List<Integer> fibonacciNumbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            fibonacciNumbers.add(n3);
        }
        for (Integer n : fibonacciNumbers) {
            if(n == avaliateNumber) {
                System.out.println("O número "+n+" é Fibonacci");
            }
        }
    }
}
