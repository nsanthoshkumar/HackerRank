/**
 * 
 */
package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


/**
 * @author santhosh
 * Calculate GCD(1, 1) * GCD(1, 2) * … * GCD(1, M) * GCD(2, 1) * GCD(2, 2) * … * GCD(2, M) * … * GCD(N, 1) * GCD(N, 2) * … * GCD(N, M).
 *input 4 4
 *output 96
 */
public class GCDClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		System.out.println(line);
		String[] numbers=line.split(" ");
		BigInteger gcdVal = BigInteger.ONE;
		for(int i=1;i<=Integer.parseInt(numbers[0]);i++)
		{
			for(int j=1;j<=Integer.parseInt(numbers[1]);j++)
			{
				//Big Integer is used for storing large numbers
				BigInteger bg=new BigInteger(new Integer(i).toString());
				BigInteger bg1=new BigInteger(new Integer(j).toString());
				gcdVal=gcdVal.multiply(bg.gcd(bg1));
			}
		}
		System.out.println(gcdVal);

	}

}
