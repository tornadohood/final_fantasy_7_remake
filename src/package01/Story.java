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
}	