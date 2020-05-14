package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game {
	
	ChoiceHandler cHandler = new ChoiceHandler();
	UI ui = new UI();
	
	public static void main(String[] args) {
		
		new Game();
	}
	
	public Game() {
		
		ui.createUI(cHandler);
		
	}
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformaed(ActionEvent event) {
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
