package chapter11;

/**
 * Created by Артем on 05.08.2016.
 */
public class Matrix {
    private int row;
    private int col;
    private int[][] matrix;

    public Matrix(){}

    public int getRow() {
        return row;
    }

    public void setRow(int value) throws Exception{
        try {
            if (value <= 0){
                throw new IllegalArgumentException();
            } else
            this.row = value;
        } catch (Exception e) {
            System.out.println("ERROR!\nInvalid argument of row");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public int getCol() {
        return col;
    }

    public void setCol(int value) throws Exception{
        try {
            if (value <= 0){
                throw new IllegalArgumentException();
            } else
                this.col = value;
        } catch (Exception e) {
            System.out.println("ERROR!\nInvalid argument of column") ;
            e.printStackTrace();
            System.exit(1);
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int row, int col) {
        this.matrix = new int[row][col];
    }
}
