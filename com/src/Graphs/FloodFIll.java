package Graphs;

public class FloodFIll {
    static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int[][] result = floodFill(image,1,1,2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int initialColor = image[sr][sc];

        dfs(image,sr,sc,color,initialColor, m,n);

        return image;
    }
    static void dfs(int[][] image , int sr, int sc , int color,
                    int initialcolor , int m , int n){
        if(sr<0 || sr>=m || sc<0 || sc>=n ) return;
        if(image[sr][sc]==initialcolor && image[sr][sc]!=color){
            image[sr][sc]=color;
            dfs(image,sr+1,sc,color,initialcolor,m,n);
            dfs(image,sr-1,sc,color,initialcolor,m,n);
            dfs(image,sr,sc+1,color,initialcolor,m,n);
            dfs(image,sr,sc-1,color,initialcolor,m,n);
        }

    }
}
