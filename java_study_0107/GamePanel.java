package java_study_0107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {

	private Player player;
	private ArrayList<Circle> circles;
	private Timer timer;
	private int score;
	private boolean isgameOver;
	
	player = new Player(220, 400);
	circles = new ArrayList<>();

	
	
	public GamePanel() throws Exception {
		
		
		
		player = new Player(220, 400);
		circles = new ArrayList<>();
		score = 0;
		isGameOver = false;
		
	}
	
	
	@Override
	public void paintComponents(Graphics g) {
       super.paintComponents(g);
       player.draw(g);
       
       g.setColor(Color.WHITE);
       g.setFont(new Font("Arial", Font.BOLD, 20));
       g.drawString("Score : "+score,10, 25);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//공 생성하기
		if(!isGameOver)  {
		  if(Math.ramdom() < 0.02) {
			int x = (int) Math.random() * 460;
			circles.add((new Circle(x,0));
		}
		
		  for(int i=circles.size() -1; i>=0; i--) {
			  Circle c = circles.get(i);
			  c.move();
			  
			  if(c.getY()  > 500)  {
				  circles.remove(i);
				  ++score;
			  }
			  
			  
			  
		  }
		
		
	
		
	  } //게임로직구현
   
	}
	repaint();
}
