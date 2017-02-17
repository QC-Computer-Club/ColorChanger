import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import color.*;

public class ColorChange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ColorChange ia = new ColorChange();  
        JFrame frame = new JFrame("Tutorials");  
        ia.loadAndDisplayImage(frame);  
	}

	public static BufferedImage loadImage(String ref) {  
        BufferedImage bimg = null;  
        try {  
  
            bimg = ImageIO.read(new File(ref));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return bimg;  
    }  
    BufferedImage loadImg = null;

    public void loadAndDisplayImage(JFrame frame) {  
        // Load the img  
    	try {
    		loadImg = ImageIO.read(new File("E:\\Color\\bin\\color\\Untitled.png"));
    	} catch (IOException e) {
    	}
        frame.setBounds(0, 0, loadImg.getWidth(), loadImg.getHeight());  
        JImagePanel panel = new JImagePanel(loadImg, 0, 0);  
        frame.add(panel);  
        frame.setVisible(true);  
    }  
    
    
}

