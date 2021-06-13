package sma_tpp;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jade.core.ProfileImpl;
import jade.core.Profile;

public class Mainclass {

	public static void main(String[] args) {
		Runtime rt=Runtime.instance();
		Profile p= new ProfileImpl();
		p.setParameter(Profile.MAIN_HOST, "localhost");
		p.setParameter(Profile.GUI, "true");
		ContainerController cc=rt.createMainContainer(p);
		AgentController ac;
		try {
			//ac= cc.createNewAgent("Firstagent", "sma_tpp.Firstagent", null);
			//ac= cc.createNewAgent("Simpleagent", "sma_tpp.Firstagent", null);
			//ac= cc.createNewAgent("Random", "sma_tpp.Firstagent", null);
			ac= cc.createNewAgent("Newclass", "sma_tpp.Firstagent", null);
			ac.start();
		} catch (StaleProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
		

	}

}

