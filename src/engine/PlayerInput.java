package engine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public  class PlayerInput {
	
	private Handler handler;


	public PlayerInput(Handler handler) {
		
		this.handler = handler;
	
	}
	
	public class Move implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {}

		@Override
		public void mouseMoved(MouseEvent e) {}
		
	}
	
	public class Click implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {	}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {}
			
		

		@Override
		public void mouseReleased(MouseEvent e) {}
		
	}
	
	//Very usefull method determinating wether the mouse is over an area
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		
		if(mx > x && mx < x + width) {
			if (my > y && my<y + height) {
				return true;
			}else {
				return false;
			}
		}else return false;
	}//end of mouseOver()
	
	
	
	
}//end of class PlayerInput
