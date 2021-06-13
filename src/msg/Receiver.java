package msg;

import javax.swing.JOptionPane;


import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Receiver extends Agent {
@Override
protected void setup() {
	addBehaviour(new CyclicBehaviour(){
		@Override
		public void action() {
		//receive msg from Msg
		ACLMessage greet =receive();
		if(greet!=null) {
			JOptionPane.showMessageDialog(null,"Message received : " +greet.getContent());
			System.out.println("Message received: "+ ""+ greet.getContent());
		}
		else block();
		
	}
});
}

}
