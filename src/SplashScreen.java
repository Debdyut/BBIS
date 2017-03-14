
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SplashScreen extends JWindow {

    static boolean isRegistered;
    public static JProgressBar progressBar = new JProgressBar();
    public static SplashScreen execute;
    public static int count;
    public static Timer timer1;

    public SplashScreen() {
    	try{
        Container container = getContentPane();
        container.setLayout(null);
       
        String path = new File("").getAbsolutePath();
        
        BufferedImage img = ImageIO.read(new File(path + "\\src\\darah.png"));
		
        

        JPanel panel = new JPanel();
        panel.setBorder(new javax.swing.border.EtchedBorder());
        //panel.setBackground(Color.orange);
       
        panel.setBounds(0, 0, 380, 250);
        panel.setLayout(null);
        container.add(panel);

        JLabel label = new JLabel("Blood");
        label.setFont(new Font("Sathu", Font.BOLD, 15));
        label.setBounds(10, 125,300 , 20);
        panel.add(label);
        
        JLabel label6 = new JLabel("Bank");
        label6.setFont(new Font("Sathu", Font.BOLD, 15));
        label6.setBounds(10, 140,300 , 20);
        panel.add(label6);
        
        JLabel label4 = new JLabel("Information");
        label4.setFont(new Font("Sathu", Font.BOLD, 15));
        label4.setBounds(10, 155,300 , 20);
        panel.add(label4);
        
        JLabel label5 = new JLabel("System");
        label5.setFont(new Font("Sathu", Font.BOLD, 15));
        label5.setBounds(10, 170,300 , 20);
        panel.add(label5);
        
        JLabel label1 = new JLabel("copyright©2016");
        label1.setFont(new Font("Verdana", Font.PLAIN, 10));
        label1.setBounds(285, 1,100 , 15);
        panel.add(label1);
        
        JLabel label3 = new JLabel("All rights reserved");
        label3.setFont(new Font("Verdana", Font.PLAIN, 10));
        label3.setBounds(272, 13,200 , 15);
        panel.add(label3);

        JLabel label2 = new JLabel("Loading.....");
        label2.setFont(new Font("Verdana", Font.PLAIN, 11));
        label2.setBounds(10, 227,100 , 15);
        panel.add(label2);
        
        JLabel l2 = new JLabel(new ImageIcon(img));
        l2.setSize(380,243);
        panel.add(l2);

        progressBar.setMaximum(50);
        progressBar.setBounds(0, 243, 380, 7);
        container.add(progressBar);
        loadProgressBar();
        setSize(380, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void loadProgressBar() {
        ActionListener al = new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count++;

                progressBar.setValue(count);

                
                if (count == 70) {

                   // createDialog();

                    execute.setVisible(false);//swapped this around with timer1.stop()

                    timer1.stop();
                    
                    new StartApp();
                    
                }

            }

           // public void createDialog() throws HeadlessException {
                
                
           // }
        };
        timer1 = new Timer(50, al);
        timer1.start();
    }

    public static void main(String[] args) {
        execute = new SplashScreen();
    }
};