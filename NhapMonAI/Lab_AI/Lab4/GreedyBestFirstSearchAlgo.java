package Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class GreedyBestFirstSearchAlgo implements IInformedSearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<>(new NodeComparatorByH());
		List<Node> explored = new ArrayList<>();
		frontier.add(root);
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				explored.add(current);
				List<Edge> children = current.getChildren();
				for (Edge child : children) {
					Node end = child.getEnd();
					if (!explored.contains(end) && !frontier.contains(end)) {
						frontier.add(end);
						end.setParent(current);
					}
				}
			}

		}

		return null;
	}

}
