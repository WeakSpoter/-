import javax.swing.*;
import java.awt.*;

public class ExFrame02 extends JFrame { // JFrame 클래스 상속

	public ExFrame02() {
		setTitle("프레임 생성2"); // 프레임 제목 설정
		setSize(400, 200); // 프레임 크기 설정
		setVisible(true); // 프레임 보이기 설정
	}

	public static void main(String args[]) {
		new ExFrame02();
	}
}