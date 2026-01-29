import java.util.Scanner;

public class sortArray{
	public static void main(String arg[]){
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter number of elements: ");
		  
		  int n = sc.nextInt();
		  int[] arr = new int[n];
		  
		  System.out.println("enter " + n +" integer");
		  for(int i = 0; i<n; i++){
			  arr[i] = sc.nextInt();			  
		  }
		  
		  
		  try{
			  for (int i=0; i<n; i++){
				  for(int j = i+1; j<n; j++){
					  
					  if(arr[i] > arr[j]){
					  int temp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = temp;
				  }
		      }
		  } 
				  
			System.out.println("write array in assending order : ");
            for(int i = 0 ; i<=n ; i++){
				System.out.println(arr[i] + " ");
				
			}			
				  
		  }catch(ArrayIndexOutOfBoundsException e){
			  
			  System.out.println("Exception cought " + e);
		  }
			  
	    }
	}