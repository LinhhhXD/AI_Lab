package chapter2.agent_AB.task2; 

public class Percept {
	private String agentLocation;
	private Environment.LocationState state;

	public Percept(String agentLocation, Environment.LocationState state) {
		this.agentLocation = agentLocation;
		this.state = state;
	}

	public Environment.LocationState getLocationState() {
		return this.state;
	}

	public String getAgentLocation() {
		return this.agentLocation;
	}
}