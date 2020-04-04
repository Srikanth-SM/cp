package codes;

import java.util.Scanner;
import java.io.PrintWriter;

public class ALotOfCars {
    public int visited [][];
    int totalCars;
    public char [][] grid;
    int carCount;
    int pathCount;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int row = Integer.parseInt(in.next());
        int col = Integer.parseInt(in.next());
        int minCount = Integer.MAX_VALUE;

        visited = new int[row+1][col+1];
        totalCars = 0;
        grid = new char[row+1][col+1];


        for(int i=1;i<=row;i++){
            for (int j = 1; j <= col ; j++) {
                char p = in.next().charAt(0);
                if(p=='P'){
                    totalCars++;
                }
                grid[i][j] = p;
            }
        }

        for (int i = 1; i <= row ; i++) {

            for (int j = 1; j <= col ; j++) {
                int pathCount = dfs(i,j,0,0);
                if(minCount>pathCount){
                    pathCount = minCount;
                }
            }
            System.out.println(carCount+" "+pathCount);
        }

        System.out.println("srikanth "+minCount+" "+totalCars);

    }

    private int dfs(int i, int j,int pathCount, int carCount) {
        if(carCount == totalCars){
            return pathCount;
        }
        if(isValid(i,j) && visited[i][j]==0){
            visited[i][j]=1;
            if(grid[i][j]=='P'){
                carCount++;
            }
            System.out.println(" At "+i+" "+j+" carcount "+carCount);
            int pp = 1+dfs(i+1,j,pathCount,carCount);
            int qq = i%2==0?1+dfs(i,j-1,pathCount,carCount):1+dfs(i,j+1,pathCount,carCount);
            System.out.println(" At "+i+" "+j+" pp "+pp+" qq "+qq+" carcount "+carCount);
            visited[i][j]=0;
            return Math.min(pp,qq);

        }
        System.out.println(" pos "+i +" "+j+" invalid return");
        return 0;




    }

    private boolean isValid(int i, int j) {

        return i>=1 && i<grid.length &&
                j>=1 && j<grid[i].length;


    }

}
