import javax.accessibility.Accessible;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class AppWindow extends Frame{

	public AppWindow() {
		addWindowListener(new MyWindowAdapter());
	}

    public static void main(String[] args) {
	    AppWindow appwin = new AppWindow();

	    appwin.setSize(new Dimension(300, 200));
	    appwin.setTitle("An AWT-Based Application");

	    MyButton ButExit = new MyButton();
	    ButExit.setLabel("click");
	    ButExit.setBounds(50,100,80,30);

		appwin.add(ButExit);
		appwin.setLayout(null);
	    appwin.setVisible(true);

    }


}

class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

class MyButton extends Button {
	public static int x = 50;
	public static int y = 100;

	public MyButton(){
		/*addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});*/


		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				//System.exit(0);

				int x = (int)(Math.random() * 220) ;
				int y = (int)(Math.random() * 130) + 40 ;
				setBounds(x, y, 80, 30);

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});
		}
	}










