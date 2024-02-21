/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpath2;

/**
 *
 * @author TAHSHIN
 */
import java.util.*;

public class Shortestpath2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        int connections = scanner.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<ArrayList<Integer>> weights = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            edges.add(new ArrayList<>());
            weights.add(new ArrayList<>());
        }
        for (int i = 0; i < connections; i++) {
            String connection = scanner.next();
            String[] connectionSplits = connection.split(",");
            Integer from = Integer.valueOf(connectionSplits[0]);
            Integer to = Integer.valueOf(connectionSplits[1]);
            Integer weight = Integer.valueOf(connectionSplits[2]);
            edges.get(from).add(to);
            weights.get(from).add(weight);
        }
        int source = scanner.nextInt();
        int destination = scanner.nextInt();
        String repairNodes = scanner.next();
        boolean[] isInRepair = new boolean[nodes];
        boolean[] visited = new boolean[nodes];
        int[] cost = new int[nodes];
        int[] parent = new int[nodes];
        for (int i = 0; i < nodes; i++) {
            isInRepair[i] = false;
            visited[i] = false;
            cost[i] = -1;
            parent[i] = -1;
        }
        String[] repairNodesSplits = repairNodes.split(",");
        for (String repairNode : repairNodesSplits) {
            isInRepair[Integer.valueOf(repairNode)] = true;
        }
        cost[source] = 0;
        while (!visited[destination]) {
            int nextNode = getNextNodeIndex(visited, cost);
            visited[nextNode] = true;
            for (int i = 0; i < edges.get(nextNode).size(); i++) {
                int edgeTo = edges.get(nextNode).get(i);
                int weight = weights.get(nextNode).get(i);
                if (!visited[edgeTo] && !isInRepair[edgeTo]) {
                    if (cost[edgeTo] == -1 || cost[edgeTo] > cost[nextNode] + weight) {
                        cost[edgeTo] = cost[nextNode] + weight;
                        parent[edgeTo] = nextNode;
                    }
                }
            }
        }
        ArrayList<String> path = new ArrayList<>();
        int currentNode = destination;
        while (currentNode != -1) {
            path.add(locations[currentNode]);
            currentNode = parent[currentNode];
        }
        for (int i = path.size() - 1; i >= 0; i--) {
            if (!path.get(i).equals(locations[source])) {
                System.out.print("->");
            }

            System.out.print(path.get(i));
        }
        System.out.println("");
        System.out.println("Path cost: " + cost[destination]);

    }
    private static String[] locations = {"Mouchak", "Panthapath", "Rampura", "Shahahbagh", "Dhanmondi", "Lalmatia", "Badda", "Hatirjheel", "Nilkhet", "TSC", "Dhaka University", "BUET",};

    private static int getNextNodeIndex(boolean[] visited, int[] cost) {
        int node = -1;
        int currentCost = -1;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && cost[i] != -1 && (currentCost == -1 || cost[i] < currentCost)) {
                node = i;
                currentCost = cost[i];
            }
        }
        return node;
    }
}
