import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.*;
import java.awt.geom.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;


public class Test extends JFrame implements ActionListener, MouseListener {
    Shape circle = new Ellipse2D.Float(10, 10, 10, 10);

    public Test () {
        setSize(250,150);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                   Test frame = new Test();
                   frame.setVisible(true);
              }
        });
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public void drawCircle(int x, int y) {
       Graphics g = this.getGraphics();
    //    g.drawOval(x, y, x, y);
	try{
	Random r = new Random();
	int num = r.nextInt(8);
	BufferedImage img = null;
	if(num==0){
		img = ImageIO.read(new File("image0.png"));
	}
	else if(num==1){
		img = ImageIO.read(new File("image1.png"));
	}
	else if(num==2){
		img = ImageIO.read(new File("image2.gif"));
	}
	else if(num==3){
		img = ImageIO.read(new File("image3.png"));
	}
	else if(num==4){
		img = ImageIO.read(new File("image4.gif"));
	}
	else if(num==5){
		img = ImageIO.read(new File("image5.png"));
	}
	else if(num==6){
		img = ImageIO.read(new File("image6.gif"));
	}
	else if(num==7){
		img = ImageIO.read(new File("image7.png"));
	}



	g.drawImage(img,x,y,null);
	}catch(Exception e){
		e.printStackTrace();
	}
   //     g.setColor(Color.BLACK);
      //  g.fillOval(x, y, 2, 2);
    }

    int x, y;

public void mouseClicked(MouseEvent e) {
    x = e.getX();
    y = e.getY();

    repaint();
}

@Override
public void paint(Graphics g) {
    drawCircle(x, y);
}
    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }
}
