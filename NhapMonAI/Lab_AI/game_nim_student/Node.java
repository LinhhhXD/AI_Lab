package game_nim_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Node {
	private List<Integer> data = new ArrayList<Integer>();

	public void add(Integer val) {
		this.data.add(val);
	}

	public void addAll(List<Integer> data) {
		this.data.addAll(data);
	}

	// Get children of the current nodes
	
	
	public List<Node> getSuccessors() {
		// Enter your code here
		for (int i = 0; i < data.size(); i++) {
			int current = data.get(i);
			for (int j = 1; j < current/2; j++) {
				Node n = new Node();
				n.add(j);
				n.add(current - j);
				for (int k = 0; k < data.size(); k++) {
					if(k != i) 
						n.add(data.get(k));
				}
			}
		}
		return null;
	}

	// Check whether a node is terminal or not
	public boolean isTerminal() {
		// Enter your code here
		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < data.size(); j++) {
				if(data.get(i).equals(data.get(j))) {
					return true;
				}
			}
		}
		return false;
	}

	public static final Comparator<Integer> DESCOMPARATOR = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	};

	@Override
	public String toString() {
		Collections.sort(this.data, DESCOMPARATOR);
		return this.data.toString();
	}

}
