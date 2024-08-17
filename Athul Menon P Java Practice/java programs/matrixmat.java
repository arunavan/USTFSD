public class matrixmat {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 3},{1, 2}};
        int[][] matrix2 = {{2, 4},{2, 1}};
        int[][] product = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
            }
        }
        System.out.println("Product of the matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
