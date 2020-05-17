package package01;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import package01.Game.ChoiceHandler;


public class UI {
	
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, imagePanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, imageLabel,magicLabel,magicLabelName,armorLabel,armorLabelName,accLabel,accLabelName,rideLabel,rideLabelName,stoneLabel,stoneLabelName;
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
	String clickSound;
	ImageIcon image;
	
	public void createUI(ChoiceHandler cHandler){
		
		//WINDOW		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		//TITLE SCREEN
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 500);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("最終幻想VII");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.black);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);
		startButton.addActionListener(cHandler);
		startButton.setActionCommand("start");
		startButtonPanel.add(startButton);
					
		window.add(titleNamePanel);
		window.add(startButtonPanel);
		
		//GAME SCREEN
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(50, 350, 430, 250);
		mainTextPanel.setBackground(Color.black);
		window.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is the main text area.");
		mainTextArea.setBounds(50, 350, 430, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(500, 350, 250, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		window.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.black);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(cHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		
		choice2 = new JButton("Choice2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.black);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(cHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		
		choice3 = new JButton("Choice3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.black);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(cHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		
		choice4 = new JButton("Choice4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.black);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(cHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(500, 70, 300, 200);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(7,7));
		window.add(playerPanel);
		
		hpLabel = new JLabel("生命值:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		hpLabelNumber = new JLabel();
		hpLabelNumber.setFont(normalFont);
		hpLabelNumber.setForeground(Color.white);
		playerPanel.add(hpLabelNumber);
		
		weaponLabel = new JLabel("武器:");
		weaponLabel.setFont(normalFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		weaponLabelName = new JLabel();
		weaponLabelName.setFont(normalFont);
		weaponLabelName.setForeground(Color.white);
		playerPanel.add(weaponLabelName);
		
		armorLabel = new JLabel("防具:");
		armorLabel.setFont(normalFont);
		armorLabel.setForeground(Color.white);
		playerPanel.add(armorLabel);
		armorLabelName = new JLabel();
		armorLabelName.setFont(normalFont);
		armorLabelName.setForeground(Color.white);
		playerPanel.add(armorLabelName);
		
		accLabel = new JLabel("饰品:");
		accLabel.setFont(normalFont);
		accLabel.setForeground(Color.white);
		playerPanel.add(accLabel);
		accLabelName = new JLabel();
		accLabelName.setFont(normalFont);
		accLabelName.setForeground(Color.white);
		playerPanel.add(accLabelName);
		
		magicLabel = new JLabel("魔法:");
		magicLabel.setFont(normalFont);
		magicLabel.setForeground(Color.white);
		playerPanel.add(magicLabel);
		magicLabelName = new JLabel();
		magicLabelName.setFont(normalFont);
		magicLabelName.setForeground(Color.white);
		playerPanel.add(magicLabelName);
		
		rideLabel = new JLabel("坐骑:");
		rideLabel.setFont(normalFont);
		rideLabel.setForeground(Color.white);
		playerPanel.add(rideLabel);
		rideLabelName = new JLabel();
		rideLabelName.setFont(normalFont);
		rideLabelName.setForeground(Color.white);
		playerPanel.add(rideLabelName);
		
		stoneLabel = new JLabel("魔石:");
		stoneLabel.setFont(normalFont);
		stoneLabel.setForeground(Color.white);
		playerPanel.add(stoneLabel);
		stoneLabelName = new JLabel();
		stoneLabelName.setFont(normalFont);
		stoneLabelName.setForeground(Color.white);
		playerPanel.add(stoneLabelName);
		
		imagePanel = new JPanel();
		imagePanel.setBounds(50, 50, 400, 250);
		imagePanel.setBackground(Color.black);
		
		imageLabel = new JLabel();
		
		image = new ImageIcon(".//res//towngate2.jpg");
		
		imageLabel.setIcon(image);
		imagePanel.add(imageLabel);
		
		
		window.add(imagePanel);
		
		
		window.setVisible(true);
	}
}