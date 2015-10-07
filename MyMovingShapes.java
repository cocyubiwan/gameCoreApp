import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/*
 * Draws a circle, polygon and rectangle using Graphics2D
 * and lets the user move these objects using the mouse.
 */
public class MyMovingShapes extends JPanel implements MouseInputListener
{
  Ellipse2D.Double circle, circle1, circle2,circle3,circle4,circle5,circle6,circle7,circle8;
  Polygon polygon;
  Image img;
  Rectangle rectangle, rectangle1, rectangle2,rectangle3,rectangle4,rectangle5;
  int xpoints[] = {100, 150, 170, 160, 130};
  int ypoints[] = {100,  80, 120, 150, 160};

//     Graphics g;

  Point startDrag;
  boolean dragCircle, dragPolygon, dragRectangle, dragCircle1, dragCircle2, dragCircle3, dragCircle4, dragCircle5, dragCircle6, dragCircle7, dragCircle8;
  boolean dragRectangle1,dragRectangle2,dragRectangle3,dragRectangle4,dragRectangle5;
  public MyMovingShapes()
  {
//     super("MyMovingShapes");
//     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	
    setPreferredSize(new Dimension(700,700));
    addMouseListener( this );
    addMouseMotionListener( this );

    //init shapes
    circle = new   Ellipse2D.Double( 50, 50, 40, 40 );
    circle1 = new   Ellipse2D.Double( 90, 110, 20, 20 );
    circle2 = new   Ellipse2D.Double( 250, 250, 20, 20 );
    circle3 = new   Ellipse2D.Double( 300, 10, 20, 20 );
    circle4 = new   Ellipse2D.Double( 200, 350, 20, 20 );
    circle5 = new   Ellipse2D.Double( 190, 160, 20, 20 );
    circle6 = new   Ellipse2D.Double( 290, 500, 20, 20 );
    circle7 = new   Ellipse2D.Double( 490, 570, 20, 20 );
    circle8 = new   Ellipse2D.Double( 650, 250, 20, 20 );

    polygon = new Polygon( xpoints, ypoints, xpoints.length );
    rectangle = new Rectangle( 200, 200, 50, 50 );
    rectangle1 = new Rectangle( 500, 400, 20, 20 );
    rectangle2 = new Rectangle( 10, 550, 20, 20 );
 	rectangle3 = new Rectangle( 270, 560, 20, 20 );
    rectangle4 = new Rectangle( 10, 10, 20, 20 );
	rectangle5 = new Rectangle( 500, 30, 20, 20 );
    show();
  }

    int x, y;


  public void paint( Graphics g )
  {
    //use Graphics2D
    Graphics2D g2d = (Graphics2D)g;
    
    Graphics2D g2dbase = (Graphics2D)g;
    //clear screen
    g2d.setColor(new Color(0,31,10));
    g2d.fillRect( 0, 0, getWidth(), getHeight() );

    //draw the objects based on the contained values
    g2d.setColor( Color.ORANGE );
    g2d.fill( circle1 );
    g2d.fill( circle2 );
    g2d.fill( circle3 );
    g2d.fill( circle4 );
    g2d.fill( circle5 );
    g2d.fill( circle6 );
    g2d.fill( circle7 );
    g2d.fill( circle8 );
	g2d.setColor( Color.MAGENTA );
    g2d.fill( rectangle1 );
    g2d.fill( rectangle2 );
	g2d.fill( rectangle3 );
    g2d.fill( rectangle4 );
	g2d.fill( rectangle5 );
    g2dbase.setColor( Color.LIGHT_GRAY );
	g2d.fill( circle );
    g2d.fill( polygon );
    g2d.fill( rectangle );
        
        
      
    
  
  }
  

 //methods from MouseInputListener

  public void mouseClicked(MouseEvent e)
  {

  }


  public void mouseEntered(MouseEvent e)
  {
  }


  public void mouseExited(MouseEvent e)
  {
  }


