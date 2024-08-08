package org.example;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] elements = {20,5,15,10,3,17,7};
        int a = 1;
        while (a < elements.length) {
            int temp = elements[a];
            int b = a - 1;
            while (b >= 0 && elements[b] > temp) {
                elements[b + 1] = elements[b];
                --b;
            }
            elements[b + 1] = temp;
            ++a;
            System.out.println(Arrays.toString(elements));
        }
    }
}

