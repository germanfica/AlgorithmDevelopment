package xyz.germanfica.ad._2018._1st.test4;

public class ReverseString{
	
	private static  String reverse(String text, String reverseStr){
		char c = ' ';
		int i = 0;
		
	    if(text == null || text.length() == 0){
	        return text;
	    }
	    
	    c = text.charAt(i);
	    
	    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	    	text = text.substring(0,i) + '*' + text.substring(i+1);
		}
	    
	    System.out.println(reverseStr);
	    
	    return reverse(text.substring(1), text.charAt(0)+reverseStr);
	}
	
	public static void main(String [] args){
	    System.out.println(reverse("hello", "")); //output is "olleh"
	}
}