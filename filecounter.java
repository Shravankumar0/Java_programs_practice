import java.io.*;

public class filecounter{
   public static void main(String arg[]) throws IOException{
   
		if(arg.length < 1){
		   System.out.println("usege: java filecounter myfile.txt");
		   return;
		}
   
   
    String myfile = arg[0];
    BufferedReader br = new BufferedReader(new FileReader(myfile));
    
    int charCount = 0 , wordCount=0, lineCount = 0;
    String line ;
	
	while((line = br.readLine()) != null){
	   lineCount++;
	   charCount += line.length();
       String[] words = line.trim().split("\\s+");
        if(!line.trim().isEmpty()){
		   wordCount += words.length;
		}	   
	}
	
	br.close();
	
	System.out.println("file: " + myfile);
	System.out.println("charcount: " + charCount);
	System.out.println("wordcount: " + wordCount);
	System.out.println("linecount: " + lineCount);
	
		
		
		
	}	
}
