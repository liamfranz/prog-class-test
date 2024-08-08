package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] elements = {10,5,20,25,29,27,22,12,8};


        for (int a = 0; a < elements.length - 1; ++a) {
            for (int b = 0; b < elements.length - 1; ++b)
                if (elements[b] > elements[b + 1]) {
                    int temp = elements[b];
                    elements[b] = elements[b + 1];
                    elements[b + 1] = temp;
                    System.out.println(Arrays.toString(elements));
                }
        }
    }
}
