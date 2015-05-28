import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Logic logic = new Logic();
        Matrix matrix = new Matrix();

        System.out.print("Enter the number of rows = ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("Enter the number of columns = ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Enter the number for sorting columns = ");
        int a = Integer.parseInt(reader.readLine());

        int[][] arr = matrix.genMatrix(m, n);
        matrix.showMatrix(arr);

        System.out.println();
        matrix.showDimensionalMatrix(logic.sortDimArr(logic.createDimArr(arr, 0)));

    }
}
