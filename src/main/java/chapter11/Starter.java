package chapter11;

import java.util.Scanner;

/**
 * Created by Артем on 02.08.2016.
 */
public class Starter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Writer w = new Writer();
        Stop:
        for (; ; ) {
            System.out.println("Please, choose one:\n\t1. create matrix;\n\t2. show matrix;\n\t3. multiply matrix;\n\t4. exit;");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    w.createMatrix();
                }
                break;
                case 2: {
                    w.printMatrix(w.mtrx.getMatrix());
                }
                break;
                case 3: {
                    w.multiply(w.mtrx.getMatrix(),w.mtrx.getMatrix());
                }
                break;
                case 4:  break Stop;

                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}
