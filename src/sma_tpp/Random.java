package sma_tpp;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.lang.Math;

public class Random extends Agent {
	@Override
	protected void setup() {
		addBehaviour(new OneShotBehaviour() {
			
			@Override
			public void action() {
				
				//Random random = new Random();
				int num=0;
				num= (int) (Math.random()*10);
				while(true && num!=8) {
					num= (int) (Math.random()*10);

					System.out.println("Le nombre: "+ num);

				}
				System.out.println("see you next time (-_-)");
				doDelete();
				System.out.println("Agent "+getAID().getName()+" rest in peace");



			}
		});
	}

}
