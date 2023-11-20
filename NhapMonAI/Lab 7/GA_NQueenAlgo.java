import java.util.Random;

import n_queen.student.Node;

public class GA_NQueenAlgo {
	public static final int POP_SIZE = 100;//Population size
	public static final double MUTATION_RATE = 0.03;
	public static final int MAX_ITERATIONS = 1000;
	List<Node> population = new ArrayList<Node>();
	Random rd = new Random();
	
	// initialize the individuals of the population
	public void initPopulation() {
		for (int i = 0; i < POP_SIZE; i++) {
			Node ni = new Node();
			ni.generateBoard();
			population.add(ni);
		}
	}
	public Node execute() {
		// Enter your code here
		return null;
	}
	
	// Mutate an individual by selecting a random Queen and 
	//move it to a random row.
	public void mutate(Node node) {
	// Enter your code here
		int i = rd.nextInt(Node.N);
		int r = rd.nextInt(Node.N);
		node.setRow(i,r);
		
	}
	
	//Crossover x and y to reproduce a child
	public Node reproduce(Node x, Node y) {
	// Enter your code here
		return null;
	}
	
	// Select K individuals from the population at random and 
	//select the best out of these to become a parent.
	public Node getParentByTournamentSelection() {
	// Enter your code here
		return null;
	}
	
	//Select a random parent from the population
	public Node getParentByRandomSelection() {
	// Enter your code here
		return null;
	}
	
	}

}