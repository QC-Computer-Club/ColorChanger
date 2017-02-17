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
    
    public static BufferedImage changeImage(BufferedImage original) {  
        int width = original.getWidth();
        int height = original.getHeight();
        
        //Commands for creating a color you want to change to.
        //Color colorName=new Color(int r,int g,int blue);
        //Color colorName=new Color(int red,int green,int blue,int alpha);
        
        //Changing the color of a pixel at that exact location.
        //image.setrgb(x,y,colorName)
        File outputfile = new File("saved.png");
        ImageIO.write(original, "png", outputfile);
    }  
    
    
    BufferedImage loadImg = null;

    public void loadAndDisplayImage(JFrame frame) {  
        // Load the img  
    	try {
      
      //Change the read in location.
    		loadImg = ImageIO.read(new File("C:\\Users\\Instructor\\Desktop\\Color\\download.png"));
    	} catch (IOException e) {
    	}
        frame.setBounds(0, 0, loadImg.getWidth(), loadImg.getHeight());  
        JImagePanel panel = new JImagePanel(loadImg, 0, 0);  
        frame.add(panel);  
        frame.setVisible(true);  
    }  
}

