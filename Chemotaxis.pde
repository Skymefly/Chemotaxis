 //declare bacteria variables here
 int [] Bacteria;
 Bacteria [] colony;
 int x;
 int y;
 color int BacteriaColor = color(245, 147. 168);   
 void setup()   
 {     
 	//initialize bacteria variables here
 	size(400, 400);
 	colony = new Bacteria[12];
 	for (int i=0; i<colony.length; i++)
 	{
 		colony[i]=new Bacteria();
 	}


 }   
 void draw()   
 {    
 	//move and show the bacteria
 	for (int i=0; i<colony.length; i++)
 	{
 		colony[i].move();
 		colony[i].show();
 	}   
 }  
 class Bacteria    
 {     
 	//lots of java!   
 }    