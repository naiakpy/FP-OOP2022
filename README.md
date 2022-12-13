Nilai-nilai OOP yang diimplementasikan dalam Final Project

Constructor

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
	
	public static STATE state = STATE.MENU;

	public Gameplay() {
		map = new MapGenerator(3,7,0);
		ball = new Ball(Color.YELLOW);
		time = new Timer(delay, this);
		menu = new Menu();
		time.start();
		addKeyListener(this);
		this.addMouseListener(new MouseInput());
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);}

Overriding

public class MouseInput implements MouseInputListener{
	@Override
	public void mouseClicked(MouseEvent e) {}}
  
Encapsulation

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private boolean play = false;
	private int score = 0;
	private int level = 1;
	private int totalBricks = 21;}
	
Polymorphism

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private boolean play = false;
	private int score = 0;
	private int level = 1;
	private int totalBricks = 21;}
  
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
