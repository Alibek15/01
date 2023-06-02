package model;
import java.util.*;
public class Vertex<V> {
    public V data;
    private final Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data){
        adjacentVertices = new HashMap<>();
        this.data = data;
    }

    public Vertex(final Map<Vertex<V>, Double> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    public V getData() {
        return data;
    }

    public void setData(final V data) {
        this.data = data;
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    public Double getWeight(Vertex<V> v){
        return adjacentVertices.get(v);
    }
    public void addAdjacentVertices(Vertex<V> destination, double weight){
        adjacentVertices.put(destination, weight);
    }
    public boolean containsDest(Vertex<V> v){
        return adjacentVertices.containsKey(v);
    }
    public int countOfAdjacent(){
        return adjacentVertices.size();
    }
    public Iterable<V> getAdjacent(){
        List<V> vertices = new LinkedList<>();
        for (var e : adjacentVertices.keySet()) {
            vertices.add(e.data);
        }
        return vertices;
    }
}