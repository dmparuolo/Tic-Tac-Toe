import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class reset extends JFrame implements ActionListener{
	
	Game test = new Game();
	
	
	Color c = new Color(1, 1, 1);
	
	JButton ree, nope;
	
	private String tooty = "";
	
	
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.fillRect(0, 0, 900, 900);
		g2.setColor(c);
		g2.fillRect(180, 580, 240, 240);
		g2.fillRect(480, 580, 240, 240);
		c = new Color(1, 1, 1);
		g2.setColor(c);
		g2.fillRect(200, 600, 200, 200);
		g2.fillRect(500, 600, 200, 200);
		c = new Color(255, 255, 255);
		g2.setColor(c);
		g2.setFont(new Font("Ink Free", Font.BOLD,50));
		g2.drawString(tooty, 290, 150);
		g2.drawString("Would you like to play again?", 130, 350);
		g2.drawString("Yes", 260, 520);
		g2.drawString("No", 560, 520);
	}
	
	public reset(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,900);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		
		ree = new JButton();
		ree.setBounds(192, 569, 200, 200);
		ree.setBackground(c);
		ree.addActionListener(this);
		nope = new JButton();
		nope.setBounds(492, 569, 200, 200);
		nope.setBackground(c);
		nope.addActionListener(this);
		this.add(ree);
		this.add(nope);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ree) {
			gameBoard r = new gameBoard();
			this.setVisible(false);
		}
		
		if(e.getSource()==nope) {
			System.exit(0);
		}
	}
	
	public void twist(int s) {
		if(s==1) {tooty="X is the winner!";}else if(s==2) {tooty="O is the winner!";}else {tooty="It's a Draw!";}
	}
	
	
}
