// Dijkstra.java

// This class will call all methods from Edge, Path and Vertex.java

package dijkstra;
import java.util.List;

public class Dijkstra
{
 private static Path P;
 
  public static void main(String[] args)
  {
  // Creates all the custom vertices.
   Vertex v1 = new Vertex("Vertex 1");
   Vertex v2 = new Vertex("Vertex 2");
   Vertex v3 = new Vertex("Vertex 3");
   Vertex v4 = new Vertex("Vertex 4");
   Vertex v5 = new Vertex("Vertex 5");
        
   Vertex[] vertices = { v1, v2, v3, v4, v5 };

   // This displays the distances between each vertice, and every edge is the
   // way (distance) to each node with each value (weight)
   
    v1.adjacencies = new Edge[]{new Edge(v2, 5),
                                new Edge(v5, 12)};
        
    v2.adjacencies = new Edge[]{new Edge(v3, 3),
                                new Edge(v1, 4)};
        
    v3.adjacencies = new Edge[]{ new Edge(v4, 5),
                                new Edge(v2, 4)};
        
    v4.adjacencies = new Edge[]{ new Edge(v5, 2),
                                new Edge(v3, 4)};
        
    v5.adjacencies = new Edge[]{ new Edge(v1, 7),
                                new Edge(v4, 4)};
    
    // This Vertex will be starting vertex.
    Vertex Start = v1;
    
    // Defines the starting point for Paths within Path.java
    P.Paths(Start);
    
    System.out.println("From: " + Start);
    
    // For each loop: For each vertex amongst the predefined vertices,
    // Display the distance from Start to each other vertex.
    for (Vertex v : vertices)
    {
     System.out.println("Distance to " + v + " from "
                        + Start + ": " + v.MinDistance);
     
     if(v.MinDistance == 0.0)
     {
       System.out.println("(This is where it starts!)");
     }
     
    }
    // For each loop: For each vertex amongst the predefined vertices,
    // Display a new path iterated from Path.java
    for (Vertex v : vertices)
    {
     List<Vertex> path = P.getShortestPathTo(v);	    
     System.out.println("Path: " + path); 
    }      
  }
}
