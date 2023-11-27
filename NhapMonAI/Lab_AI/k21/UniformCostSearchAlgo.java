package k21;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class UniformCostSearchAlgo implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
		ArrayList<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			Node count = frontier.poll();
			System.out.println(count.getLabel() + " ");
			List<Edge> children = count.getChildren();
			for (Edge child : children) {
				Node end = child.getEnd();
				if (!frontier.contains(end) && !explored.contains(end)) {
					frontier.add(end);
					end.setPathCost(count.getPathCost() + child.getWeight());
				} else {
					if (end.getPathCost() > count.getPathCost() + child.getWeight()) {
						end.setPathCost(count.getPathCost() + child.getWeight());
						System.out.println(end);
					}
				}
			}

		}
		System.out.println();
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

}
