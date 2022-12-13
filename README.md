Nilai-nilai OOP yang diimplementasikan dalam Final Project

Overriding
public class MouseInput implements MouseInputListener{
	@Override
	public void mouseClicked(MouseEvent e) {
	}
  
Encapsulation
public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private boolean play = false;
	private int score = 0;
	private int level = 1;
	private int totalBricks = 21;
	
Polymorphism
public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private boolean play = false;
	private int score = 0;
	private int level = 1;
	private int totalBricks = 21;
  
GUI
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		obj.setBounds(10,10,700,600);
		Gameplay gameplay = new Gameplay();
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	}
}
