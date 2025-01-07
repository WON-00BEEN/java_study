package java_study_0107;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Helloswing extends JFrame{
	setTitle("Hello Swing");// 프로그램 제목
    setSize(300, 200); // 프로그램 사이즈 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel label = new Jlabel("Hello, Swing!");
    add(label);    		
    		
    JLabel nameLabel = new JLabel("안녕하세요 저는 홍길동 입니다.");
    add(nameLabel);
    
    
	setVisible(true);
	
  }

}
class GridLayoutExample extends JFrame{
	
	
    	 
    	 public GridLayoutExample() {
    		
    		 setTitle("그리드레이아웃 연습");
    		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		 setSize(400, 300);
    		 
    		 JPanel panel = new JPanel(new GridLayout(3, 2));
    		 /*
    		  * GridLayout (3,2) 3행 2열 레이아웃 생성
    		  */
    		 for(int i=0; i<6; i++) {  //반복문 사용ㅇ해서 버튼6개생성
    			 
    			 panel.add((new JButton("Button " + i)));
    			 
    		 }
    		 add(panel);
    		 setVisible(true);
    		 
    		 	 
    		 }
    	 }

public class 수업 {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * GUI(그래픽 사용자 인터페이스)
		 * 
		 * 1. 모든 컴포넌트 클래스 이름이 'J'로 시작
		 * 2. 운영체제와 독립적인 경량 컴포넌트
		 * 3. 다양하고 풍부한 GUI 컴포넌트 제공
		 * 
		 */
		
		//
		new HelloSwing();
		
	
		
		

	}

}
