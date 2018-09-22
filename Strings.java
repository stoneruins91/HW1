
public class Strings {
	public static String uniqueLetters(String str)
	{
		//Compare each character with the string if match +1
		//it will match itself==> acceptable for counting is 1
		// if count = 1 add that string.char to answer
		//keep going with the rest
		if (str.length()==0)
		{
			return "your string is empty";
		}
		else
		{
			String stringanswer = "";
			int count;
			for (int i=0; i<str.length(); i++)
			{
				count =0;
				for (int j=0; j<str.length(); j++)
				{
					if (str.charAt(i)==str.charAt(j))
					{
						count ++;
					}
				}
				if (count ==1)
				{
					stringanswer += str.valueOf(str.charAt(i));
				}
			}
			return stringanswer;
		}
	}
}
