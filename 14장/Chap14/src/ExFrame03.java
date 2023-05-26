import javax.swing.*;
import java.awt.*;

public class ExFrame03 extends JFrame { // JFrame 클래스 상속

	public ExFrame03() {
		setTitle("프레임 생성3"); // 프레임 제목 설정
		setSize(400, 200); // 프레임 크기 설정
		setVisible(true); // 프레임 보이기 설정

		JPanel panel = new JPanel(); // 패널 설정
		panel.setBackground(Color.PINK); // 패널 색상 설정
		add(panel); // 프레임에 패널 추가
	}

	public static void main(String args[]) {
		new ExFrame03();
	}
}