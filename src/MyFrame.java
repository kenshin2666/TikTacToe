import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
	
	// Declaring variables
	JMenuBar menuBar;
	JMenu fileMenu ;
	JMenu helpMenu;
	JMenuItem playerSelectItem;
	JMenuItem exitItem;
	JMenuItem howToPlay;
	
	ImageIcon icon;
	
	
	MyFrame() {
		
		// Building the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		icon = new ImageIcon("tictactoe.png");
		
		// Creating the main items of the menu
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		helpMenu = new JMenu("Help");
		
		// the sub-menu options
		exitItem = new JMenuItem("Exit");
		playerSelectItem = new JMenuItem("Players");
		howToPlay = new JMenuItem("How to play");
		
		// ActionListeners to interact with
		exitItem.addActionListener(this);
		playerSelectItem.addActionListener(this);
		helpMenu.addActionListener(this);
		howToPlay.addActionListener(this);
		
		//Setting the keys to shortcut interact
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.setMnemonic(KeyEvent.VK_H);
		exitItem.setMnemonic(KeyEvent.VK_E);
		playerSelectItem.setMnemonic(KeyEvent.VK_P);
		howToPlay.setMnemonic(KeyEvent.VK_O);
		
		// Adding sub-menus to main menus
		fileMenu.add(playerSelectItem);		
		fileMenu.add(exitItem);
		helpMenu.add(howToPlay);
		
		//Adding the menus to the menu bar
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		this.setJMenuBar(menuBar);
		
		this.setTitle("Tic-Tac-Toe!");
		this.setIconImage(icon.getImage());
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==exitItem) {
			System.exit(0);
		}
		
	}	

}
