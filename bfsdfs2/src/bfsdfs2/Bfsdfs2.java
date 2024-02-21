/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfsdfs2;

/**
 *
 * @author TAHSHIN
 */
import java.util.*;

public class Bfsdfs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner object for getting input.
        Scanner scanner = new Scanner(System.in);

        // Get the number of positions and connections from the input.
        int positions = scanner.nextInt();
        int connections = scanner.nextInt();

        // We stores the graph of positions, and connections as an adjacency list.
        // Each position has an array positions, that is connected to the current position.
        // We initialize this list for each position as the empty list.
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < positions; i++) {
            graph.add(new ArrayList<>());
        }

        // Get the connections from input, and populate the graph.
        for (int i = 0; i < connections; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        // Get Lina's position from input.
        int linaPosition = scanner.nextInt();

        // Get Nora's position from input.
        int noraPosition = scanner.nextInt();

        // Get Lara's position from input.
        int laraPosition = scanner.nextInt();

        // Calculate the minimum distance between Nora and Lina
        int distanceNoraLina = getMinimumDistance(graph, noraPosition, linaPosition);

        // Calculate the minimum distance between Lara and Lina
        int distanceLaraLina = getMinimumDistance(graph, laraPosition, linaPosition);

        // Checking who can reach Lina first, and printing the result.
        if (distanceNoraLina < distanceLaraLina) {
            System.out.println("Nora");
        } else if (distanceNoraLina == distanceLaraLina) {
            System.out.println("both");
        } else {
            System.out.println("Lara");
        }
    }

    private static int getMinimumDistance(ArrayList<ArrayList<Integer>> graph, int start, int end) {
        // Stores the distance from start position to each position
        // in the graph.
        //
        // This is initialized with -1 for each position, which signifies
        // that the position has not been visited from the start position.
        int[] distance = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            distance[i] = -1;
        }

        // We will use BFS technique to find the minimum distance
        // to each position in the graph. The BFS is started from the
        // start position and the distance for the start position is
        // marked as 0.
        Queue<Integer> bfs_queue = new LinkedList<>();
        bfs_queue.add(start);
        distance[start] = 0;

        // We continue the BFS until the queue is empty.
        while (!bfs_queue.isEmpty()) {
            // We poll the queue to get the next position visited.
            Integer currentPosition = bfs_queue.poll();

            // If the next position is the end position,
            // we return the distance for the end position.
            if (currentPosition == end) {
                return distance[currentPosition];
            }

            // Else, we iterate over all the positions that are connected
            // to the current position, and if any of the positions
            // has not been yet visited (i.e has a distance marked as -1)
            // we add the position to the queue, and set the distance of the
            // new position as 1 more than the distance to the current position.
            for (Integer nextPosition : graph.get(currentPosition)) {
                if (distance[nextPosition] == -1) {
                    distance[nextPosition] = distance[currentPosition] + 1;
                    bfs_queue.add(nextPosition);
                }
            }
        }

        return -1;
    }

}
