import java.util.Arrays;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        // 2 Dimensional Array
        int[][] array1 = new int[2][3];
        array1[0][0]=1;
        System.out.println(Arrays.deepToString(array1));

        // 3 Dimensional Array
        int[][][] array2 = new int[3][3][3];
        System.out.println(Arrays.deepToString(array2));

        int[][] array3 = { {1 , 2 , 3 } , {4 , 5 , 6} };
        System.out.println(Arrays.deepToString(array3));
    }
    
}
