import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] massiveInt = new int[3];
        massiveInt[0] = 1;
        massiveInt[1] = 2;
        massiveInt[2] = 3;

        double[] massiveDouble = {1.57, 7.654, 9.986};

        short[] massiveShort = {1, 2, 3, 4, 5};

        System.out.println("Задание 2");
        System.out.print(massiveInt[0] + ", " + massiveInt[1] + ", " + massiveInt[2]);
        //for (int index = 0;index < massiveDouble.length; index++);
        System.out.println();
        System.out.print(massiveDouble[0] + ", " + massiveDouble[1] + ", " + massiveDouble[2]);
        System.out.println();
        for (int s = 0; s < massiveShort.length; s++) {
            System.out.print(massiveShort[s]);
            if (s < 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 3");
        for (int i = massiveInt.length - 1; i >= 0; i--) {
            System.out.print(massiveInt[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int d = massiveDouble.length - 1; d >= 0; d--) {
            System.out.print(massiveDouble[d]);
            if (d > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int p = massiveShort.length - 1; p >= 0; p--) {
            System.out.print(massiveShort[p]);
            if (p > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("задание 4");

        for (int h = 0; h < massiveInt.length; h++) {
            if (massiveInt[h] % 2 != 0) {
                massiveInt[h] ++;
            }
            System.out.print(massiveInt[h] + " ");
                //System.out.print(massiveInt[h] + " ");
                //} if (massiveInt[h] % 2 != 0) {
                //    System.out.print(massiveInt[h] + 1 + " ");
                //}
        }
    }
}