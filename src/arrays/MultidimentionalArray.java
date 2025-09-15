package arrays;

public class MultidimentionalArray {
    public static void main(String[] args) {
        // int[] 1Darr = new int[5]

        int[][] table = new int[][]{
                {1,175,19},
                {2,180,18},
                {3,176, 20},
                {4, 177, 17},
                {5, 178, 17},
        };
        for(int i = 0; i < table.length; i++) {
            for(int j = 0 ; j <table[0].length ; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
        for(int[] row : table) {
            for(int col  : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
