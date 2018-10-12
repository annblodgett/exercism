// Java program to ReverseString using StringBuilder 
import java.lang.*; 
import java.io.*; 
import java.util.*; 

class ReverseString {

    String reverse(String inputString) {
      
        String input = inputString;
  
        StringBuilder stringToChange = new StringBuilder(); 
  
        // append
      stringToChange.append(input); 
  
        // reverse 
        stringToChange = stringToChange.reverse(); 
  
        // return reversed String 
        return stringToChange.toString();
    }  

    }
  