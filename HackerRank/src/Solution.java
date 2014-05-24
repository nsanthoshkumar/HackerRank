import java.io.*;
import java.util.ArrayList;
public class Solution {
	public static void main(String args[] ) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\santhosh\\MyTacks\\HackerRank\\src\\input.txt"));
		String line = null;
		//ArrayList<Double> al =new ArrayList<Double>();
		long x=-1,y=1,z=0,counter=0,i=0;
		//System.out.println(Long.MAX_VALUE);
		Long[]a=new Long[100000];
		String count = br.readLine();
		 while((line=br.readLine())!=null)
		{
			a[(int) i]=Long.parseLong(line);
			i++;
			//al.add(Double.parseDouble(line));
		} 
		/*a[0]=(long) 4;
		a[1]=8341170321L;
		a[2]=2370416826L;
		a[3]=49796557L;
		a[4]=5937368629L;*/ 
		 System.out.println("count"+a[0]);
		 System.out.println("value"+Math.sqrt(5*(8341170321L*8341170321L)+4));
		for(int testcase=(int) 1;testcase<=a[0];testcase++)
		{

			if(checkFibo(a[testcase]))
			{
				System.out.println("IsFibo");
			}
			else
				System.out.println("IsNotFibo");

		}
	}

	private static boolean checkFibo(double a) {

		double sum,diff;
		sum=5*(a*a);
		return perfectSquare((double)sum);

	}

	private static boolean perfectSquare(double sum) {

		boolean flag=false;
		double c=Math.sqrt(sum+4);	
		double d=Math.sqrt(sum-4);
		if((c*c)==sum+4||d*d==sum-4)
			return true;
		return false;	

	}
}