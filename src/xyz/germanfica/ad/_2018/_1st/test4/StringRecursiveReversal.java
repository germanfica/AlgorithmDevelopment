package xyz.germanfica.ad._2018._1st.test4;

public class StringRecursiveReversal {
	
    public String reverseString(String str){
    	String reverse = "";
    	
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
    
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("german"));
    }
}