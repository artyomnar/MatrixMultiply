package chapter11;

import java.util.Scanner;

/**
 * Created by Артем on 05.08.2016.
 */
public class Writer {
    private Matrix mtrx = new Matrix();
    private Scanner in = new Scanner(System.in);
    private int[][] A;

    public Matrix getMtrx() {
        return mtrx;
    }

    public int[][] createMatrix(String titile) throws Exception {
        System.out.println(titile);
        System.out.println("Enter number of rows:");
        mtrx.setRow(in.nextInt());
        System.out.println("Enter number of columns:");
        mtrx.setCol(in.nextInt());
        System.out.println("Enter interval value+-:");
        int value = in.nextInt();
        mtrx.setMatrix(mtrx.getRow(),mtrx.getCol());
        for (int i = 0; i < mtrx.getRow(); i++) {
            for (int j = 0; j < mtrx.getCol() ; j++) {
                mtrx.getMatrix()[i][j] =  -value+(int)(Math.random()*((value + value)+1));
            }
        }
        return mtrx.getMatrix();
    }

    public void printMatrix(String title,int[][] matrix){
        System.out.println(title);
        for (int i = 0; i < mtrx.getRow(); i++) {
            for (int j = 0; j < mtrx.getCol(); j++) {
                System.out.print(mtrx.getMatrix()[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] multiply(int [][] x, int [][] y) throws Exception {
        Writer a = new Writer();
        Writer b = new Writer();
        a.createMatrix("Matrix A:");
        a.printMatrix("Matrix A",mtrx.getMatrix());
        b.createMatrix("Matrix B:");
        b.printMatrix("Matrix B",mtrx.getMatrix());
        A = new int[a.mtrx.getRow()][b.mtrx.getCol()];
        try {
            if (a.mtrx.getCol() == b.mtrx.getRow()) {
                for (int i = 0; i < a.mtrx.getRow(); i++) {
                    for (int j = 0; j < b.mtrx.getCol(); j++)
                        for (int k = 0; k < b.mtrx.getRow(); k++) {
                            A[i][j] += a.mtrx.getMatrix()[i][k] * b.mtrx.getMatrix()[k][j];
                        }
                }
                printMatrix("Matrix C = A*B",A);
                }
                else throw new Exception();
            }catch(Exception e){
                System.out.println("Error!\nThe value of 1st matrix's col - must be equals of the 2nd matrix row");
                e.printStackTrace();
                System.exit(1);
            }
            return A;
    }
}
