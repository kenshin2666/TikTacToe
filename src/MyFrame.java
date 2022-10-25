import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
	
	// Declaring variables
	JMenuBar menuBar;
	JMenu fileMenu ;
	JMenu helpMenu;
	JMenuItem restartItem;
	JMenuItem exitItem;
	JMenuItem howToPlay;	
	ImageIcon icon;
	
	ImageIcon xIcon = new ImageIcon("X.png");
	ImageIcon oIcon = new ImageIcon("O.png");
	ImageIcon xWins = new ImageIcon("xwins.png");
	ImageIcon oWins = new ImageIcon("owins.png");
	static ImageIcon blankButton = new ImageIcon("blankicon.png");
	
	//creating the 9 buttons 
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();
	static JButton button4 = new JButton();
	static JButton button5 = new JButton();
	static JButton button6 = new JButton();
	static JButton button7 = new JButton();
	static JButton button8 = new JButton();
	static JButton button9 = new JButton();
	
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
		helpMenu.setMnemonic(KeyEvent.VK_H);
		exitItem.setMnemonic(KeyEvent.VK_E);
		restartItem.setMnemonic(KeyEvent.VK_R);
		howToPlay.setMnemonic(KeyEvent.VK_H);
		
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
		
		button1.setIcon(blankButton);
		button2.setIcon(blankButton);
		button3.setIcon(blankButton);
		button4.setIcon(blankButton);
		button5.setIcon(blankButton);
		button6.setIcon(blankButton);
		button7.setIcon(blankButton);
		button8.setIcon(blankButton);
		button9.setIcon(blankButton);
		
		this.setTitle("Tic-Tac-Toe!");
		this.setIconImage(icon.getImage());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==exitItem) {
			System.exit(0);
		}
		if (e.getSource()==restartItem) {
			SolutionSolving.reset();
		}
		if (e.getSource()==howToPlay) {
			JOptionPane.showMessageDialog(null, "Each player takes a turn placing and X or O,\n"
					+ "respectively on the board.\n"
					+ "The goal is to make a full row, column or diagonal to win!","How to Play", 
					JOptionPane.PLAIN_MESSAGE, null);
			}
		//setup buttons with if/else for setting X/O
		if (e.getSource()==button1) {		
			if (Player.playerOne == true) {
				button1.getModel().setPressed(true);
				SolutionSolving.setValue();
				button1.setEnabled(false);
				button1.setDisabledIcon(xIcon);			
			} else {
				button1.getModel().setPressed(true);
				SolutionSolving.setValue();
				button1.setEnabled(false);
				button1.setDisabledIcon(oIcon);			
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button2) {		
			if (Player.playerOne == true) {
				button2.getModel().setPressed(true);
				SolutionSolving.setValue();
				button2.setEnabled(false);
				button2.setDisabledIcon(xIcon);			
			} else {
				button2.getModel().setPressed(true);
				SolutionSolving.setValue();
				button2.setEnabled(false);
				button2.setDisabledIcon(oIcon);			
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button3) {		
			if (Player.playerOne == true) {
				button3.getModel().setPressed(true);
				SolutionSolving.setValue();
				button3.setEnabled(false);
				button3.setDisabledIcon(xIcon);				
			} else {
				button3.getModel().setPressed(true);
				SolutionSolving.setValue();
				button3.setEnabled(false);
				button3.setDisabledIcon(oIcon);				
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button4) {			
			if (Player.playerOne == true) {
				button4.getModel().setPressed(true);
				SolutionSolving.setValue();
				button4.setEnabled(false);
				button4.setDisabledIcon(xIcon);				
			} else {
				button4.getModel().setPressed(true);
				SolutionSolving.setValue();
				button4.setEnabled(false);
				button4.setDisabledIcon(oIcon);				
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button5) {			
			if (Player.playerOne == true) {
				button5.getModel().setPressed(true);
				SolutionSolving.setValue();
				button5.setEnabled(false);
				button5.setDisabledIcon(xIcon);				
			} else {
				button5.getModel().setPressed(true);
				SolutionSolving.setValue();
				button5.setEnabled(false);
				button5.setDisabledIcon(oIcon);				
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button6) {			
			if (Player.playerOne == true) {
				button6.getModel().setPressed(true);
				SolutionSolving.setValue();
				button6.setEnabled(false);
				button6.setDisabledIcon(xIcon);				
			} else {
				button6.getModel().setPressed(true);
				SolutionSolving.setValue();
				button6.setEnabled(false);
				button6.setDisabledIcon(oIcon);				
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button7) {			
			if (Player.playerOne == true) {
				button7.getModel().setPressed(true);
				SolutionSolving.setValue();
				button7.setEnabled(false);
				button7.setDisabledIcon(xIcon);				
			} else {
				button7.getModel().setPressed(true);
				SolutionSolving.setValue();
				button7.setEnabled(false);
				button7.setDisabledIcon(oIcon);			
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button8) {			
			if (Player.playerOne == true) {
				button8.getModel().setPressed(true);
				SolutionSolving.setValue();
				button8.setEnabled(false);
				button8.setDisabledIcon(xIcon);				
			} else {
				button8.getModel().setPressed(true);
				SolutionSolving.setValue();
				button8.setEnabled(false);
				button8.setDisabledIcon(oIcon);			
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
		if (e.getSource()==button9) {			
			if (Player.playerOne == true) {
				button9.getModel().setPressed(true);
				SolutionSolving.setValue();
				button9.setEnabled(false);
				button9.setDisabledIcon(xIcon);				
			} else {
				button9.getModel().setPressed(true);
				SolutionSolving.setValue();
				button9.setEnabled(false);
				button9.setDisabledIcon(oIcon);			
			}
			Player.TurnCount();			
			SolutionSolving.checkWinner();
		}
	}	
	
	// Draws the grid lines of the board
	public void paint(Graphics g) {
	    super.paint(g);
	    Graphics2D g2 = (Graphics2D) g;
	    g.setColor(Color.black);
	    g2.setStroke(new BasicStroke(5));
	    g.drawLine(168,55,168,500);
	    g.drawLine(331, 55, 331, 500);
	    g.drawLine(0,198,500,198);
	    g.drawLine(0,346,500,346);
	}
	
}