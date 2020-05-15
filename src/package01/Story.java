package package01;

import package02.Weapon_Knife;

public class Story {
	
		Game game;
		UI ui;
		VisibilityManager vm;
		Player player = new Player();
		
		public Story(Game g, UI userInterface, VisibilityManager vManager){
			
			game = g;
			ui = userInterface;
			vm = vManager;
		}
		
		public void defaultSetup() {
			
			player.hp = 10;
			ui.hpLabelNumber.setText(""+ player.hp);
			
			player.currentWeapon = new Weapon_Knife();
			ui.weaponLabelName.setText(player.currentWeapon.name);
		}
		public void selectPosition(String nextPosition) {
			
			switch(nextPosition) {
			case "townGate": townGate(); break;
			case "talkGuard": talkGuard(); break;
			case "attackGuard": attackGuard(); break;
			case "crossRoad": crossRoad(); break;
			}
		}
		
		public void townGate() {
			ui.mainTextArea.setText("You are at the gate of the town. \nA guard is standing in front of you. \n\nWhat do you do?");
			ui.choice1.setText("Talk to the guard");
			ui.choice2.setText("Attack the guard");
			ui.choice3.setText("Leave");
			ui.choice4.setText("");
			
			game.nextPosition1 = "talkGuard";
			game.nextPosition2 = "attackGuard";
			game.nextPosition3 = "crossRoad";
			game.nextPosition4 = "";
		}
		public void talkGuard() {
			ui.mainTextArea.setText("Guard: Hello stranger. I have never seen your face. \nI'm sorry but we cannot let a stranger enter our town.");
			ui.choice1.setText("");
			ui.choice2.setText(">");
			ui.choice3.setText("");
			ui.choice4.setText("");
			
			game.nextPosition1 = "townGate";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
		public void attackGuard() {
			ui.mainTextArea.setText("Guard: Hey don't be stupid! \n\nThe guard attacked you so hard and you gave up. \n(You received 3 damage)");
			player.hp = player.hp-3;
			ui.hpLabelNumber.setText("" + player.hp);
			ui.choice1.setText("Talk to the guard");
			ui.choice2.setText("Attack the guard");
			ui.choice3.setText("Leave");
			ui.choice4.setText("");
			
			game.nextPosition1 = "townGate";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
		public void crossRoad() {
			ui.mainTextArea.setText("You are at a crossroad.\nIf you go south, you will go back to the town.");
			ui.choice1.setText("Go north");
			ui.choice2.setText("Go east");
			ui.choice3.setText("Go south");
			ui.choice4.setText("Go west");
			
			game.nextPosition1 = "townGate";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
}	
