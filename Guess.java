//Number Guessing Game in Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Guess extends JFrame{
    JTextField t1, t2, t3, t4;
    JLabel j4, j2, j3; 
    ButtonListener bl1;
    ButtonListener2 bl2;
    ButtonListener3 bl3;    
    JLabel bgimg;
    
    //setting random number in rand variable
    int rand=(int) (Math.random()*1000); 
    int count=0;

    public Guess(){
        //Get the container
        Container c = getContentPane();

        //Set absolute layout        
        c.setLayout(null);   

        //Set Background Color
        c.setBackground(Color.green);
        bgimg = new JLabel(new ImageIcon("C:\\Users\\Desktop\\RIVER.jpg"));
        c.add(bgimg);
        bgimg.setLayout(null);
        bgimg.setSize(750, 500);

        //Creating label Guess my number text
        JLabel j=new JLabel("GUESS MY NUMBER");
        j.setForeground(Color.blue);
        j.setFont(new Font("times new roman",Font.BOLD,30));
        j.setSize(300,40);
        j.setLocation(200,45);

        //Creating label Enter a number..... 
        JLabel j1=new JLabel("Guess a number between 1-1000");
        j1.setFont(new Font("times new roman",Font.ITALIC,20));
        j1.setSize(320,30);
        j1.setLocation(215,95);

        //Creating TextField for input guess
        t1=new JTextField(10);
        t1.setSize(60,30);
        t1.setLocation(320,165);

        //Creating Label for Display message        
        j4=new JLabel("Try and guess my number");
        j4.setFont(new Font("times new roman",Font.PLAIN,20));
        j4.setSize(320,30);
        j4.setLocation(250,125);

        //Creating Text field for best score
        t2=new JTextField(10);
        t2.setSize(40,20);
        t2.setLocation(10,10);        

        //Creating Label for best score
        JLabel j5=new JLabel("Best Score");
        j5.setForeground(Color.red);
        j5.setFont(new Font("times new roman",Font.BOLD,20));
        j5.setSize(270,20);
        j5.setLocation(60,10);

        //Creating guess text field
        t3=new JTextField(10);
        t3.setSize(40,20);
        t3.setLocation(500,10);
        
        //Creating guess Label
        JLabel j6=new JLabel("Guesses Remaining");
        j6.setForeground(Color.red);
        j6.setFont(new Font("times new roman",Font.BOLD,20));
        j6.setSize(270,20);
        j6.setLocation(550,10);

        //creating button for guessing
        JButton b1=new JButton("GUESS");
        b1.setBackground(Color.ORANGE);
        b1.setSize(125,35);
        b1.setLocation(290,225);
        bl1=new ButtonListener();        
        b1.addActionListener(bl1);

        //creating button for giveup
        JButton b2=new JButton("GIVE UP!");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setSize(125,40);
        b2.setLocation(125,350);
        bl2=new ButtonListener2();
        b2.addActionListener(bl2);        

        //creating button for retry
        JButton b3=new JButton("PLAY AGAIN");  
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);  
        b3.setSize(125,40);
        b3.setLocation(500,350);    
        bl3=new ButtonListener3();        
        b3.addActionListener(bl3);
        
        //creating label for hint
        j3 = new JLabel("");
        j3.setFont(new Font("times new roman", Font.ITALIC,20));
        j3.setSize(300,30);
        j3.setLocation(250, 275);        
        
        //Place the components in the pane
        bgimg.add(j5);    
        bgimg.add(j4);    
        bgimg.add(j);    
        bgimg.add(j1);
        bgimg.add(t1);
        bgimg.add(t2);
        bgimg.add(t3);
        bgimg.add(b1);    
        bgimg.add(b2);
        bgimg.add(b3);        
        bgimg.add(j6);
        bgimg.add(j3);

        //Changing TextFields to UnEditable
        t2.setEditable(false);
        t3.setEditable(false);   
        t3.setText("10");
        t2.setText("0");

        //Set the title of the window
        setTitle("GUESS MY NUMBER");        

        //Set the size of the window and display it
        setSize(750,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //performing action when number is guessed
    private class ButtonListener implements ActionListener{
        int bestScore=100;
        public void actionPerformed(ActionEvent e){
            int a = Integer.parseInt(t1.getText());
            if(count>9){      //maximum guess has reached
                if(a==rand){
                    j3.setText("CORRECT, YOU WIN!!!!");    
                    bestScore = (10-count)*100;
                    t2.setText(""+bestScore);
                    t1.setEditable(false);
                }
                else{
                    j4.setText("YOU LOST THE MATCH");
                    j3.setText(rand+" is the answer!");
                    t1.setEditable(false);
                }
            }
            else{
                if(a<rand){
                    j3.setText(a+" is too low, try again!!");
                }    
                else if(a>rand){
                    j3.setText(a+" is too high, try again!!");
                }
                else{
                    j3.setText("CORRECT, YOU WIN!!!!");    
                    bestScore = (10-count)*100;
                    t2.setText(""+bestScore);
                    t1.setEditable(false);
                }
            }
            //setting focus to input guess text field
            t1.requestFocus();
            t1.selectAll();
            count=count+1;
            t3.setText((10-count)+"");
        }
    }
    
    //shows the answer when given up
    private class ButtonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            t3.setText("");
            j3.setText(rand+" is the answer!");
            t1.setText("");
            t1.setEditable(false);
        }
    }  
    
    //game is played again
    private class ButtonListener3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            rand=(int) (Math.random()*100);
            t1.setText("");
            t3.setText("");
            j4.setText("Try and guess my number");
            t3.setText("");
            j3.setText("");
            count=0;
            t1.setEditable(true);    
            t1.requestFocus();
        }
    }
    
    //main method
    public static void main(String[] args){
        //calling the guess using constructor
        new Guess();
    }
}
