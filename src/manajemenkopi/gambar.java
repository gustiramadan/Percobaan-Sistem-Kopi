/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenkopi;

/**
 *
 * @author fajarega
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class gambar extends JPanel {
    private Image image;
    public gambar(){
        image = new ImageIcon(getClass().getResource("/Gambar/Users.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics gd = (Graphics2D)g.create();
        gd.drawImage(image, 0,0,getWidth(),getHeight(), this);
        gd.dispose();
    }
}
