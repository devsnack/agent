package sma_tpp;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class Simpleagent extends Agent {

@Override
protected void setup() {
	addBehaviour(new OneShotBehaviour() {
		
		@Override
		public void action() {
			System.out.println("Hi; Im Agent: "+ getLocalName());
			
		}
	});
}
}
