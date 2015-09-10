import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Main extends JFrame{
	JButton b1,b2,b3;		//JButtons
    	public Main(){
        	setTitle("COC YuBiWan v.1.37");
        	setSize(1000,600);
        	setLocationRelativeTo(null);
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
        	setContentPane(new JLabel(new ImageIcon("Images/coc.png")));		//background image
        	setLayout(new GridBagLayout());		//GridBag layout
        	GridBagConstraints a = new GridBagConstraints();

		//b1 = start game
        	ImageIcon start= new ImageIcon("Images/startb.jpg");	//start button
        	b1=new JButton(start);
        	b1.setMargin(new Insets(0,0,0,0));
        	a.weighty=1.0;
        	a.insets= new Insets(-100,70,260,-500);
        	a.gridx=0;
        	a.gridy=0;	
        	add(b1,a);
        	b1.addActionListener(new ActionListener(){           //adds an actionlistener to b1   
        	    public void actionPerformed (ActionEvent e){
			 new Start();
		 	 dispose();
            	    }
        	});  

		//b2 = instructions menu
        	ImageIcon instructions= new ImageIcon("Images/instructions.jpg");
        	b2=new JButton(instructions);
        	b2.setMargin(new Insets(0,0,0,0));	
        	a.weighty=1.0;
        	a.insets= new Insets(-200,70,-70,-500);
        	a.gridx=0;
        	a.gridy=0;	
        	add(b2,a);
        	b2.addActionListener(new ActionListener(){
            		public void actionPerformed (ActionEvent e){	
	  	//              new Instructions();
            		}
        	});

    
        	//b3=exit button
        	ImageIcon exit= new ImageIcon("Images/exit.jpg");
        	b3=new JButton(exit);
        	b3.setMargin(new Insets(0,0,0,0));
        	a.weighty=1.0;
        	a.insets= new Insets(10,70,-320,-500);
        	a.gridx=0;
        	a.gridy=0;	
        	add(b3,a);
        	b3.addActionListener(new ActionListener(){
            		public void actionPerformed (ActionEvent e){
                		dispose();
            		}
        	});   
        setVisible(true);		//make the JFrame visible
    }//end of Public Main()

    public static void main(String args[]){
        new Main();		//instantiation of Main
    }
}//end 
