import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
	
	// Declaring variables
	JMenuBar menuBar;
	JMenu fileMenu ;
	JMenu helpMenu;
	JMenuItem restartItem;
	JMenuItem exitItem;
	JMenuItem howToPlay;
	
	ImageIcon icon;
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	
	
	MyFrame() {
		
		// Building the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new GridLayout(3,3,5,5));
		this.setResizable(false);
		
		icon = new ImageIcon("tictactoe.png");
		
		// Creating the main items of the menu
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		helpMenu = new JMenu("Help");
		
		// the sub-menu options
		exitItem = new JMenuItem("Exit");
		restartItem = new JMenuItem("Restart");
		howToPlay = new JMenuItem("How to play");
		
		// ActionListeners to interact with
		exitItem.addActionListener(this);
		restartItem.addActionListener(this);
		helpMenu.addActionListener(this);
		howToPlay.addActionListener(this);
		
		//Setting the keys to shortcut interact
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.setMnemonic(KeyEvent.VK_H);
		exitItem.setMnemonic(KeyEvent.VK_E);
		restartItem.setMnemonic(KeyEvent.VK_R);
		howToPlay.setMnemonic(KeyEvent.VK_O);
		
		// Adding sub-menus to main menus
		fileMenu.add(restartItem);		
		fileMenu.add(exitItem);
		helpMenu.add(howToPlay);
		
		//Adding the menus to the menu bar
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		this.setJMenuBar(menuBar);
		
		//adding the tictactoe layout
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		this.setTitle("Tic-Tac-Toe!");
		this.setIconImage(icon.getImage());
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==exitItem) {
			System.exit(0);
		}
		if (e.getSource()==restartItem) {
		//create way of restarting the game
		}
		//setup buttons with if/else for X/O
		if (e.getSource()==button1) {
			System.exit(0);
		}
		if (e.getSource()==button2) {
			System.exit(0);
		}
		if (e.getSource()==button3) {
			System.exit(0);
		}
		if (e.getSource()==button4) {
			System.exit(0);
		}
		if (e.getSource()==button5) {
			System.exit(0);
		}
		if (e.getSource()==button6) {
			System.exit(0);
		}
		if (e.getSource()==button7) {
			System.exit(0);
		}
		if (e.getSource()==button8) {
			System.exit(0);
		}
		if (e.getSource()==button9) {
			System.exit(0);
		}

	}	

}
