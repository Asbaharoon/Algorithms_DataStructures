package MazeSolver;

public class MazeSolver {

    private int[][] mazeMap;
    private boolean[][] visited;
    private int startPositionCol;
    private int startPositionRow;

    public MazeSolver(int[][] mazeMap, int startPositionRow, int startPositionCol) {
        this.mazeMap = mazeMap;
        this.visited = new boolean[mazeMap.length][mazeMap.length];
        this.startPositionCol = startPositionCol;
        this.startPositionRow = startPositionRow;
    }

    public void findWayOut() {
        try {
            dfs(startPositionRow, startPositionCol);
            System.out.println("No solution found");
        } catch (RuntimeException e) {
            System.out.println("Route found to Exit!");
        }
    }

    public void dfs (int rowIndex, int colIndex) {
        System.out.println("Visiting i = " + rowIndex + ", j = " + colIndex);

        if (this.mazeMap[rowIndex][colIndex] == 3) {
            throw new RuntimeException(); //todo If we have found the 3 "exit" we break out of
            //todo                          iteration with an exception
        }
        int endOfMap = this.mazeMap.length - 1; //todo -1 because index starts at 0

        if (visited[rowIndex][colIndex]) { //todo If it has already been visited, just skip it
            return;
        } else if (rowIndex < 0 || rowIndex >= endOfMap) {//todo Out of Map, so disregard, e.g. index 100 does not exist
            return;
        } else if (colIndex < 0 || colIndex >= endOfMap) {//todo Out of Map, so disregard, e.g. index 100 does not exist
            return;
        } else if (this.mazeMap[rowIndex][colIndex] == 1) {//todo If it is a wall, we cannot go in that direction
            return;
        } else {
            this.visited[rowIndex][colIndex] = true; //todo Set the current position to visited

            dfs(rowIndex + 1, colIndex); //todo Going Down
            dfs(rowIndex, colIndex - 1); //todo Going left
            dfs(rowIndex, colIndex + 1); //todo Going Right
            dfs(rowIndex - 1, colIndex); //todo Going Up
        }
    }
}
