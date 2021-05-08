package cp;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class BUGLIFE {
    HashMap<Integer, ArrayList<Integer>> graph;
    int [] edge;
    int cycle;
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        graph = new HashMap<>();
        edge = new int[n+1];
        for(int i = 1;i<=n;i++){
            ArrayList<Integer> al = new ArrayList<>();
            graph.put(i,al);
        }
        while(m-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            ArrayList<Integer> l = graph.get(a);
            ArrayList<Integer>k = graph.get(b);
            l.add(b);
            k.add(a);
        }
//        System.out.println("hai");
        int visited[] = new int[n+1];


        for (int i = 1; i <= n; i++) {
            cycle = 0;
            if(visited[i]==0)
                dfs(-1,i,visited);
            if(cycle%2!=0){
                System.out.println("Scenario #"+testNumber+":");
                System.out.println("Suspicious bugs found!");
                return;
            }
        }
        System.out.println("Scenario #"+testNumber+":");
        System.out.println("No suspicious bugs found!");
    }

    private int dfs(int parent, int source, int[] visited) {
        visited[source] = 1;
        for(Integer e:this.graph.get(source)){
            if(visited[e] == 0){
                edge[e]=source;
                dfs(source,e,visited);
            }
            else if(e!=parent){
                for(int x = source; x!=0 && x!=e; x=edge[x]){
                    cycle++;
                }
                cycle++;
            }
        }
        return cycle;
    }


}
