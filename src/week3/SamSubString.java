/**
 * 
 */
package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author santhosh
 * Samantha and Sam are playing a game. They have ‘N’ balls in front of them, each ball numbered from 0 to 9, except the first ball which is numbered from 1 to 9. Samantha calculates all the sub-strings of the number thus formed, one by one. If the sub-string is S, Sam has to throw ‘S’ candies into an initially empty box. At the end of the game, Sam has to find out the total number of candies in the box, T. As T can be large, Samantha asks Sam to tell T % (109+7) instead. If Sam answers correctly, he can keep all the candies. Sam can’t take all this Maths and asks for your help.
Help him!
Input Format
A single line containing a string of numbers that appear on the first, second, third ball and so on.

Output Format
A single line which is the number of candies in the box, T % (109+7)

Constraints
1 ≤ N ≤ 2*105

Sample Input #00

16
Sample Output #00

23
Explanation #00

The substring of number 16 are 16, 1 and 6. Whose sum is 23.

 *
 */
public class SamSubString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		ArrayList<Long> subList=new ArrayList<Long>();
		long sum=0;
		for(int i=0;i<line.length();i++)
		{
			for(int j=1;j<=line.length()-i;j++)
			{
				sum+=Long.parseLong(line.substring(i,i+j));
			//System.out.println(line.substring(i,i+j));
			}
			//subList.add(line.split(i))
		}
		System.out.println(sum);
	}

}
