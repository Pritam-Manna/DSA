class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int ans = 0;

        for(int i=0; i<rowLen-2; i++){
            for(int j=0; j<colLen-2; j++){
                if(isMagicSquare(grid, i, j)){
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean isMagicSquare(int [][] grid, int i, int j){
        boolean [] duplicate = new boolean [15];
        int num;
        for(int m=i; m<=i+2; m++){
            for(int n=j; n<=j+2; n++){
                num = grid[m][n];
                if(num <1 || num>9 || duplicate[num]){
                    return false;
                }
                duplicate[num] = true;
            }
        }
        int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];

        for(int m=i+1; m<=i+2; m++){
            if(sum != grid[m][j] + grid[m][j+1] + grid[m][j+2]){
                return false;
            }
        }
        for(int n=j; n<=j+2; n++){
            if(sum != grid[i][n] + grid[i+1][n] + grid[i+2][n]){
                return false;
            }
        }

        //
        int sum1 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
        int sum2 = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];

        if(sum1 == sum2){
            return true;
        }
        return false;
    }
}

/*
[
[4,7,8]
[9,5,1]
[2,3,6]
]
/*