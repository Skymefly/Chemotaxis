 //declare bacteria variables here
 Bacteria [] colony;
 int x;
 int y;
 boolean alive=true;
 int Size=5;
 color BacteriaColor = color(245, 147, 168); 
 color BacteriaColor1 = color(147, 245, 168);
 color BacteriaColor2 = color(168, 147, 245);  
 void setup()   
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
 void draw()   
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
 	void show()
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
 	void move()
 	{
		myX=myX+((int)((Math.random()*20)-10));
	 	myY=myY+((int)((Math.random()*20)-10));
	 	
 	}

 }    