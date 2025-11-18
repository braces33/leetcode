public class landlenth {
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0},{0,1,1,0,0},{1,1,1,1,1},{0,1,1,1,0},{0,1,1,1,1}};
        
        int rows = 5; 
        int cols = 5; 
        
        int totalOnes = 0; 
        int sharedSides = 0; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) { 
                if (grid[i][j] == 1) {
                    totalOnes++; 
                    if (j + 1 < cols && grid[i][j + 1] == 1) {
                        sharedSides++;
                    }
                    if (i + 1 < rows && grid[i + 1][j] == 1) {
                        sharedSides++;
                    }
                }
            }
        }
        
        int perimeter = (totalOnes * 4) - (sharedSides * 2);
        
        System.out.print("島嶼周長為: " + perimeter); 
    }
}
