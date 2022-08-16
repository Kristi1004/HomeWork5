public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] weight = new int[3];
        weight[0] = -1;
        weight[1] = 2;
        weight[2] = 3;
        double[] weights = {-1.57, 7.654, 9.986};
        byte[] weight1 = {2, 4, 6};

        //Задача 2
        for (int i = 0; i <= weight.length - 1; i++) {
            if (i == weight.length - 1)
                System.out.print(weight[i]);
            else
                System.out.print(weight[i] + ",");
        }
        System.out.println();

        for (int a = 0; a <= weights.length - 1; a++) {
            if (a == weights.length - 1)
                System.out.print(weights[a]);
            else
                System.out.print(weights[a] + ",");
        }
        System.out.println();

        for (int b = 0; b <= weight1.length - 1; b++) {
            if (b == weight1.length - 1)
                System.out.print(weight1[b]);
            else
                System.out.print(weight1[b] + ",");
        }
        System.out.println();

        //Задача 3

        for (int c = weight.length - 1; c >= 0; c--) {
            if (c == 0)
                System.out.print(weight[c]);
            else
                System.out.print(weight[c] + ",");
        }
        System.out.println();

        for (int d = weights.length - 1; d >= 0; d--) {
            if (d == 0)
                System.out.print(weights[d]);
            else
                System.out.print(weights[d] + ",");
        }
        System.out.println();

        for (int e = weight1.length - 1; e >= 0; e--) {
            if (e == 0)
                System.out.print(weight1[e]);
            else
                System.out.print(weight1[e] + ",");
        }
        System.out.println();

        //Задача 4

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
                System.out.print(weight[i] + " ");
            }
        }
    }









