package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Highways {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        HashMap<Integer,ArrayList<Integer>> grid = new HashMap<>();
        int i = 0;
        while(i<n-1){
            int a = in.nextInt();
            int b = in.nextInt();
            --a;--b;
           if(grid.get(a)==null)grid.put(a,new ArrayList<>());
           if(grid.get(b)==null)grid.put(b,new ArrayList<>());
           grid.get(a).add(b);
           grid.get(b).add(a);
            i++;
        }

        int [] visited = new int[n];
        int [] distance = new int[n];
        dfs(0,grid,visited,distance,0);
        int max = -1;
        int k = -1;
        for (int j = 0; j < n; j++) {
            if(distance[j] >= max){
                max = distance[j];
                k = j;
            }
        }
        Arrays.fill(distance,0);
        Arrays.fill(visited,0);

        dfs(k,grid,visited,distance,0);
        for (int j = 0; j < n; j++) {
            if(distance[j]>max){
                max = distance[j];
                k = j;

            }
        }
        System.out.println(max);

    }

    private void dfs(int source,HashMap<Integer,ArrayList<Integer>>grid,int[] visited,int []distance,int level) {
        visited[source]=1;
        distance[source]=level;
        ArrayList<Integer> list = grid.get(source);
        for (int i: list) {
            if(visited[i]==0){
                dfs(i,grid,visited,distance,level+1);
            }
        }
    }
}
