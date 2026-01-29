public class stringdemo{
   public static void main(String arg[]){
   // Immutable string
   String str ="Hello";
   System.out.println("original string :" +str);
   str.concat("world");
   System.out.println("after concat string :" +str);
			
	//mutable string		
	StringBuffer sb = new StringBuffer("hello  ");
    System.out.println("original string : " + sb);

    sb.append("world");
    System.out.println("aftrm append : " + sb);
  
  //mutable stringbuilder
    StringBuilder sbd = new StringBuilder("Hello");
    System.out.println("original string : " + sbd);
    
    sbd.insert(5, "java");
  System.out.println("after insert  : "+ sbd ); 	
   

   String text = "java programs ";
   System.out.println(text);
   System.out.println("Length : " + text.length());
   System.out.println(text);
   System.out.println("uppercase : " + text.toUpperCase());	
   System.out.println(text);
   System.out.println("Lowercase: " + text.toLowerCase());
   System.out.println(text);
   System.out.println("substring: " + text.substring(3, 7));
   System.out.println(text);
   System.out.println("Lowercase: " + text.replace("o" , "a"));
   System.out.println(text);
   System.out.println("Lowercase: " + text.indexOf("r"));
   System.out.println(text);
  }
}