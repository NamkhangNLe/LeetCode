class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            dfs(image, sr, sc, color, image[sr][sc]);   
        }
        return image;
    }
    public void dfs(int[][] image, int x, int y, int color, int oldColor) {
        if (x < 0 || y < 0 || x >= image.length || y >= image[0].length || image[x][y] != oldColor) {
            return;
        }
        image[x][y] = color;
        dfs(image, x + 1, y, color, oldColor);
        dfs(image, x - 1, y, color, oldColor);
        dfs(image, x, y + 1, color, oldColor);
        dfs(image, x, y - 1, color, oldColor);
    }
}
