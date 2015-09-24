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
 boolean alive=true;
 int Size=5;
 int BacteriaColor = color(245, 147, 168); 
 int BacteriaColor1 = color(147, 245, 168);
 int BacteriaColor2 = color(168, 147, 245);  
 public void setup()   
 {     
 	//initialize bacteria variables here
 	background(0);
 	size(400, 400);
 	colony = new Bacteria[10];
 	for (int i=0; i<colony.length; i++)
 	{
 		colony[i]=new Bacteria(200,200);
 	} 
 }   
 public void draw()   
 {    
 	//move and show the bacteria
// 	fill(255, 0, 0);
// 	ellipse(mouseX, mouseY, Size, Size);
 	for (int i=0; i<colony.length; i++)
 	{
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
 		if (get(myX,myY)==color(255,0,0))
 		{
 			alive=false;
 			Size++;
 		}
 		if (alive==true)
 		{
		 	noStroke();
		 	fill(BacteriaColor);
		 	ellipse(myX, myY, 2, 2);
		 	fill(255,255,255,10);
		 	ellipse(myX, myY, 7, 7);
		 	fill(BacteriaColor1);
		 	ellipse(myX+3, myY-3, 2, 2);
		 	fill(255,255,255,10);
		 	ellipse(myX+3, myY-3, 7, 7);
		 	fill(BacteriaColor2);
		 	ellipse(myX-3, myY+3, 2, 2);
		 	fill(255,255,255,10);
		 	ellipse(myX-3, myY+3, 7, 7);
		 	fill(BacteriaColor1);
		 	ellipse(myX+3, myY+3, 2, 2);
		 	fill(255,255,255,10);
		 	ellipse(myX+3, myY+3, 7, 7);
		 	fill(BacteriaColor2);
		 	ellipse(myX-3, myY-3, 2, 2);
		 	fill(255,255,255,10);
		 	ellipse(myX-3, myY-3, 7, 7);
	 	}
 	}
 	public void move()
 	{
		myX=myX+((int)((Math.random()*20)-10));
	 	myY=myY+((int)((Math.random()*20)-10));
	 	
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
