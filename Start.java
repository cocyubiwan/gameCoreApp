
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Start{
    JFrame mainFrame = new JFrame(); 
    JPanel optionsPanel = new JPanel();
//     Game gamebox = new Game();
    ClientGUI clientbox = new ClientGUI("localhost",1500);
    ServerGUI serverbox = new ServerGUI(1500);
    MyMovingShapes moving = new MyMovingShapes();
    public Start(){
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("COC YuBiWan v.1.37");
        
        JPanel mainPanel = new JPanel();                //main panel
//         mainPanel.setBackground(new Color(0,0,255));
        mainPanel.setPreferredSize(new Dimension(1200,600));
        mainPanel.add(new JLabel(new ImageIcon("Images/coc.png")));
        
        mainPanel.setLayout(new BorderLayout());
        
        JPanel  menuPanel = new JPanel();
        menuPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        menuPanel.setPreferredSize(new Dimension(200,600));
<<<<<<< HEAD
        menuPanel.setBackground(new Color(255,0,0));
     
        JPanel mapPanel =  new JPanel();
        mapPanel.setBackground(new Color(255,0,0));
//         mapPanel.setLayout(new BorderLayout());
        mapPanel.resize(150,600);
=======
        menuPanel.setBackground(Color.black);
        
        JPanel mapPanel =  new JPanel();
        mapPanel.setBackground(Color.GRAY);
//         mapPanel.setLayout(new BorderLayout());
        mapPanel.resize(300,500);
>>>>>>> 8cc074a9a7e91ca0829babf1e200edc9b0674cc3
        
        
        JPanel scorePanel=new JPanel();
   /*     ImageIcon score= new ImageIcon("Images/score.png");	//start button
        JLabel thumb0 = new JLabel();
        thumb0.setIcon(score);		
        scorePanel.add(thumb0);*/
        scorePanel.setPreferredSize(new Dimension(200,100));
<<<<<<< HEAD
        scorePanel.setBackground(new Color(0,255,0));
=======
        scorePanel.setBackground(Color.black);
>>>>>>> 8cc074a9a7e91ca0829babf1e200edc9b0674cc3
		
        JButton restartButton = new JButton("START WAR!!");
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
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
        gbc.ipady = 5;
=======
        gbc.ipady = 125;
>>>>>>> 8cc074a9a7e91ca0829babf1e200edc9b0674cc3
        gbc.gridx = 0;
        gbc.gridy = 0;
        menuPanel.add(scorePanel,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20; 
        gbc.gridx = 0;
        gbc.gridy = 1;
        menuPanel.add(restartButton,gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 2;
        menuPanel.add(quitButton,gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 250;
        gbc.gridx = 0;
        gbc.gridy = 3;
        menuPanel.add(mapPanel,gbc);
        
        
          
        JPanel  gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(700,600));
        gamePanel.setBackground(new Color(0,31,10));
        gamePanel.add(moving);
        
        JPanel  chatPanel = new JPanel();
        chatPanel.setLayout(new GridLayout(2,1));
        chatPanel.setPreferredSize(new Dimension(300,600));
        chatPanel.setBackground(new Color(0,0,0,0));
        
        clientbox.setPreferredSize(new Dimension(300,600));
//         serverbox.setPreferredSize(new Dimension(300,200));
        
        JPanel suppliesbox = new JPanel();
	suppliesbox.setBackground(new Color(0,0,255));	
    //    ImageIcon supplies= new ImageIcon("Images/supplies.jpg");	//start button
      //  JLabel thumb1 = new JLabel();
  //	thumb1.setIcon(supplies);		
    //    chatPanel.add(thumb1);	
//	suppliesbox.setPreferredSize(new Dimension(300,200));
	
//         chatPanel.add(serverbox);
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
