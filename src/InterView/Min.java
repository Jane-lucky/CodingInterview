package InterView;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] t = new int[b][b];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[i][j] = in.nextInt();
            }
        }
        int count = 1;
        int min = t[0][0];
        int p=0;
        int q=0;
        if (a == 1) {
            System.out.print(t[0][0]);
            return;
        }
        while (count < a) {
            if (t[p][q + 1] >= t[p + 1][q]) {
                q += 1;
                min = t[p][q];
                count++;
            } else {
                p+=1;
                min=t[p][q];
                count++;
            }
        }
        System.out.print(min);
    }
}
