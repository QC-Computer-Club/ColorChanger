

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
    
    
   
    public static void changeImage(BufferedImage original) {  
    //gets the dimensions of a picture.
        int width = original.getWidth();
        int height = original.getHeight();
        
        //Commands for creating a color you want to change to.
        //Color colorName=new Color(int r,int g,int blue,int alpha);
        Color colorName=new Color(255,145,0,255);
        
        //Changing the color of a pixel at that exact location.
        for(int x=0;x<width/2;x++)
        {
         for(int y=0;y<height/2;y++)
         {
         original.setRGB(x,y,colorName.getRGB());
         }
        }
        File outputfile = new File("C:\\Users\\Instructor\\Desktop\\Color\\saved.png");
        try{
         ImageIO.write(original, "png", outputfile);
        }
        catch (IOException e) {
         }
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
        changeImage(loadImg);
    }  
    
    
}

