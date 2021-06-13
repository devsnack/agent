package msg;


import javax.swing.JOptionPane;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Sender extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {


            @Override
            public void action() {
                // send 3wayhandshake
                ACLMessage greet = new ACLMessage(ACLMessage.INFORM);
                greet.setContent("Hi; Im agent " +getLocalName());
                greet.addReceiver(new AID("second", AID.ISLOCALNAME));
                send(greet);}

        });


    }
}