  public void mousePressed(MouseEvent e)
  {
    Point p;

    //register start of drag
    System.out.println("Started drag");

    //get the point that was pressed
    p =  e.getPoint();
    startDrag = p;

    
   
//     check which object was clicked
//     if-else is deliberately avoided, so overlapping figures may be detected.

    if( circle1.contains( p ) )
    {
      dragCircle1 = true;
    }
     if( circle2.contains( p ) )
    {
      dragCircle2 = true;
    }
	if( circle3.contains( p ) )
    {
      dragCircle3 = true;
    }
     if( circle4.contains( p ) )
    {
      dragCircle4 = true;
    }
	if( circle5.contains( p ) )
    {
      dragCircle5 = true;
    }
     if( circle6.contains( p ) )
    {
      dragCircle6 = true;
    }
	if( circle7.contains( p ) )
    {
      dragCircle7 = true;
    }
     if( circle8.contains( p ) )
    {
      dragCircle8 = true;
    }
    if( circle.contains( p ) )
    {
      dragCircle = true;
    }

    if( polygon.contains( p ) )
    {
      dragPolygon = true;
    }

    if( rectangle.contains( p ) )
    {
      dragRectangle = true;
    }
    if( rectangle1.contains( p ) )
    {
      dragRectangle1 = true;
    }
    if( rectangle2.contains( p ) )
    {
      dragRectangle2 = true;
    }
if( rectangle3.contains( p ) )
    {
      dragRectangle3 = true;
    }
if( rectangle4.contains( p ) )
    {
      dragRectangle4 = true;
    }
if( rectangle5.contains( p ) )
    {
      dragRectangle5 = true;
    }
    
    
  }


  public void mouseReleased(MouseEvent e)
  {
  
    //end drag
    startDrag = null;
    dragCircle = dragPolygon = dragRectangle = dragRectangle1 = dragRectangle2 = dragRectangle3 = dragRectangle4 = dragRectangle5 = dragCircle1 = dragCircle2 =dragCircle3 = dragCircle4 = dragCircle5 = dragCircle6 = dragCircle7 = dragCircle8 =false;
    dragRectangle1=dragRectangle2=false;
    System.out.println("End dragging");
  }
 

  public void mouseDragged(MouseEvent e)
  {
    Point p;
    int dX, dY;

    //get the point that was clicked
    p = e.getPoint();

    //ensure that we have a start dragging point
    //startDrag = p;

    //calculate difference between start and current drag poing
    dX = p.x - startDrag.x;
    dY = p.y - startDrag.y;
    
    //check which object(s) we are dragging and move them
    if( dragCircle )
    {
		if(dX<=700 && dY<=600){
      circle.x += dX;
      circle.y += dY;
	}
    }
     if( dragCircle2 )
    {
      circle2.x += dX;
      circle2.y += dY;
    }
    
     if( dragCircle1 )
    {
      circle1.x += dX;
      circle1.y += dY;
    }
     if( dragCircle3 )
    {
      circle3.x += dX;
      circle3.y += dY;
    }
    
     if( dragCircle4)
    {
      circle4.x += dX;
      circle4.y += dY;
    }

     if( dragCircle5 )
    {
      circle5.x += dX;
      circle5.y += dY;
    }
    
     if( dragCircle6 )
    {
      circle6.x += dX;
      circle6.y += dY;
    }
     if( dragCircle7 )
    {
      circle7.x += dX;
      circle7.y += dY;
    }
    
     if( dragCircle8 )
    {
      circle8.x += dX;
      circle8.y += dY;
    }


    if( dragPolygon )
    {
      polygon.translate( dX, dY );
    }

    if( dragRectangle )
    {
      rectangle.translate( dX, dY );
    }
     if( dragRectangle1 )
    {
      rectangle1.translate( dX, dY );
    }
     if( dragRectangle2 )
    {
      rectangle2.translate( dX, dY );
    }
 if( dragRectangle3 )
    {
      rectangle3.translate( dX, dY );
    }
    if( dragRectangle4 )
    {
      rectangle4.translate( dX, dY );
    }
 if( dragRectangle5 )
    {
      rectangle5.translate( dX, dY );
    }

    //reset startdrag point
    startDrag = p;

    //redraw the screen
    repaint();
        
  }

  public void mouseMoved(MouseEvent e)
  {
  }

//   public static void main(String args[])
//   {
//     new MyMovingShapes();
//   }
}
