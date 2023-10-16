package k21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {

		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		List<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			} // pathcost parent
//			explored.add(current);
			List<Node> children = current.getChildrenNodes();
//			for (Node child : children) {
//				// graph search moi co
//				if (!frontier.contains(child) && (!explored.contains(child))) 
//						frontier.add(current);
//					
//				child.setParent(current);
//
//		
//			
			for (int i = 0; i < children.size(); i++) {
				Node n = children.get(i);
				if (!frontier.contains(n) && (!explored.contains(n))) {
					frontier.add(current);
					n.setParent(current);
				}

			}
		}
		System.out.println();
		return null;



	}

	@Override
	public Node execute(Node root, String start, String goal) {
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		return null;
	}

}
