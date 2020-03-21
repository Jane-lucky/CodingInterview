package InterView;

import java.util.Deque;
import java.util.LinkedList;

public class MaxArea {
    public int maxAreaOfIsland(int[][] grid) {
        int MAX = 0;
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    MAX = Math.max(MAX,length(grid,i,j));
                }
            }
        }
        return MAX;
    }
    // 每次调用的时候默认num为1，进入后判断如果不是岛屿，则直接返回0，就可以避免预防错误的情况。
    // 每次找到岛屿，则直接把找到的岛屿改成0，这是传说中的沉岛思想，就是遇到岛屿就把他和周围的全部沉默。
    // ps：如果能用沉岛思想，那么自然可以用朋友圈思想。有兴趣的朋友可以去尝试。
    private int length(int[][] grid,int row,int col){
        if(row<0 || col<0 || row>=grid.length ||col>=grid[row].length || grid[row][col]==0){
            return 0;
        }
        grid[row][col] = 0;
        int num = 1;
        num +=length(grid,row+1,col);
        num +=length(grid,row-1,col);
        num +=length(grid,row,col+1);
        num +=length(grid,row,col-1);
        return num;
    }

//广度优先遍历，队列实现
    private int longMax(int[][] grid){
        int max = 0;
        Deque<int[]> queue = new LinkedList<>();
        int[][] movedIndexArray = {{-1,0},{1,0},{0,-1},{0,1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                queue.add(new int[]{i,j});//每次都入队
                //计算最大的面积
                int currMaxArea = 1;
                while (!queue.isEmpty()){
                    //如果队列不为空
                    int size = queue.size();//
                    for(int k = 0;k<size;k++){
                        int[] poll = queue.poll();
                        int currI = poll[0];
                        int currJ = poll[1];
                        if(currI<0 || currJ<0 || currI>=grid.length ||
                                currJ>=grid[currI].length || grid[currI][currJ] ==0){
                            continue;
                        }
                        currMaxArea++;
                        grid[currI][currJ] = 0;
                        for(int[] moveIndex:movedIndexArray){
                            queue.offer(new int[]{currI+moveIndex[0],currJ+moveIndex[1]});
                        }
                    }
                }
                max = Math.max(max,currMaxArea);
            }
        }
        return max;
    }

}
