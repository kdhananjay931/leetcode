class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolour) {

        int colour = image[sr][sc];

        if(colour != newcolour){
            dfs(image, sr, sc, colour, newcolour);
        }

        return image;
        
    }
    public void dfs(int[][] image, int i, int j, int colour, int newcolour){
        // base condition;


        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j] != colour)
        {
            return;   // base condition
        }

        image[i][j] = newcolour;

        //checking four direction: 

        dfs(image, i-1, j, colour, newcolour);    // top
        dfs(image,  i, j+1, colour, newcolour);   //right
        dfs(image,  i+1, j, colour, newcolour);   // bottom
        dfs(image, i, j-1, colour, newcolour);     // left
    }

}