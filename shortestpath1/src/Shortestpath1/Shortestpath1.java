/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shortestpath1;

/**
 *
 * @author TAHSHIN
 */
import java.util.*;

public class Shortestpath1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        int connections = scanner.nextInt();
        int x = scanner.nextInt();
        int queries = scanner.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> weights = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i <= nodes; i++) {
            edges.add(new ArrayList<Integer>());
            weights.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < connections; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int weight = scanner.nextInt();
            edges.get(from).add(to);
            weights.get(from).add(weight);
        }
        
        for (int i = 1; i <= queries; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int cost = 0;
            if (source != x) {
                cost += getMinimumDistance(edges, weights, source, x);
            }
            if (destination != x) {
                cost += getMinimumDistance(edges, weights, x, destination);
            }
            System.out.println("Case " + i + ":");
            System.out.println(cost);
        }
    }

    private static int getMinimumDistance(ArrayList<ArrayList<Integer>> edges, ArrayList<ArrayList<Integer>> weights, int source, int destination) {
        boolean[] visited = new boolean[edges.size()];
        int[] cost = new int[edges.size()];
        
        for (int i = 1; i < edges.size(); i++) {
            visited[i] = false;
            cost[i] = -1;
        }
        
        cost[source] = 0;
        while (!visited[destination]) {
            int nextNode = getNextNodeIndex(visited, cost);
            visited[nextNode] = true;
            for (int i = 0; i < edges.get(nextNode).size(); i++) {
                int edgeTo = edges.get(nextNode).get(i);
                int weight = weights.get(nextNode).get(i);
                if (!visited[edgeTo]) {
                    if (cost[edgeTo] == -1 || cost[edgeTo] > cost[nextNode] + weight) {
                        cost[edgeTo] = cost[nextNode] + weight;
                    }
                }
            }
        }
        return cost[destination];
    }

    private static int getNextNodeIndex(boolean[] visited, int[] cost) {
        int node = -1;
        int currentCost = -1;
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i] && cost[i] != -1 && (currentCost == -1 || cost[i] < currentCost)) {
                node = i;
                currentCost = cost[i];
            }
        }
        return node;
    }
}
