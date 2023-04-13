package ru.maritariny;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {

        /*6 5
        5 10 8 4 7 2
        3 1 11 18 9*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = reader.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        parts = reader.readLine().split(" ");
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }
        parts = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());
        int min = Math.min(a.length, b.length);
        Integer result = 0;
        for (int i = 0; i < min; i++) {
            if ((b[i] - a[i]) < 0) {
                break;
            }
            result = result + (b[i] - a[i]);
        }
        System.out.println(result);

        reader.close();
    }
}
