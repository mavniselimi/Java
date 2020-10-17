/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzay.oyunu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author pc
 */
class Ates{
    private int x;
    private int y;

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
public class Oyun extends JPanel implements KeyListener,ActionListener {
    Timer timer=new Timer(4,this);
    private int gecen_sure=0;
    private int harcanan_mermi=0;
    private BufferedImage image;
    private BufferedImage image2;
    private BufferedImage image3;
    private ArrayList<Ates> atesler=new ArrayList<>();
    private int atesdirY=1;
    private int topX=0;
    private int topdirX=2;
    private int uzayGemisiX=0;
    private int dirUzayX=20;
    public boolean kontrolet(){
        for (Ates ates : atesler) {
            /*if (ates.getX()==topX && ates.getY()<=35) {
                JOptionPane.showMessageDialog(this,"D-dostum sen naptın\nYasin şu an çok öfkeli!\n(Atılan mermi sayısı==>"+harcanan_mermi+" Geçen Süre==>"+gecen_sure+")");
                setVisible(false);
                timer.stop();
                System.exit(0);
                
            }*/
            if(new Rectangle(ates.getX(),ates.getY(),10,10).intersects(new Rectangle(topX,50, 20, 20))||new Rectangle(ates.getX(),ates.getY(),10,10).intersects(new Rectangle(topX,70, 20, 20))||new Rectangle(ates.getX(),ates.getY(),10,10).intersects(new Rectangle(topX,30, 20, 20))){
                return true;
            }
        }
        return false;
    }

    public Oyun() {
        try {
            image=ImageIO.read(new FileImageInputStream(new File("efeamakafa.jpg")));
            image2=ImageIO.read(new FileImageInputStream(new File("yasinamakafa.jpg")));
            image3=ImageIO.read(new FileImageInputStream(new File("top.jpg")));

        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.white);
        timer.start();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }   
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.blue);
        g.fillOval(topX,70, 20, 20);
        g.drawImage(image2, topX, 20, image2.getWidth()/3,image2.getHeight()/3, this);
        g.drawImage(image, uzayGemisiX, 480,image.getWidth()/10,image.getHeight()/10,this);
        for (Ates ates : atesler) {
            if (ates.getY()<=0) {
                atesler.remove(ates);
            }
        }
        for (Ates ates : atesler) {
            g.drawImage(image3, ates.getX(),ates.getY(),image3.getWidth()/31,image3.getHeight()/31,this);
            //g.fillOval(ates.getX(), ates.getY(),10,10 );
        }
        
        if (kontrolet()) {
            timer.stop();
            JOptionPane.showMessageDialog(this,"D-dostum sen naptın\nYasin şu an çok öfkeli!\n Seni maçte çok pis yenicek dostum\n(Atılan mermi sayısı==>"+harcanan_mermi+" Geçen Süre==>"+gecen_sure/1000+")");
            System.exit(0);
            
        }
    }


    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
        
    }

    
    @Override
    public void keyPressed(KeyEvent e) {
        int c=e.getKeyCode();
        if (c==KeyEvent.VK_A) {
                if (uzayGemisiX<=0) {
                    uzayGemisiX=0;
                }
                else if (uzayGemisiX<=720) {
                    uzayGemisiX-=dirUzayX;
                }
            
        }
        else if (c==KeyEvent.VK_D) {
                if (uzayGemisiX>=720) {
                    uzayGemisiX=720;
                }
                else if (uzayGemisiX>=0) {
                    uzayGemisiX+=dirUzayX;
                }
            
        }
        else if (c==KeyEvent.VK_SHIFT) {
            atesler.add(new Ates(uzayGemisiX+17, 516));
            harcanan_mermi++;
            
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gecen_sure+=4;
        for (Ates ates : atesler) {
            ates.setY(ates.getY()- atesdirY);
        }
       topX+=topdirX;
        if (topX>=750) {
            topdirX=-topdirX;
        }
        if (topX<=0) {
            topdirX=-topdirX;
        }
        repaint();
    }
    
}
