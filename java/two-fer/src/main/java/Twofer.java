class Twofer
 {
    String twofer(String name)
 {

       /*When X is a name or "you".

If the given name is "Alice", the result should be "One for Alice, one for me." If no name is given, the result should be "One for you, one for me." */

	if (name == null)
	{
		String noName = new String("One for you, one for me.");
		return noName;
   	 }
	else
	{
		String nameGiven = new String("One for "+name+", one for me.");
		return nameGiven;
	}
}
}
