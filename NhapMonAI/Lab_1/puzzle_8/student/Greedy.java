package puzzle_8.student;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Greedy implements IPuzzleAlgo{

	@Override
	public Node execute(Puzzle model) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>(PuzzleUtils.HeuristicComparatorByH);
		List<Node> explored = new ArrayList<>();
		frontier.add(model.getInitialState());
		while(!frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getH() == 0) return current;
			else {
				explored.add(current);
				List<Node> children = model.getSuccessors(current);
				for(Node child : children) {
					if(frontier.contains(child) && explored.contains(child)) {
						frontier.add(child);
						child.setG(current.getG() + 1);
					}
				}
			}
		}
		
		
		return null;
	}

}
