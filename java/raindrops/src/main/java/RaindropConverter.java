class RaindropConverter {

     String convert(int number) {
			/* Description:  A program that converts a number to a string, the contents of which depend on the number's factors.
	
					Input:  An integer number
					Outputs: a string,
						- If the number has 3 as a factor, output  will include 'Pling'.
						- If the number has 5 as a factor, output will include 'Plang'.
						- If the number has 7 as a factor, output will include 'Plong'.
						- If the number does not have 3, 5, or 7 as a factor,
						  the program passes the number's digits straight through.
						  
						  Examples:
							convert (28)
							>> Plong
							
							convert(30)
							>> PlingPlang
							
							convert(34)
							>> 34
							
							Tests: 
							see /home/annblodgett/exercism/java/raindrops/src/test/java/RaindropConverterTest.java
							
							*/
		String output = "";
		
		if (number%3!=0 && number%5!=0 && number%7!=0)
		{
				output = Integer.toString(number);
				
		}
		else{
			if ( number%3==0) 
			{
				output = output+"Pling";
			}
			if ( number%5==0) 
			{
				output = output+"Plang";
			}
			if ( number%7==0) 
			{
				output = output+"Plong";
			}
		}
		
		return output;
	}
	
}
