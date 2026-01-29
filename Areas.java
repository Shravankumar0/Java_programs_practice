class squareArea{
     double Area (double side){
	  return side * side;
	 }
}

class cubeArea extends squareArea{
     double Area (double side){
	   return 6 *side * side;
	 }
}


public class Areas {
   public static void main(String arg[])
   {
      squareArea square = new squareArea();
	  cubeArea cube = new cubeArea();
	  
	  System.out.println("Area of square " + square.Area(5));
	  System.out.println("Area of cube " + cube.Area(6));
	  
	  
   
   }

}