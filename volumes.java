class box {
	double volume(double l , double w , double h){
		
		return l* w* h;
	}
	
}

public class volumes{
	public static void main(String [] arg){
		
		box box1 = new box();
		box box2 = new box();
		
		double vol1 = box1.volume(10.2,11.2,12.2);
	    double vol2 = box2.volume(10.2,12.2,13.2);
		 System.out.println(vol1);
		 System.out.println(vol2);
	}
	
}