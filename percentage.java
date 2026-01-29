import java.io.*;

public class percentage{
	public static void main(String arg []) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter your subjects : ");
		 int n = Integer.parseInt(br.readLine());
		 
		 int totalmarks = 0;
		 for (int i = 1 ; i <= n ; i++){
			 
			 System.out.println("Enter your marks : " + i);
			 int marks = Integer.parseInt(br.readLine());
			 totalmarks += marks;
		 }
		 
		 double percentage = (double) totalmarks/n;
		 System.out.println("totalmarks: "+totalmarks);
         System.out.println("percentage: "+percentage);

		 
		 
		
	}
	
}