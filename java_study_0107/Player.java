package java_study_0107;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

public class Player {
		
		private int x;
	    private int y;
	    private int width = 60;
		private int height = 60;
	    private Image playerImage;
	
	
	    public Player(int x, int y)  throws Exception { //생성자
	    	this.x = x;
	    	this.y = y;
	    	playerImage = ImageIO.read(getClass().getResource("KakaoTalk_.gif"));
	    }
	    
	    public void draw(Graphics g)  {
	    	//g.drawImage(playerImage,x, y, width, height, null);
	    	
	    	setColor(color.ORANGE);
	    	setfill
	    	
	    	
	    }
	    
	    
	   
	    
	}


