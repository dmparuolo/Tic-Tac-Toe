import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gameBoard extends JFrame implements ActionListener{
		
		
		public void paint(Graphics g) {
			
		Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.WHITE);
			g2.setStroke(new BasicStroke(5));
			g2.drawLine(450, 150, 450, 1050);
			g2.drawLine(750, 150, 750, 1050);
			g2.drawLine(150, 450, 1050, 450);
			g2.drawLine(150, 750, 1050, 750);
		}
		
		ImageIcon doo = new ImageIcon("C:\\Users\\Dominic Paruolo\\eclipse-workspace\\Tic-Tac-Toe\\x-png-35402.png");
		ImageIcon resetIcon = new ImageIcon("C:\\Users\\Dominic Paruolo\\eclipse-workspace\\Tic-Tac-Toe\\download.jpg");
		
		Color c = new Color(1, 1, 1);
		
		JButton one; JButton two; JButton three; JButton four; JButton five; JButton six; JButton seven; JButton eight; JButton nine;
		
		Game test = new Game();
		
		boolean t = true;
		public void turny() {
			if(t) {
				t=false; doo = new ImageIcon("C:\\Users\\Dominic Paruolo\\eclipse-workspace\\Tic-Tac-Toe\\circle-png-15279.png");} 
				else {t=true; doo = new ImageIcon("C:\\Users\\Dominic Paruolo\\eclipse-workspace\\Tic-Tac-Toe\\x-png-35402.png");}
				
			
		}
		
		gameBoard(){

		one = new JButton();
	    one.setBounds(140, 117, 300, 300);
		one.addActionListener(this);
		one.setBackground(c);
		one.setBorderPainted(false);
		one.setFocusable(false);
		
		two = new JButton();
		two.setBounds(445, 117, 295, 300);
	    two.addActionListener(this);
		two.setBackground(c);
		two.setBorderPainted(false);
		two.setFocusable(false);
		
		three = new JButton();
		three.setBounds(745, 117, 300, 300);
	    three.addActionListener(this);
		three.setBackground(c);
		three.setBorderPainted(false);
		three.setFocusable(false);
		
		four = new JButton();
		four.setBounds(140, 422, 300, 295);
	    four.addActionListener(this);
		four.setBackground(c);
		four.setBorderPainted(false);
		four.setFocusable(false);
		
		five = new JButton();
		five.setBounds(445, 422, 295, 295);
	    five.addActionListener(this);
		five.setBackground(c);
		five.setBorderPainted(false);
		five.setFocusable(false);
		
		six = new JButton();
		six.setBounds(745, 422, 300, 295);
	    six.addActionListener(this);
		six.setBackground(c);
		six.setBorderPainted(false);
		six.setFocusable(false);
		
		seven = new JButton();
		seven.setBounds(140, 722, 300, 300);
	    seven.addActionListener(this);
	    seven.setBackground(c);
		seven.setBorderPainted(false);
		seven.setFocusable(false);
		
		eight = new JButton();
		eight.setBounds(445, 722, 295, 300);
	    eight.addActionListener(this);
		eight.setBackground(c);
		eight.setBorderPainted(false);
		eight.setFocusable(false);
		
		nine = new JButton();
	    nine.setBounds(745, 722, 300, 300);
		nine.addActionListener(this);
		nine.setBackground(c);
		nine.setBorderPainted(false);
		nine.setFocusable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,1200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setBackground(c);
		this.setTitle("Tic-Tac-Toe");
		
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(four);
		this.add(five);
		this.add(six);
		this.add(seven);
		this.add(eight);
		this.add(nine);
		
		}	
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==one) {
				one.setIcon(doo);
				one.setEnabled(false);
				test.change(1, 1);
				turny();
			}
		
			if(e.getSource()==two) {
				two.setIcon(doo);
			    two.setEnabled(false);
			    test.change(1, 2);
			    turny();
			}
			
			if(e.getSource()==three) {
				three.setIcon(doo);
			    three.setEnabled(false);
			    test.change(1, 3);
			    turny();
			}
			
			if(e.getSource()==four) {
				four.setIcon(doo);
			    four.setEnabled(false);
			    test.change(2, 1);
			    turny();
			}
			
			if(e.getSource()==five) {
				five.setIcon(doo);
			    five.setEnabled(false);
			    test.change(2, 2);
			    turny();
			}
			
			if(e.getSource()==six) {
				six.setIcon(doo);
			    six.setEnabled(false);
			    test.change(2, 3);
			    turny();
			}
			
			if(e.getSource()==seven) {
				seven.setIcon(doo);
			    seven.setEnabled(false);
			    test.change(3, 1);
			    turny();
			}
			
			if(e.getSource()==eight) {
				eight.setIcon(doo);
			    eight.setEnabled(false);
			    test.change(3, 2);
			    turny();
			}
			
			if(e.getSource()==nine) {
				nine.setIcon(doo);
				nine.setEnabled(false);
				test.change(3, 3);
				turny();
			}
			
			if(test.gameEnd()) {
				this.setVisible(false);
			}
		
		
		}
}
