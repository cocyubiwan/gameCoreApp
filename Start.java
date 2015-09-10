
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Start {
    JFrame mainFrame = new JFrame(); 
    JFrame options = new JFrame("Options");
    JPanel optionsPanel = new JPanel();
    ClientGUI clientbox = new ClientGUI("localhost",1500);
    ServerGUI serverbox = new ServerGUI(1500);
    
    public Start(){
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("COC YuBiWan v.1.37");
        
        JPanel mainPanel = new JPanel();                //main panel
        mainPanel.setBackground(Color.RED);
        mainPanel.setPreferredSize(new Dimension(1200,600));
        mainPanel.setLayout(new BorderLayout());
        
        JPanel  menuPanel = new JPanel();
        menuPanel.setLayout(new GridBagLayout());
        menuPanel.setPreferredSize(new Dimension(200,600));
        menuPanel.setBackground(Color.white);
        
        JPanel mapPanel =  new JPanel();
        mapPanel.setBackground(Color.lightGray);
        mapPanel.setLayout(new BorderLayout());
        mapPanel.resize(300,100);
        mapPanel.setOpaque(false);
        
        
        JPanel scorePanel=new JPanel();
        ImageIcon score= new ImageIcon("Images/score.png");	//start button
        JLabel thumb0 = new JLabel();
        thumb0.setIcon(score);		
        scorePanel.add(thumb0);
        scorePanel.setPreferredSize(new Dimension(200,100));
		
        JButton restartButton = new JButton("Restart");
        restartButton.setPreferredSize(new Dimension(60,40));
        restartButton.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                    mainFrame.dispose();
                    new Start();
            }});
		
        JButton quitButton = new JButton("Quit");
        quitButton.setPreferredSize(new Dimension(60,40));
        quitButton.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                    mainFrame.dispose();
            }});
            
        
        
        
        
          
        JPanel  gamePanel = new JPanel();
        ImageIcon icon2 = new ImageIcon("Images/ito.png");
        gamePanel.setPreferredSize(new Dimension(700,600));
        gamePanel.setBackground(Color.black);
        JLabel thumb2 = new JLabel();
        thumb2.setIcon(icon2);		
        gamePanel.add(thumb2);
        
        JPanel  chatPanel = new JPanel();
        chatPanel.setLayout(new GridLayout(3,1));
        chatPanel.setPreferredSize(new Dimension(300,600));
        chatPanel.setBackground(Color.GRAY);
        
        clientbox.setPreferredSize(new Dimension(300,200));
        serverbox.setPreferredSize(new Dimension(300,200));
        
        JPanel suppliesbox = new JPanel();	
	suppliesbox.setBackground(Color.green);
	suppliesbox.setPreferredSize(new Dimension(300,200));
	
        chatPanel.add(serverbox);
        chatPanel.add(clientbox);
        chatPanel.add(suppliesbox);
            
        mainPanel.add(menuPanel, BorderLayout.LINE_START);
        mainPanel.add(gamePanel, BorderLayout.CENTER);
        mainPanel.add(chatPanel, BorderLayout.LINE_END);
        
        
    
    	mainFrame.add(mainPanel);	//frame specification
      
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setContentPane(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}