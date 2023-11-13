package n_queen.student;

public class HillClimbingSeatchNQueen {
	private int stepClimbed = 0;
	private int stepClimbedAfterRandomRestart = 0;
	private int randomRestarts = 0;

	public HillClimbingSeatchNQueen(int stepClimbed, int stepClimbedAfterRandomRestart, int randomRestarts) {
		super();
		this.stepClimbed = stepClimbed;
		this.stepClimbedAfterRandomRestart = stepClimbedAfterRandomRestart;
		this.randomRestarts = randomRestarts;
	}

	public Node execute(Node initialState) {
		// Enter your code here.
		Node current = new Node(initialState);
		while(true) {
			Node neighbor = current.getBestCandidate();
			if(neighbor.getH() < current.getH()) {
				current = neighbor;
				stepClimbed++;
				stepClimbedAfterRandomRestart++;
			} else {
				return current;
			}
		}
	}

	public Node executeHillClimbingWithRandomRestart(Node initialState) {
		// Enter your code here.
		return null;
	}

}
