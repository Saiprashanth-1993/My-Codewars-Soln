package main.java.morgan.stanley;

import java.util.*;

class SolutionLexDFS {
static boolean visited[];
static Vector<Vector> adj = new Vector<Vector>();
static List lexoDFS = new ArrayList<>();
/*
* Complete the 'lexdfs' function below.
*
* The function is expected to return an INTEGER_ARRAY.
* The function accepts following parameters:
* 1. UNWEIGHTED_INTEGER_GRAPH g
* 2. INTEGER_ARRAY r
* 3. INTEGER_ARRAY v
*/

/*
 * For the unweighted graph, <name>:
 *
 * 1. The number of nodes is <name>Nodes.
 * 2. The number of edges is <name>Edges.
 * 3. An edge exists between <name>From[i] and <name>To[i].
 *
 */
//Function to add an edge
static void insertEdges(int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
}

static List<Integer> dfs(int src) {
    lexoDFS.add(src);
    visited[src] = true;
    //Iterate overall edges connected to the vertex
    for (int i = 0; i < adj.get(src).size(); i++) {
        if (!visited[(int) adj.get(src).get(i)])
            dfs((int) adj.get(src).get(i));

    }
    return lexoDFS;
}

public static List<Integer> lexdfs(int gNodxes, List<Integer> gFrom, List<Integer> gTo, List<Integer> r, List<Integer> v) {
    visited = new boolean[gNodxes + 1];
    List<Integer> lexoDFS = null;

    for (int i = 0; i < gNodxes + 1; i++) {
        adj.add(new Vector<>());
    }
    //insert the edges to the graph
    for (int i = 0; i < gFrom.size(); i++) {
        insertEdges(gFrom.get(i), gTo.get(i));
    }
    // Sorting in ascending order
    for (int i = 0; i < gNodxes; i++) {
        Collections.sort(adj.get(i));
    }
    for (int i = 0; i < gNodxes; i++) {
        if (!visited[i])
            lexoDFS = dfs(i);
    }
    //getting query results
    return lexoDFS;
}

// Driver code
public static void main(String args[]) {
    List<Integer> gFrom = new ArrayList<>();
    gFrom.add(0);
    gFrom.add(3);
    gFrom.add(1);
    gFrom.add(0);
    gFrom.add(1);
    gFrom.add(2);
    List<Integer> gTo = new ArrayList<>();
    gTo.add(3);
    gTo.add(4);
    gTo.add(2);
    gTo.add(1);
    gTo.add(3);
    gTo.add(4);

    List<Integer> r = new ArrayList<>();
    r.add(0);
    r.add(3);
    r.add(2);
    r.add(1);
    List<Integer> v = new ArrayList<>();
    r.add(1);
    r.add(4);
    r.add(4);
    r.add(2);
    System.out.println(lexdfs(5, gFrom, gTo, r, v));
}
}
