package finalprojectta;

import finalprojectta.FinalProjectTA.ChoiceHandler;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class GameUI {
        
    //Variable for screen size
        int ScreenW = 800;
        int ScreenH = 600;
        int xTP = (int)Math.round(ScreenW*0.125);
        int yTP = (int)Math.round(ScreenH*0.388);
        int WTP = (int)Math.round(ScreenW*0.75);
        int HTP = (int)Math.round(ScreenH*0.277);
        int xSB = (int)Math.round(ScreenW*0.4375);
        int ySB = (int)Math.round(ScreenH*0.66);
        int WSB = (int)Math.round(ScreenW*0.125);
        int HSB = (int)Math.round(ScreenH*0.444);
        int xSP = (int)Math.round(ScreenW*0.16875);
        int ySP = (int)Math.round(ScreenH*0.466);
        int WSP = (int)Math.round(ScreenW*0.64375);
        int HSP = (int)Math.round(ScreenH*0.222);
        int xSL = (int)Math.round(ScreenW*0.0625);
        int ySL = (int)Math.round(ScreenH*0.111);
        int WSL = (int)Math.round(ScreenW*0.625);
        int HSL = (int)Math.round(ScreenH*0.555);
        int xSI = (int)Math.round(ScreenW*0.28125);
        int WSI = (int)Math.round(ScreenW*0.4375);
        int HSI = (int)Math.round(ScreenH*0.444);
        int xCP = (int)Math.round(ScreenW*0.240625);
        int yCP = (int)Math.round(ScreenH*0.688);
        int WCP = (int)Math.round(ScreenW*0.5);
        int HCP = (int)Math.round(ScreenH*0.166);
        
        //Variable for font size
        int TF = (int)Math.round(ScreenW*0.06875);
        int NF = (int)Math.round(ScreenH*0.033);
        
    JFrame screen;
    JPanel TitlePanel,StartPanel,TextPanel,ChoicePanel,BackgroundPanel, GImagePanel;
    JLabel TitleLabel,StartLabel,BackgroundLabel,GImageLabel;
    Font TitleFont = new Font("Times New Roman", Font.PLAIN, TF);
    Font NormalFont = new Font("Times New Roman", Font.PLAIN, NF);
    JButton StartButton,ChoiceButton1,ChoiceButton2,ChoiceButton3,ChoiceButton4;
    JTextArea StoryText;
    ImageIcon BackgroundImage,SceneImage;
    
    public void Interface(ChoiceHandler cHandler){
        
        
        //Window
        screen = new JFrame();
        screen.setSize(ScreenW, ScreenH);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.getContentPane().setBackground(Color.black);
        screen.setLayout(null);
        
        //Title Background
        BackgroundImage = new ImageIcon(".//res//TitleBackground.jpg");
        
        Image BImage = BackgroundImage.getImage();
        Image ModifiedBImage = BImage.getScaledInstance(ScreenW,ScreenH, java.awt.Image.SCALE_SMOOTH);
        BackgroundImage = new ImageIcon(ModifiedBImage);
        
        BackgroundPanel = new JPanel();
        BackgroundPanel.setBounds(0, 0, ScreenW, ScreenH);
        
        
        BackgroundLabel = new JLabel("",BackgroundImage,JLabel.CENTER);
        BackgroundLabel.setBounds(0, 0, ScreenW, ScreenH);
        BackgroundPanel.add(BackgroundLabel);
        
        //Title
        TitlePanel = new JPanel();
        TitlePanel.setBounds(xTP, yTP, WTP, HTP);
        TitlePanel.setBackground(Color.black);
        TitlePanel.setOpaque(false);
        screen.add(TitlePanel);
        
        TitleLabel = new JLabel("The Lost Item");
        TitleLabel.setForeground(Color.white);
        TitleLabel.setFont(TitleFont);
        TitlePanel.add(TitleLabel);
        screen.add(BackgroundPanel);

        StartPanel = new JPanel();
        StartPanel.setBounds(xSB, ySB, WSB, HSB);
        StartPanel.setBackground(Color.black);
        screen.add(StartPanel);
        
        StartButton = new JButton("Start");
        StartButton.setBackground(Color.black);
        StartButton.setForeground(Color.white);
        StartButton.setFont(NormalFont);
        StartButton.setFocusPainted(false);
        StartButton.setOpaque(false);
        StartButton.addActionListener(cHandler);
        StartButton.setActionCommand("Start");
        StartPanel.add(StartButton);
        
        //InGameScreen
        //Story Text
        TextPanel = new JPanel();
        TextPanel.setBounds(xSP, ySP, WSP, HSP);
        TextPanel.setBackground(Color.gray);
        TextPanel.setOpaque(false);
        screen.add(TextPanel);
        
        StoryText = new JTextArea("Story will be put here!!");
        StoryText.setBounds(xSP, ySP, WSL, HSL);
        StoryText.setBackground(Color.black);
        StoryText.setForeground(Color.white);
        StoryText.setFont(NormalFont);
        StoryText.setOpaque(false);
        StoryText.setLineWrap(true);
        StoryText.setWrapStyleWord(true);
        StoryText.setEditable(false);
        TextPanel.add(StoryText);
        
        //Story Image
        SceneImage = new ImageIcon(".//res//ScaryBook.jpg");
        
        Image SImage = SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(WSI,HSI, java.awt.Image.SCALE_SMOOTH);
        SceneImage = new ImageIcon(ModifiedSImage);
        
        GImagePanel = new JPanel();
        GImagePanel.setBounds(xSI, 0, WSI, HSI);
        GImagePanel.setBackground(Color.white);
        screen.add(GImagePanel);
        
        GImageLabel = new JLabel("",SceneImage,JLabel.CENTER);
        GImagePanel.add(GImageLabel);
        
        //Choice Button 
        ChoicePanel = new JPanel();
        ChoicePanel.setBounds(xCP, yCP, WCP, HCP);
        ChoicePanel.setBackground(Color.white);
        ChoicePanel.setLayout(new GridLayout(4,1));
        screen.add(ChoicePanel);
        
        ChoiceButton1 = new JButton("c1");
        ChoiceButton1.setBackground(Color.black);
        ChoiceButton1.setForeground(Color.white);
        ChoiceButton1.setFont(NormalFont);
        ChoiceButton1.setFocusPainted(false);
        ChoiceButton1.addActionListener(cHandler);
        ChoiceButton1.setActionCommand("c1");
        ChoicePanel.add(ChoiceButton1);
        
        ChoiceButton2 = new JButton("c2");
        ChoiceButton2.setBackground(Color.black);
        ChoiceButton2.setForeground(Color.white);
        ChoiceButton2.setFont(NormalFont);
        ChoiceButton2.setFocusPainted(false);
        ChoiceButton2.addActionListener(cHandler);
        ChoiceButton2.setActionCommand("c2");
        ChoicePanel.add(ChoiceButton2);
        
        ChoiceButton3 = new JButton("c3");
        ChoiceButton3.setBackground(Color.black);
        ChoiceButton3.setForeground(Color.white);
        ChoiceButton3.setFont(NormalFont);
        ChoiceButton3.setFocusPainted(false);
        ChoiceButton3.addActionListener(cHandler);
        ChoiceButton3.setActionCommand("c3");
        ChoicePanel.add(ChoiceButton3);
        
        ChoiceButton4 = new JButton("c4");
        ChoiceButton4.setBackground(Color.black);
        ChoiceButton4.setForeground(Color.white);
        ChoiceButton4.setFont(NormalFont);
        ChoiceButton4.setFocusPainted(false);
        ChoiceButton4.addActionListener(cHandler);
        ChoiceButton4.setActionCommand("c4");
        ChoicePanel.add(ChoiceButton4);
        
        screen.setVisible(true);
    }
}
