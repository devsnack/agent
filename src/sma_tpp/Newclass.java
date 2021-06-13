package sma_tpp;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.*;
import jade.core.behaviours.TickerBehaviour;

public class Newclass extends Agent{
	@Override
	protected void setup() {
		 System.out.println("Hello! My name is " + getLocalName ( ));
		 addBehaviour(new WakerBehaviour(this,500) {
		 long t0 = System.currentTimeMillis();
		 protected void handleElapsedTimeout() {
		 System.out.println((System.currentTimeMillis() - t0) +
		 ":I've executed the behavior of type WakeBehaviour!");
		 }
		 });
		 addBehaviour(new OneShotBehaviour(this) {
		 public void action() {
		 System.out.println("I've executed the behavior of type OneShotBehaviour!");
		 }
		 } );
		 
		 addBehaviour(new TickerBehaviour(this,700) {
			 long t1 = System.currentTimeMillis();
		 protected void onTick(){
			 int exec = 0;
			 
		 if(exec == 3){
		 stop();
		 } else {
		 System.out.println((System.currentTimeMillis() - t1) + ": I've executed the behavior of type TickerBehaviour!");
		 exec++;
		 }
		 }
		 });
	}
		 protected void takeDown() {
		 System.out.println("Finalized with success!");
		 } 
}
