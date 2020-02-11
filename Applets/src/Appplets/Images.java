package Appplets;

import java.applet.*;
import java.awt.*;
import java.net.*;

public class Images extends Applet {
	   private Image image;
	   private AppletContext context;
	   
	   public void init() {
	      context = this.getAppletContext();
	      String imageURL = this.getParameter("image");
	      if(imageURL == null) {
	         imageURL = "java.jpg";
	      }
	      try {
	         URL url = new URL(this.getDocumentBase(), imageURL);
	         image = context.getImage(url);
	      } catch (MalformedURLException e) {
	         e.printStackTrace();
	         // Display in browser status bar
	         context.showStatus("Could not load image!");
	      }
	   }
	   
	   public void paint(Graphics g) {
	      context.showStatus("Displaying image");
	      g.drawImage(image, 0, 0, 200, 84, null);
	      g.drawString("www.javalicense.com", 35, 100);
	   }  
	   /*<html>
   <title>The ImageDemo applet</title>
   <hr>
   <applet code = "ImageDemo.class" width = "300" height = "200">
      <param name = "image" value = "java.jpg">
   </applet>
   <hr>
</html>*/
	}
