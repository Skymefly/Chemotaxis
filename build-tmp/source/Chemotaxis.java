import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 //declare bacteria variables here
 int [] Bacteria;
 Bacteria [] colony;
 int x;
 int y;
 boolean alive;
 int BacteriaColor = color(245, 147, 168);   
 public void setup()   
 {     
 	//initialize bacteria variables here
 	background(0);
 	size(400, 400);
 	colony = new Bacteria[120];
 	alive=true;

 }   
 public void draw()   
 {    
 	//move and show the bacteria
 	for (int i=0; i<colony.length; i++)
 	{
 		colony[i]=new Bacteria(200,200);
 		colony[i].move();
 		colony[i].show();
 	}   
 }  
 class Bacteria    
 {     
 	//lots of java!
 	int myX, myY;
 	Bacteria(int x, int y)
 	{
 		myX=x;
 		myY=y;
 	}
 	public void show()
 	{
 		if (get(myX,myY)!=color(0))
 		{
 			alive=false;
 		}
 		if (alive==true)
 		{
		 	noStroke();
		 	fill(BacteriaColor);
		 	ellipse(myX, myY, 10, 10);
	 	}
 	}
 	public void move()
 	{
	 		myX=myX+((int)(Math.random()*10));
	 		myY=myY+((int)(Math.random()*10));
 	}

 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
