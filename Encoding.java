import java.util.*;
public class Encoding {
	public static void morseCodes(int m, int n)
	{
		int len = m+n;
		// First create a string with m dashes and n dots
		char a[] = new char[len];
		int idx = 0;
		while(m > 0)
		{
			a[idx] = '.';
			idx++;
			m--;
		}
		while(n > 0)
		{
			a[idx] = '-';
			idx++;
			n--;
		}
		TreeSet<String> result = new TreeSet<>(); // To store output strings (
		printPermutation(a, 0, len, result);
		//Print result
		for(String str : result)
	    {
	    	System.out.println(str);
	    }
	}
	
	private static void printPermutation(char[] a, int startIndex, int endIndex, TreeSet<String> result) {
	    if (startIndex == endIndex)//reached end of recursion, print the state of a
	    {
	        //System.out.println(new String(a));
	    	//String tmpStr = new String(a);
	    	//if(result.contains(tmpStr))
    		result.add(new String(a));
	    }
        else
        {
            //try to move the swap window from start index to end index
            //i.e 0 to a.length-1
            for (int x = startIndex; x < endIndex; x++) 
            {
                swap(a, startIndex, x);
                printPermutation(a, startIndex + 1, endIndex, result);
                swap(a, startIndex, x);
            }
        }
	}

	private static void swap(char[] a, int i, int x) {
	    char t = a[i];
	    a[i] = a[x];
	    a[x] = t;
	}
}
