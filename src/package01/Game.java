package package01;

import package01.Sound;
//import sun.nio.ch.ThreadPool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Game {
	
	ChoiceHandler cHandler = new ChoiceHandler();	
	UI ui = new UI();
	VisibilityManager vm = new VisibilityManager(ui);
	Story story = new Story(this, ui, vm);
	Sound sound = new Sound();
	
	String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
	
	public static void main(String[] args) {
		
		//ThreadPool pool = new ThreadPool(2);
		
		new Game();
	}
	
	public Game() {
		
		ui.createUI(cHandler);
		story.defaultSetup();
		vm.showTitleScreen();
		//sound.PlaySound(null);
	}

	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			String yourChoice = event.getActionCommand();
			
			switch(yourChoice) {
			case "start": vm.titleToTown(); story.townGate(); break;
			case "c1": story.selectPosition(nextPosition1);break;
			case "c2": story.selectPosition(nextPosition2); break;
			case "c3": story.selectPosition(nextPosition3);break;
			case "c4": story.selectPosition(nextPosition4);break;
		}		
	 }
 }
}
