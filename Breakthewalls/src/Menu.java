// kelas ini digunakan untuk membuat tampilan menu awal

package Breakthewalls;

import java.awt.*;

public class Menu {
	public Rectangle playbutton = new Rectangle(275, 210, 100, 50); //Membuat tampilan kotak
	public Rectangle Quitbutton = new Rectangle(275, 280, 100, 50); //Membuat tampilan kotak
	public Rectangle Howplaybutton = new Rectangle(275, 350, 100, 50); //Membuat tampilan kotak
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("Poppins", Font.BOLD, 64);
		
		// Membuat Judul
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("Break The Walls", 75, 175);
		
		//Play Button
		Font fnt1 = new Font("Poppins", Font.BOLD, 30);
		g.setFont(fnt1);
		g.drawString("Play", playbutton.x + 17, playbutton.y + 33);
		g2d.draw(playbutton);
		
		//Quit Button
		g.setFont(fnt1);
		g.drawString("Quit", Quitbutton.x + 17, Quitbutton.y + 33);
		g2d.draw(Quitbutton);
	}
}