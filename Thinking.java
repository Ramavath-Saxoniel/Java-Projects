//I will guess your number game

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Thinking extends JFrame{
    JLabel l1,l2,l3;
    JLabel ask, bgimgans;
    JButton play_again;
    JButton yes1, yes2, yes3, yes4, yes5, no1, no2, no3, no4, no5;
    JFrame frame, A, B, C, D, E, answer;
    ButtonListener yesno;
    int count = 0;
    JButton play, end;
    
    //creating the opening window of the game
    public Thinking(){
        frame = new JFrame("I GUESS YOUR NUMBER");
        frame.setSize(700, 750);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        yesno = new ButtonListener();
        l1 = new JLabel("I CAN GUESS YOUR NUMBER GAME");
        l1.setFont(new Font("algerian", Font.BOLD, 30));
        l1.setForeground(Color.RED);
        l1.setSize(530, 30);
        l1.setLocation(75, 75);
        
        l2 = new JLabel("Think a number between 1 to 15");
        l2.setFont(new Font("algerian", Font.ITALIC, 25));
        l2.setSize(500, 25);
        l2.setLocation(125, 300);
        
        l3 = new JLabel(" and Start the Game:");
        l3.setFont(new Font("algerian", Font.ITALIC, 25));
        l3.setSize(300, 25);
        l3.setLocation(175, 350);
        
        play = new JButton("START");
        play.setFont(new Font("algerian", Font.PLAIN, 20));
        play.setBackground(Color.black);
        play.setForeground(Color.white);
        play.setSize(125, 40);
        play.setLocation(100, 600);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A.setVisible(true);
            }
        });
        
        end = new JButton("CLOSE");
        end.setFont(new Font("algerian", Font.PLAIN, 20));
        end.setBackground(Color.black);
        end.setForeground(Color.white);
        end.setSize(125, 40);
        end.setLocation(450, 600);
        end.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
        
        JLabel bgimg = new JLabel(new ImageIcon("C:\\Users\\regjo\\Desktop\\saxonielfolder\\RIVER.jpg"));
        frame.add(bgimg);
        bgimg.setLayout(null);
        bgimg.setSize(700, 750);
        bgimg.add(l1);
        bgimg.add(l2);
        bgimg.add(l3);
        bgimg.add(play);
        bgimg.add(end);
        
        frame.setVisible(true);
    
        A = new JFrame("Search your number");
        A.setSize(600, 750);
        A.setLayout(null);
        
        JLabel num11 = new JLabel("1");
        JLabel num14 = new JLabel("4");
        JLabel num18 = new JLabel("8");
        JLabel num110 = new JLabel("10");
        JLabel num111 = new JLabel("11");
        JLabel num112 = new JLabel("12");
        JLabel num113 = new JLabel("13");
        JLabel num115 = new JLabel("15");
        
        ask = new JLabel("Is your number present here?");
        ask.setFont(new Font("algerian", Font.ITALIC, 30));
        ask.setForeground(Color.red);
        ask.setSize(500, 40);
        ask.setLocation(65, 60);
        
        num11.setSize(50, 30);
        num11.setLocation(250, 240);
        num11.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num14.setSize(50, 30);
        num14.setLocation(250, 360);
        num14.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num18.setSize(50, 30);
        num18.setLocation(250, 180);
        num18.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num110.setSize(50, 30);
        num110.setLocation(250, 120);
        num110.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num111.setSize(50, 30);
        num111.setLocation(250, 420);
        num111.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num112.setSize(50, 30);
        num112.setLocation(250, 300);
        num112.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num113.setSize(50, 30);
        num113.setLocation(250, 540);
        num113.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num115.setSize(50, 30);
        num115.setLocation(250, 480);
        num115.setFont(new Font("algerian", Font.ITALIC, 30));
        
        yes1 = new JButton("YES");
        yes1.setFont(new Font("algerian", Font.PLAIN, 20));
        yes1.setBackground(Color.MAGENTA);
        yes1.setForeground(Color.BLACK);
        yes1.setSize(125, 40);
        yes1.setLocation(85, 600);
        yes1.addActionListener(yesno);
        
        no1 = new JButton("NO");
        no1.setFont(new Font("algerian", Font.PLAIN, 20));
        no1.setBackground(Color.MAGENTA);
        no1.setForeground(Color.BLACK);
        no1.setSize(125, 40);
        no1.setLocation(375, 600);
        no1.addActionListener(yesno);
        
        JLabel bgimg1 = new JLabel(new ImageIcon("C:\\Users\\regjo\\Desktop\\lenovo tab backup;\\Pictures\\WallpaperExpert\\orsrc5543.jpg"));
        A.add(bgimg1);
        bgimg1.setLayout(null);
        bgimg1.setSize(600, 750);
        bgimg1.add(ask);
        bgimg1.add(num11);
        bgimg1.add(num14);
        bgimg1.add(num18);
        bgimg1.add(num110);
        bgimg1.add(num111);
        bgimg1.add(num112);
        bgimg1.add(num113);
        bgimg1.add(num115);
        bgimg1.add(yes1);
        bgimg1.add(no1);

        B = new JFrame("Search your number");
        B.setSize(600, 750);
        B.setLayout(null);
        
        JLabel num22 = new JLabel("2");
        JLabel num25 = new JLabel("5");
        JLabel num26 = new JLabel("6");
        JLabel num28 = new JLabel("8");
        JLabel num211 = new JLabel("11");
        JLabel num212 = new JLabel("12");
        JLabel num214 = new JLabel("14");
        JLabel num215 = new JLabel("15");
        
        ask = new JLabel("Is your number present here?");
        ask.setFont(new Font("algerian", Font.ITALIC, 30));
        ask.setForeground(Color.red);
        ask.setSize(500, 40);
        ask.setLocation(65, 60);
        
        num22.setSize(50, 30);
        num22.setLocation(250, 360);
        num22.setFont(new Font("algerian", Font.ITALIC, 30));
        num22.setForeground(Color.BLACK);
        
        num25.setSize(50, 30);
        num25.setLocation(250, 120);
        num25.setFont(new Font("algerian", Font.ITALIC, 30));
        num25.setForeground(Color.BLACK);
        
        num26.setSize(50, 30);
        num26.setLocation(250, 240);
        num26.setFont(new Font("algerian", Font.ITALIC, 30));
        num26.setForeground(Color.BLACK);
        
        num28.setSize(50, 30);
        num28.setLocation(250, 420);
        num28.setFont(new Font("algerian", Font.ITALIC, 30));
        num28.setForeground(Color.BLACK);
        
        num211.setSize(50, 30);
        num211.setLocation(250, 180);
        num211.setFont(new Font("algerian", Font.ITALIC, 30));
        num211.setForeground(Color.BLACK);
        
        num212.setSize(50, 30);
        num212.setLocation(250, 540);
        num212.setFont(new Font("algerian", Font.ITALIC, 30));
        num212.setForeground(Color.BLACK);
        
        num214.setSize(50, 30);
        num214.setLocation(250, 480);
        num214.setFont(new Font("algerian", Font.ITALIC, 30));
        num214.setForeground(Color.BLACK);
        
        num215.setSize(50, 30);
        num215.setLocation(250, 300);
        num215.setFont(new Font("algerian", Font.ITALIC, 30));
        num215.setForeground(Color.BLACK);
        
        yes2 = new JButton("YES");
        yes2.setFont(new Font("algerian", Font.PLAIN, 20));
        yes2.setBackground(Color.MAGENTA);
        yes2.setForeground(Color.BLACK);
        yes2.setSize(125, 40);
        yes2.setLocation(85, 600);
        yes2.addActionListener(yesno);
        
        no2 = new JButton("NO");
        no2.setFont(new Font("algerian", Font.PLAIN, 20));
        no2.setBackground(Color.MAGENTA);
        no2.setForeground(Color.BLACK);
        no2.setSize(125, 40);
        no2.setLocation(375, 600);
        no2.addActionListener(yesno);
        
        JLabel bgimg2 = new JLabel(new ImageIcon("C:\\Users\\regjo\\Desktop\\lenovo tab backup;\\Pictures\\WallpaperExpert\\orsrc5543.jpg"));
        B.add(bgimg2);
        bgimg2.setLayout(null);
        bgimg2.setSize(600, 750);
        bgimg2.add(ask);
        bgimg2.add(num22);
        bgimg2.add(num25);
        bgimg2.add(num26);
        bgimg2.add(num28);
        bgimg2.add(num211);
        bgimg2.add(num212);
        bgimg2.add(num214);
        bgimg2.add(num215);
        bgimg2.add(yes2);
        bgimg2.add(no2);

        C = new JFrame("Search your number");
        C.setSize(600, 750);
        C.setLayout(null);
        
        JLabel num33 = new JLabel("3");
        JLabel num34 = new JLabel("4");
        JLabel num35 = new JLabel("5");
        JLabel num37 = new JLabel("7");
        JLabel num311 = new JLabel("11");
        JLabel num313 = new JLabel("13");
        JLabel num314 = new JLabel("14");
        JLabel num315 = new JLabel("15");
        
        ask = new JLabel("Is your number present here?");
        ask.setFont(new Font("algerian", Font.ITALIC, 30));
        ask.setForeground(Color.red);
        ask.setSize(500, 40);
        ask.setLocation(65, 60);
        
        num33.setSize(50, 30);
        num33.setLocation(250, 480);
        num33.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num34.setSize(50, 30);
        num34.setLocation(250, 180);
        num34.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num35.setSize(50, 30);
        num35.setLocation(250, 420);
        num35.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num37.setSize(50, 30);
        num37.setLocation(250, 360);
        num37.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num311.setSize(50, 30);
        num311.setLocation(250, 240);
        num311.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num313.setSize(50, 30);
        num313.setLocation(250, 120);
        num313.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num314.setSize(50, 30);
        num314.setLocation(250, 300);
        num314.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num315.setSize(50, 30);
        num315.setLocation(250, 540);
        num315.setFont(new Font("algerian", Font.ITALIC, 30));
        
        yes3 = new JButton("YES");
        yes3.setFont(new Font("algerian", Font.PLAIN, 20));
        yes3.setBackground(Color.MAGENTA);
        yes3.setForeground(Color.BLACK);
        yes3.setSize(125, 40);
        yes3.setLocation(85, 600);
        yes3.addActionListener(yesno);
        
        no3 = new JButton("NO");
        no3.setFont(new Font("algerian", Font.PLAIN, 20));
        no3.setBackground(Color.MAGENTA);
        no3.setForeground(Color.BLACK);
        no3.setSize(125, 40);
        no3.setLocation(375, 600);
        no3.addActionListener(yesno);
        
        JLabel bgimg3 = new JLabel(new ImageIcon("C:\\Users\\regjo\\Desktop\\lenovo tab backup;\\Pictures\\WallpaperExpert\\orsrc5543.jpg"));
        C.add(bgimg3);
        bgimg3.setLayout(null);
        bgimg3.setSize(600, 750);
        bgimg3.add(ask);
        bgimg3.add(num33);
        bgimg3.add(num34);
        bgimg3.add(num35);
        bgimg3.add(num37);
        bgimg3.add(num311);
        bgimg3.add(num313);
        bgimg3.add(num314);
        bgimg3.add(num315);
        bgimg3.add(yes3);
        bgimg3.add(no3);

        D = new JFrame("Search your number");
        D.setSize(600, 750);
        D.setLayout(null);
        
        JLabel num46 = new JLabel("6");
        JLabel num47 = new JLabel("7");
        JLabel num49 = new JLabel("9");
        JLabel num410 = new JLabel("10");
        JLabel num412 = new JLabel("12");
        JLabel num413 = new JLabel("13");
        JLabel num414 = new JLabel("14");
        JLabel num415 = new JLabel("15");
        
        ask = new JLabel("Is your number present here?");
        ask.setFont(new Font("algerian", Font.ITALIC, 30));
        ask.setForeground(Color.red);
        ask.setSize(500, 40);
        ask.setLocation(65, 60);
        
        num46.setSize(50, 30);
        num46.setLocation(250, 480);
        num46.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num47.setSize(50, 30);
        num47.setLocation(250, 180);
        num47.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num49.setSize(50, 30);
        num49.setLocation(250, 360);
        num49.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num410.setSize(50, 30);
        num410.setLocation(250, 240);
        num410.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num412.setSize(50, 30);
        num412.setLocation(250, 120);
        num412.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num413.setSize(50, 30);
        num413.setLocation(250, 540);
        num413.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num414.setSize(50, 30);
        num414.setLocation(250, 420);
        num414.setFont(new Font("algerian", Font.ITALIC, 30));
        
        num415.setSize(50, 30);
        num415.setLocation(250, 300);
        num415.setFont(new Font("algerian", Font.ITALIC, 30));
        
        
        yes4 = new JButton("YES");
        yes4.setFont(new Font("algerian", Font.PLAIN, 20));
        yes4.setBackground(Color.MAGENTA);
        yes4.setForeground(Color.BLACK);
        yes4.setSize(125, 40);
        yes4.setLocation(85, 600);
        yes4.addActionListener(yesno);
        
        no4 = new JButton("NO");
        no4.setFont(new Font("algerian", Font.PLAIN, 20));
        no4.setBackground(Color.MAGENTA);
        no4.setForeground(Color.BLACK);
        no4.setSize(125, 40);
        no4.setLocation(375, 600);
        no4.addActionListener(yesno);
        
        JLabel bgimg4 = new JLabel(new ImageIcon("C:\\Users\\regjo\\Desktop\\lenovo tab backup;\\Pictures\\WallpaperExpert\\orsrc5543.jpg"));
        D.add(bgimg4);
        bgimg4.setLayout(null);
        bgimg4.setSize(600, 750);
        bgimg4.add(ask);
        bgimg4.add(num46);
        bgimg4.add(num47);
        bgimg4.add(num49);
        bgimg4.add(num410);
        bgimg4.add(num412);
        bgimg4.add(num413);
        bgimg4.add(num414);
        bgimg4.add(num415);
        bgimg4.add(yes4);
        bgimg4.add(no4);

        E = new JFrame("Search your number");
        E.setSize(600, 750);
        E.setLayout(null);
        
        JLabel num58 = new JLabel("8");
        JLabel num59 = new JLabel("9");
        JLabel num510 = new JLabel("10");
        JLabel num511 = new JLabel("11");
        JLabel num512 = new JLabel("12");
        JLabel num513 = new JLabel("13");
        JLabel num514 = new JLabel("14");
        JLabel num515 = new JLabel("15");
        
        ask = new JLabel("Is your number present here?");
        ask.setFont(new Font("algerian", Font.ITALIC, 30));
        ask.setForeground(Color.red);
        ask.setSize(500, 40);
        ask.setLocation(65, 60);
        
        num58.setSize(50, 30);
        num58.setLocation(250, 300);
        num58.setFont(new Font("algerian", Font.ITALIC, 30));
        num58.setForeground(Color.BLACK);
        
        num59.setSize(50, 30);
        num59.setLocation(250, 240);
        num59.setFont(new Font("algerian", Font.ITALIC, 30));
        num59.setForeground(Color.BLACK);
        
        num510.setSize(50, 30);
        num510.setLocation(250, 540);
        num510.setFont(new Font("algerian", Font.ITALIC, 30));
        num510.setForeground(Color.BLACK);
        
        num511.setSize(50, 30);
        num511.setLocation(250, 420);
        num511.setFont(new Font("algerian", Font.ITALIC, 30));
        num511.setForeground(Color.BLACK);
        
        num512.setSize(50, 30);
        num512.setLocation(250, 180);
        num512.setFont(new Font("algerian", Font.ITALIC, 30));
        num512.setForeground(Color.BLACK);
        
        num513.setSize(50, 30);
        num513.setLocation(250, 360);
        num513.setFont(new Font("algerian", Font.ITALIC, 30));
        num513.setForeground(Color.BLACK);
        
        num514.setSize(50, 30);
        num514.setLocation(250, 480);
        num514.setFont(new Font("algerian", Font.ITALIC, 30));
        num514.setForeground(Color.BLACK);
        
        num515.setSize(50, 30);
        num515.setLocation(250, 120);
        num515.setFont(new Font("algerian", Font.ITALIC, 30));
        num515.setForeground(Color.BLACK);
        
        yes5 = new JButton("YES");
        yes5.setFont(new Font("algerian", Font.PLAIN, 20));
        yes5.setBackground(Color.MAGENTA);
        yes5.setForeground(Color.BLACK);
        yes5.setSize(125, 40);
        yes5.setLocation(85, 600);
        yes5.addActionListener(yesno);
        
        no5 = new JButton("NO");
        no5.setFont(new Font("algerian", Font.PLAIN, 20));
        no5.setBackground(Color.MAGENTA);
        no5.setForeground(Color.BLACK);
        no5.setSize(125, 40);
        no5.setLocation(375, 600);
        no5.addActionListener(yesno);
        
        JLabel bgimg5 = new JLabel(new ImageIcon("C:\\Users\\regjo\\Desktop\\lenovo tab backup;\\Pictures\\WallpaperExpert\\orsrc5543.jpg"));
        E.add(bgimg5);
        bgimg5.setLayout(null);
        bgimg5.setSize(600, 750);
        bgimg5.add(ask);
        bgimg5.add(num58);
        bgimg5.add(num59);
        bgimg5.add(num510);
        bgimg5.add(num511);
        bgimg5.add(num512);
        bgimg5.add(num513);
        bgimg5.add(num514);
        bgimg5.add(num515);
        bgimg5.add(yes5);
        bgimg5.add(no5);
    
        answer = new JFrame("Found your number");
        answer.setSize(600, 750);
        answer.setLayout(null);
        
        play_again = new JButton("PLAY AGAIN");
        play_again.setFont(new Font("algerian", Font.PLAIN, 20));
        play_again.setBackground(Color.BLACK);
        play_again.setForeground(Color.MAGENTA);
        play_again.setSize(175, 40);
        play_again.setLocation(175, 600);
        play_again.addActionListener(yesno);
        
        JLabel greet = new JLabel("Hey! I'm Genius");
        greet.setFont(new Font("Algerian", Font.BOLD, 30));
        greet.setForeground(Color.BLACK);
        greet.setSize(500, 50);
        greet.setLocation(150, 100);
        
        JLabel found = new JLabel("I found your number");
        found.setFont(new Font("times new roman", Font.ITALIC, 30));
        found.setForeground(Color.BLACK);
        found.setSize(600, 40);
        found.setLocation(150, 250);

        bgimgans = new JLabel(new ImageIcon("C:\\Users\\regjo\\Desktop\\saxonielfolder\\RIVER.jpg"));
        answer.add(bgimgans);
        bgimgans.setLayout(null);
        bgimgans.setSize(600, 750);
        bgimgans.add(play_again);
        bgimgans.add(greet);
        bgimgans.add(found);
    }

    //implementing the actio when button is pushed
    private class ButtonListener implements ActionListener{
        JLabel ans = new JLabel("");
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==yes1){
                count = count+1;
                A.dispose();
                B.setVisible(true);
            }
            if(e.getSource()==no1){
                count = count+0;
                A.dispose();
                B.setVisible(true);
            }
            if(e.getSource()==yes2){
                count = count+2;
                B.dispose();
                C.setVisible(true);
            }
            if(e.getSource()==no2){
                count = count+0;
                B.dispose();
                C.setVisible(true);
            }
            if(e.getSource()==yes3){
                count = count+3;
                C.dispose();
                D.setVisible(true);
            }
            if(e.getSource()==no3){
                count = count+0;
                C.dispose();
                D.setVisible(true);
            }
            if(e.getSource()==yes4){
                count = count+4;
                D.dispose();
                E.setVisible(true);
            }
            if(e.getSource()==no4){
                count = count+0;
                D.dispose();
                E.setVisible(true);
            }
            if(e.getSource()==yes5){
                count = count+5;
                E.dispose();
                ans.setText("Your number is "+count);
                count = 0;
                answer.setVisible(true);
            }
            if(e.getSource()==no5){
                count = count+0;
                E.dispose();
                ans.setText("Your number is "+count);
                count = 0;
                answer.setVisible(true);
            }
            if(e.getSource()==play_again){
                answer.dispose();
            }
            ans.setFont(new Font("times new roman", Font.BOLD, 30));
            ans.setForeground(Color.MAGENTA);
            ans.setSize(500, 50);
            ans.setLocation(150, 400);
            bgimgans.add(ans);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Thinking();
    }
}
