 //declare bacteria variables here
 int [] Bacteria;
 Bacteria [] colony;
 int x;
 int y;
 boolean alive;
 color BacteriaColor = color(245, 147, 168);   
 void setup()   
 {     
 	//initialize bacteria variables here
 	//background(0);
 	size(400, 400);
 	colony = new Bacteria[1200];
 	for (int i=0; i<colony.length; i++)
 	{
 		colony[i]=new Bacteria(200,200);
 	} 
 	alive=true;
 }   
 void draw()   
 {    
 	//move and show the bacteria
 	background(0);
 	for (int i=0; i<colony.length; i++)
 	{
 		colony[i].move();
 		colony[i].show();
 	} 
 	fill(255, 0, 0);
 	ellipse(mouseX, mouseY, 10, 10);
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
 		}
 		if (alive==true)
 		{
		 	noStroke();
		 	fill(BacteriaColor);
		 	ellipse(myX, myY, 2, 2);
		 	fill(255,255,255,10);
		 	ellipse(myX, myY, 5, 5);
	 	}
 	}
 	void move()
 	{
	 		myX=myX+((int)((Math.random()*10)-5));
	 		myY=myY+((int)((Math.random()*10)-5));
 	}

 }    