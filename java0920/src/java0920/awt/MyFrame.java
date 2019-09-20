package java0920.awt;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame {
	public MyFrame() {
		//옵션 설정
		this.setBackground(Color.orange);
		this.setTitle("처음 만들어보는 윈도우");
		setSize(200, 200);
		setLocation(100,100);
		setVisible(true);
	}
}
