Nilai-nilai OOP yang diimplementasikan dalam Final Project
- Constructor (Gameplay.java)

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private boolean play = false;
	private int score = 0;
	private int level = 1;
	private int totalBricks = 21;
  
- Overriding (MouseInput.java)

public class MouseInput implements MouseInputListener{
	@Override
	public void mouseClicked(MouseEvent e) {
	}
  
- Encapsulation (Gameplay.java)

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private boolean play = false;
	private int score = 0;
	private int level = 1;
	private int totalBricks = 21;
	private Timer time;
	private int delay = 8;
	public static int playerX = 245;
	private MapGenerator map;
	private Ball ball;
	private Menu menu;
	public static enum STATE{
		MENU,
		GAME};
    
    
- Polymorphism (Gameplay.java)

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private boolean play = false;
	private int score = 0;
	private int level = 1;
	private int totalBricks = 21;
	private Timer time;
	private int delay = 8;
	public static int playerX = 245;
	private MapGenerator map;
	private Ball ball;
	private Menu menu;
	public static enum STATE{
		MENU,
		GAME};
    
    
- GUI (Main.java)
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

Referensi: https://github.com/theresianwg/FP-Y-X-G-Gass-PBO-D/tree/main/Final%20Project%20Y%20X%20G%20Gass/src/Brick%20Breaker

Link Video: https://youtu.be/eEGJw0Rxfvw
