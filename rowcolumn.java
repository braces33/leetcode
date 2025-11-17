public class rowcolumn {
    public static void main(String[] args) {
        int[][] array1 = new int[4][4]; 
        int[][] array2 = new int[4][4];
        
        //row major
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { 
                array1[i][j] = i * 2 + j * 1;
                System.out.print(" " + array1[i][j]);
            }
            System.out.println(); 
        }
        
        System.out.println(); 
        
        // column major
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 4 ; j++ ){
                array2[j][i] = i * 1 +j * 2;
                System.out.print(" "+array2[j][i]);
            }
            System.out.println();
        }
    }
}
