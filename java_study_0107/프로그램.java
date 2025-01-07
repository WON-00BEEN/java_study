package java_study_0107;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


pulic class MyFrame extends JFrame{ //프레임 클래스 상속  
   public MyFrame() {
      setTitle("스윙 프로그램 만들기");// 프로그램 제목
      setSize(500,600); //500x600 크기 프로그램
      setVisible(true); //프레임 출력
   }
}

public class 프로그램 {
   
   public static void main(String[] args) {
      MyFrame f = new MyFrame();
      
      Container c = f.getContentPane();
      c.setLayout(new FlowLayout()); //레이아웃 지정
      c.setBackground(Color.ORANGE); //배경화면 색 지정
      
      c.add(new JButton("OK")); //버튼 생성
      c.add(new JButton("Cancel"));
      c.add(new JButton("Ignore"));
      
      f.setVisible(true); //버튼 화면에 보이게 하기
   }
}

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(500, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}