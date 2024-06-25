class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int n= image.length;
        int m= image[0].length;

        int ans[][]= image;

        int[] drow= {-1, 0, 1, 0};
        int[] dcol= {0, 1, 0, -1};
        int initialColor = image[sr][sc];

        dfs(image, sr, sc, drow, dcol, ans, initialColor, color);

        return ans;
        
    }

    public static void dfs(int[][] image, int row, int col, int[] drow, int[] dcol, int[][] ans, int initialColor, int color)
    {
        for(int i=0; i<4; i++)
        {

            ans[row][col]= color;

            int  nrow = row + drow[i]; 
             int ncol = col + dcol[i];

            if(nrow>=0 && nrow< image.length && ncol >=0 && ncol< image[0].length && image[nrow][ncol]== initialColor && ans[nrow][ncol] != color)
            {
                
                dfs(image, nrow, ncol, drow, dcol, ans, initialColor, color);
            }
        }
    }
}