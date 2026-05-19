📌Project Overview
A graph is a data structure consisting of vertices (Vertex) and edges (Edge).
In this project, the graph is represented using an adjacency list.
I implemented two traversal algorithms:

Breadth-First Search (BFS) — level-order traversal using a queue.
Depth-First Search (DFS) — depth exploration using recursion or a stack.

📌 Class Descriptions
Vertex — stores a unique identifier for each node.
Edge — stores the start and end of a connection
Graph — implements the adjacency list, methods for adding vertices and edges, and BFS/DFS traversals.
Experiment — runs traversals and measures execution time.
Main — creates graphs of different sizes (10, 30, 100 vertices), runs experiments, and prints results.

📌 Algorithm Descriptions
BFS
Uses a queue.
Traverses the graph level by level.
Best for shortest path search.
Time complexity: O(V + E).
Space complexity: O(V) (queue).

DFS
Uses recursion or a stack.
Goes deep until no unvisited neighbors remain.
Best for topological sorting, connectivity checks.
Time complexity: O(V + E)
Space complexity: O(V) (stack depth).

📌 Experimental Results
Traversal Order (small graph, 10 vertices)
Код
BFS: 1 2 3 4 ...
DFS: 1 2 3 4 ...
Execution Time Comparison
| Graph size| BFS time (ns) | DFS time (ns) | 
| --- | --- | --- | 
| 10 vertices | 88,600 | 162,600 |
| 30 vertices | 505,100 | 472,900 | 
| 100 vertices | 2,324,200 | 2,470,300 |


Observations:
Runtime grows linearly with graph size, matching O(V + E).
BFS and DFS show similar performance
BFS is slightly faster on small graphs, DFS sometimes on medium graphs.


📌 Reflection
During this project I:
Learned how to implement a graph using an adjacency list.
Practiced BFS and DFS and observed their differences.
Confirmed that both algorithms match the theoretical complexity O(V + E).
Faced challenges in organizing code and measuring execution time, solved using System.nanoTime().

Conclusion:
BFS is better for shortest path problems.
DFS is better for depth exploration and structural analysis.

📌 Defense Q&A Cheat Sheet
What is a graph? → A set of vertices and edges, represented here by an adjacency list.
Difference between BFS and DFS? → BFS uses a queue, DFS uses recursion/stack. BFS = level order, DFS = depth order.
Complexity? → Both are O(V + E).
When to use BFS? → Shortest path, level-order traversal.
When to use DFS? → Depth exploration, connectivity, topological sorting.
Why adjacency list? → Memory-efficient and fast for sparse graphs.
What does your table show? → Linear runtime growth, confirming theory.
